package com.dream.platform.stub;

import android.content.Context;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;

import com.dream.platform.IDreamCallbackListener;
import com.dream.platform.IDreamSDKManager;
import com.dream.platform.IDreamTestAidl;

public class DreamSDKManagerStub extends IDreamSDKManager.Stub {

    private final static String TAG = "DreamSDKManagerStub";

    private Context mContext;

    private DreamTestApiStub mDreamTestApiStub;
    private final RemoteCallbackList<IDreamCallbackListener> mCallback = new RemoteCallbackList<>();

    public DreamSDKManagerStub(Context context) {
        mContext = context;
    }

    synchronized public void doCallbackListener(int status) {
        final int N = mCallback.beginBroadcast();
        for (int i = 0; i < N; i++) {
            try {
                mCallback.getBroadcastItem(i).notifyMessage(status);
                Log.d(TAG, "packageName: " + mCallback.getBroadcastItem(i).toString());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        mCallback.finishBroadcast();
    }

    @Override
    public void registerCallbackListener(IDreamCallbackListener listener) throws RemoteException {
        if (listener != null) {
            mCallback.register(listener);
        }
    }

    @Override
    public void unregisterCallbackListener(IDreamCallbackListener listener) throws RemoteException {
        if (listener != null) {
            mCallback.unregister(listener);
        }
    }

    @Override
    public IDreamTestAidl getDreamTestApi() throws RemoteException {
        if (mDreamTestApiStub == null) {
            mDreamTestApiStub = new DreamTestApiStub(this);
        }
        return mDreamTestApiStub;
    }
}
