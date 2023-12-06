
package com.example.ein

import android.app.Application
import android.content.Context
import com.example.ein.utils.sdkinit.XBasicLibInit


class MyApp : Application() {
    var a = 0
    override fun onCreate() {
        super.onCreate()
        initLibs()
        a = 3

    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
    }

    private fun initLibs() {
        XBasicLibInit.init(this)
    }

    companion object {

        val isDebug: Boolean
            get() = true
    }

}