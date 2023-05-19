package com.innova.innovaPoolingLibrary

actual class DateTimeFormatter {

    actual fun <T> getFormattedDateTime(
        selectedDateTime: T,
        outputDateTimeFormat: String,
    ): String? {
        val dateFormatter = NSDateFormatter()
        dateFormatter.dateFormat = outputDateTimeFormat
        return dateFormatter.stringFromDate(selectedDateTime as NSDate)
    }

}