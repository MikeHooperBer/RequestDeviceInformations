package cimdata.android.dez2017.requestdeviceinformations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import cimdata.android.dez2017.requestdeviceinformations.Utils.ApiUtility;
import cimdata.android.dez2017.requestdeviceinformations.Utils.DeviceUtils;
import cimdata.android.dez2017.requestdeviceinformations.Utils.ScreenUtility;

public class MainActivity extends AppCompatActivity {
    Button b1_button;
    TextView outputText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.b1_button);
    }

    public void b1_onClick(View v) {
        Toast.makeText(this, "Ich messe", Toast.LENGTH_SHORT).show();
        ScreenUtility screen = new ScreenUtility(this);


        int level = ApiUtility.getApiLevel();
        String code = ApiUtility.getReleaseCode();
        String manuf = DeviceUtils.getMaufactory();
        String model = DeviceUtils.getModel();
        double density = screen.getDensity();
        double pxHeight = screen.getPxHeight();
        double pxWidth = screen.getPxWith();

        double dpHeight = screen.getDpHeight();
        double dpWidth = screen.getDpWith();

        String out = "";
        out += "API: " + level + "\n";
        out += "Model :" + model + "\n";
        out += "Mau :" + manuf + "\n";
        out += "Density :" + density + "\n";

        out += "width px :" + pxWidth + "\n";
        out += "height px :" + pxHeight + "\n";

        out += "width dp :" + dpWidth + "\n";
        out += "height dp :" + dpHeight + "\n";

        outputText.setText(out);
    }
}
