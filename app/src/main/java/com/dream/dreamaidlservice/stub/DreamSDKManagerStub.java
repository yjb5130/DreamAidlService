package com.dream.dreamaidlservice.stub;

import android.content.Context;
import android.os.RemoteException;

import com.dream.platform.IDreamSDKManager;
import com.dream.platform.IDreamTestAidl;

public class DreamSDKManagerStub extends IDreamSDKManager.Stub {

    private Context mContext;

    private DreamTestApiStub mDreamTestApiStub;

    public DreamSDKManagerStub(Context context) {
        mContext = context;
    }

    @Override
    public IDreamTestAidl getDreamTestApi() throws RemoteException {
        if (mDreamTestApiStub == null) {
            mDreamTestApiStub = new DreamTestApiStub();
        }
        return mDreamTestApiStub;
    }
}
