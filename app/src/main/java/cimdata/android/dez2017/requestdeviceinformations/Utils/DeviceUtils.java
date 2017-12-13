package cimdata.android.dez2017.requestdeviceinformations.Utils;

import android.os.Build;

/**
 * Created by Student on 13.12.2017.
 */

public class DeviceUtils {

    public static String getMaufactory() {
        String manfactorer = Build.MANUFACTURER;
        return manfactorer;

    }
public static String getModel (){
        String getModel = Build.MODEL;
        return getModel;
}


}

