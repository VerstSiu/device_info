package com.ijoic.device_info

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics
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
        .append(genSystemInfo())
        .append("\n")

        .append("Screen Size: ")
        .append(genScreenSizeInfo(metrics))
        .append("\n")

        .append("Density: ")
        .append(metrics.density)

    device_info.text = sb.toString()
  }

  private fun genSystemInfo(): String {
    val sdkInt = Build.VERSION.SDK_INT
    val sdkVersion = sdkInt2versionName(sdkInt)

    return "Android $sdkVersion(API $sdkInt)"
  }

  private fun sdkInt2versionName(sdkInt: Int) = when(sdkInt) {
    Build.VERSION_CODES.ECLAIR_MR1 -> "2.1"
    Build.VERSION_CODES.FROYO -> "2.2"
    Build.VERSION_CODES.GINGERBREAD -> "2.3"
    Build.VERSION_CODES.GINGERBREAD_MR1 -> "2.3.3"
    Build.VERSION_CODES.HONEYCOMB -> "3.0"
    Build.VERSION_CODES.HONEYCOMB_MR1 -> "3.1"
    Build.VERSION_CODES.HONEYCOMB_MR2 -> "3.2"
    Build.VERSION_CODES.ICE_CREAM_SANDWICH -> "4.0"
    Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1 -> "4.0.3"
    Build.VERSION_CODES.JELLY_BEAN -> "4.1"
    Build.VERSION_CODES.JELLY_BEAN_MR1 -> "4.2"
    Build.VERSION_CODES.JELLY_BEAN_MR2 -> "4.3"
    Build.VERSION_CODES.KITKAT -> "4.4"
    Build.VERSION_CODES.KITKAT_WATCH -> "4.4W"
    Build.VERSION_CODES.LOLLIPOP -> "5.0"
    Build.VERSION_CODES.LOLLIPOP_MR1 -> "5.1"
    Build.VERSION_CODES.M -> "6.0"
    Build.VERSION_CODES.N -> "7.0"
    Build.VERSION_CODES.N_MR1 -> "7.1.1"
    Build.VERSION_CODES.O -> "8.0"
    Build.VERSION_CODES.O_MR1 -> "8.1"
    28 -> "9.0"
    else -> "-"
  }

  private fun genScreenSizeInfo(metrics: DisplayMetrics): String {
    return "${metrics.heightPixels}x${metrics.widthPixels}"
  }

}
