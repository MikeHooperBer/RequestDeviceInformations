package cimdata.android.dez2017.requestdeviceinformations.Utils;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by Student on 13.12.2017.
 */

public class ScreenUtility {
    private double pxWith;
    private double pxHeight;
    private double dpWith;
    private double dpHeight;
    private double density;

    public double getPxWith() {
        return pxWith;
    }

    public void setPxWith(double pxWith) {
        this.pxWith = pxWith;
    }

    public double getPxHeight() {
        return pxHeight;
    }

    public void setPxHeight(double pxHeight) {
        this.pxHeight = pxHeight;
    }

    public double getDpWith() {
        return dpWith;
    }

    public void setDpWith(double dpWith) {
        this.dpWith = dpWith;
    }

    public double getDpHeight() {
        return dpHeight;
    }

    public void setDpHeight(double dpHeight) {
        this.dpHeight = dpHeight;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public ScreenUtility(Activity activity) {

        DisplayMetrics metrics = new DisplayMetrics();
        Display display = activity.getWindowManager().getDefaultDisplay();

        display.getMetrics(metrics);

        density = metrics.density;
        pxWith = metrics.widthPixels;
        pxHeight = metrics.heightPixels;
        dpWith = pxWith / density;
        dpHeight = pxHeight / density;
    }
}
