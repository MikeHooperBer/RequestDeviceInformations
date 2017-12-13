package cimdata.android.dez2017.requestdeviceinformations.Utils;

import android.os.Build;

/**
 * Created by Student on 13.12.2017.
 */

public class ApiUtility {


    public static int getApiLevel (){
        int level = Build.VERSION.SDK_INT;
        return level;
    }


    public static String getReleaseCode(){
        String code = Build.VERSION.RELEASE;
        return code;
    }



}
