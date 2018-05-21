package com.dream.dreamaidlservice.stub;

import android.os.RemoteException;

import com.dream.platform.IDreamTestAidl;

public class DreamTestApiStub extends IDreamTestAidl.Stub {

    private int mAidlInt = 0;

    @Override
    public int getAidlIntValue() throws RemoteException {
        return mAidlInt;
    }

    @Override
    public void setAidlIntValue(int value) throws RemoteException {
        mAidlInt = value;
    }
}
