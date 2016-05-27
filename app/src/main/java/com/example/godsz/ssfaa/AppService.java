package com.example.godsz.ssfaa;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class AppService extends Service {
    public AppService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new IASRB.Stub() {
            @Override
            public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

            }

            @Override
            public void setData(String data) throws RemoteException {

            }
        };
    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("Service started");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("Service destroyed");
    }
}
