package com.dream.dreamaidlservice.stub;

import android.os.RemoteException;

import com.dream.platform.IDreamTestAidl;

public class DreamTestApiStub extends IDreamTestAidl.Stub {

    private int mAidlInt = 0;
    private byte mAidlByte = 0;

    @Override
    public int getAidlIntValue() throws RemoteException {
        return mAidlInt;
    }

    @Override
    public void setAidlIntValue(int value) throws RemoteException {
        mAidlInt = value;
    }

    @Override
    public byte getAidlByteValue() throws RemoteException {
        return mAidlByte;
    }

    @Override
    public void setAidlByteValue(byte value) throws RemoteException {
        mAidlByte = value;
    }
}
