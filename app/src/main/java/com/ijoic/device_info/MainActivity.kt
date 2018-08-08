package com.ijoic.device_info

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val metrics = resources.displayMetrics

    // print simple device info:
    // sdk_int + screen_width + screen_height + density.
    val sb = StringBuilder()
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

    device_info.text = sb.toString()
  }

}
