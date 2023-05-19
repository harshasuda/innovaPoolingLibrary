package com.innova.innovaPoolingLibrary

expect class DateTimeFormatter {
    //output date format = "MMM d"
    //output time format = "hh:mm a"
    fun <T> getFormattedDateTime(selectedDateTime: T, outputDateTimeFormat: String): String?
}