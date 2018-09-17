package com.chencha.characteristicandroid.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle

/**
 * Created by xiyuan on 2018/9/13.
 */

object Utils {

    fun startActivity(context: Context, bundle: Bundle?, activityClass: Class<*>?, closePreActivity: Boolean) {

        if (activityClass == null) {
            return
        }
        val intent = Intent(context, activityClass)
        if (bundle != null) {
            intent.putExtras(bundle)
        }
        context.startActivity(intent)
        if (closePreActivity) {
            (context as Activity).finish()
        }

    }
}
