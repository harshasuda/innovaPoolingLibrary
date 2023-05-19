package com.innova.innovaPoolingLibrary

import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

actual class DateTimeFormatter {

    actual fun <T> getFormattedDateTime(
        selectedDateTime: T,
        outputDateTimeFormat: String,
    ): String? {

        return try {
            SimpleDateFormat(outputDateTimeFormat, Locale.getDefault()).format(selectedDateTime)
                .orEmpty()
        } catch (e: Exception) {
            null
        }
    }

}


