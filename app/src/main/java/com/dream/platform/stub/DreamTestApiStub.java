package com.dream.platform.stub;

import android.os.RemoteException;

import com.dream.platform.IDreamTestAidl;
import com.dream.platform.parcel.EntityBaseParcel;

public class DreamTestApiStub extends IDreamTestAidl.Stub {

    private DreamSDKManagerStub mSdkManager;

    private int mAidlInt = 0;
    private byte mAidlByte = 0;
    private String mAidlString = null;
    private byte[] mAidlBytes = null;
    private EntityBaseParcel mAidlBaseItem = null;

    public DreamTestApiStub(DreamSDKManagerStub sdkManager) {
        mSdkManager = sdkManager;
    }

    @Override
    public int getAidlIntValue() throws RemoteException {
        return mAidlInt;
    }

    @Override
    public void setAidlIntValue(int value) throws RemoteException {
        mAidlInt = value;
        if (mSdkManager != null) {
            mSdkManager.doCallbackListener(1);
        }
    }

    @Override
    public byte getAidlByteValue() throws RemoteException {
        return mAidlByte;
    }

    @Override
    public void setAidlByteValue(byte value) throws RemoteException {
        mAidlByte = value;
        if (mSdkManager != null) {
            mSdkManager.doCallbackListener(2);
        }
    }

    @Override
    public String getAidlString() throws RemoteException {
        return mAidlString;
    }

    @Override
    public void setAidlString(String string) throws RemoteException {
        mAidlString = string;
        if (mSdkManager != null) {
            mSdkManager.doCallbackListener(3);
        }
    }

    @Override
    public byte[] getAidlBytes() throws RemoteException {
        return mAidlBytes;
    }

    @Override
    public void setAidlBytes(byte[] value) throws RemoteException {
        mAidlBytes = value;
        if (mSdkManager != null) {
            mSdkManager.doCallbackListener(4);
        }
    }

    @Override
    public EntityBaseParcel getBaseParcel() throws RemoteException {
        return mAidlBaseItem;
    }

    @Override
    public void setBaseParcel(EntityBaseParcel item) throws RemoteException {
        mAidlBaseItem = item;
        if (mSdkManager != null) {
            mSdkManager.doCallbackListener(5);
        }
    }
}
