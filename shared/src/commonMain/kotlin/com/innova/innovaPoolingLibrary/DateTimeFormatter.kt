package com.innova.innovaPoolingLibrary

val dateUtilities = DateUtilities()

class DateUtilities {
    var platformDate = DateFormatter()
    val outputDateFormat = "MMM d"

}

expect class DateFormatter() {
    fun getFormattedDate(): String
}