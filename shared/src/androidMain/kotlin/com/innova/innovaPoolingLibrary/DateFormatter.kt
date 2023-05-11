package com.innova.innovaPoolingLibrary

import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

actual class DateFormatter {
    var selectedDate = Date()
    actual fun getFormattedDate(): String {
        var formattedDate = ""
        try {
            formattedDate =
                SimpleDateFormat(dateUtilities.outputDateFormat, Locale.getDefault()).format(
                    selectedDate
                )
        } catch (e: Exception) {
            Log.e("Simple date format exception occur due to -> ", e.toString())
        }
        return formattedDate
    }
}