package com.innova.innovaPoolingLibrary

interface DateProtocol {
    fun getIosDate(): String
}

actual class DateFormatter {
    private lateinit var dateProtocol: DateProtocol

    fun setImplementation(protocol: DateProtocol) {
        dateProtocol = protocol
    }

    actual fun getFormattedDate(): String {
        return dateProtocol.getIosDate()
    }
}
