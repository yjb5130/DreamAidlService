package com.dream.platform.stub;

import android.os.RemoteException;

import com.dream.platform.IDreamTestAidl;
import com.dream.platform.parcel.EntityBaseParcel;

public class DreamTestApiStub extends IDreamTestAidl.Stub {

    private int mAidlInt = 0;
    private byte mAidlByte = 0;
    private String mAidlString = null;
    private byte[] mAidlBytes = null;
    private EntityBaseParcel mAidlBaseItem = null;

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

    @Override
    public String getAidlString() throws RemoteException {
        return mAidlString;
    }

    @Override
    public void setAidlString(String string) throws RemoteException {
        mAidlString = string;
    }

    @Override
    public byte[] getAidlBytes() throws RemoteException {
        return mAidlBytes;
    }

    @Override
    public void setAidlBytes(byte[] value) throws RemoteException {
        mAidlBytes = value;
    }

    @Override
    public EntityBaseParcel getBaseParcel() throws RemoteException {
        return mAidlBaseItem;
    }

    @Override
    public void setBaseParcel(EntityBaseParcel item) throws RemoteException {
        mAidlBaseItem = item;
    }
}
