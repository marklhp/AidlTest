package com.itheima.alipay;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class AlipayService extends Service {
    public AlipayService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return new PayController();
    }


    public boolean pay(float money){
        System.out.println("成功付款"+money);
        return true; }

    public class PayController extends AlipayRemoteService.Stub{

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public boolean forwardPayMoney(float money) throws RemoteException {
            return pay(money);
        }
    }
}
