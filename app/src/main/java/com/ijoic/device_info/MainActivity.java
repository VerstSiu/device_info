package com.ijoic.device_info;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView infoView = (TextView) findViewById(R.id.device_info);

    DisplayMetrics metrics = getResources().getDisplayMetrics();

    // print simple device info:
    // sdk_int + screen_width + screen_height + density.
    StringBuilder sb = new StringBuilder();
    sb
        .append("SDK: ")
        .append(Build.VERSION.SDK_INT)
        .append("\n")

        .append("Screen Width: ")
        .append(metrics.widthPixels)
        .append("\n")

        .append("Screen Height: ")
        .append(metrics.heightPixels)
        .append("\n")

        .append("Density: ")
        .append(metrics.density)
        .append("\n")
    ;

    infoView.setText(sb.toString());
  }

}
