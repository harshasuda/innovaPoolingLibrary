package com.innova.innovaPoolingLibrary

import java.text.SimpleDateFormat
import java.util.*

class AndroidPlatform : Platform {
    override val name: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}

actual fun getPlatform(): Platform = AndroidPlatform()