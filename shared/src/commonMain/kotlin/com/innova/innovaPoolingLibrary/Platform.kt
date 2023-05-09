package com.innova.innovaPoolingLibrary

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

class PhoneNumberEmailValidator() {
    private val mobilePattern = "[0-9]{10}"
    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    fun isPhoneNumberValid(phoneNumber: String) = phoneNumber.matches(Regex(mobilePattern))
    fun isEmailValid(email: String) = email.matches(Regex(emailPattern))
}