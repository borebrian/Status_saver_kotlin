package com.farsheel.statussaver

import android.app.Application
import android.graphics.Typeface
class MyApplication: Application() {

    companion object {
        lateinit var fontRegular: Typeface
    }

    override fun onCreate() {
        super.onCreate()
        fontRegular = Typeface.createFromAsset(assets,"fonts/Chilanka-Regular.ttf")


    }

}