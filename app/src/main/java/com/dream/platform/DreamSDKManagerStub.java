package com.dream.platform;

import android.content.Context;
import android.os.RemoteException;

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
