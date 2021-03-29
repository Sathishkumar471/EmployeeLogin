package com.example.employeelogin;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtils {
    static Context con;
    public static boolean isConnected(Context context) {
        con = context;
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null)
                for (int i = 0; i < info.length; i++)
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }

        }
        return false;
    }

    private static NetworkUtils gInstance;

    public static NetworkUtils getInstance(){
        if (gInstance == null){
            gInstance = new NetworkUtils();
        }
        return gInstance;
    }
}
