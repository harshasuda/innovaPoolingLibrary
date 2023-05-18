package com.innova.innovaPoolingLibrary.utils.regexUtils

class RegexUtils {


    private val regexStateRegistration ="^[A-Z]{2}\\s[0-9]{2}\\s[A-Z]{2}\\s[0-9]{4}\$" /*"^[A-Z]{2}[ -][0-9][ -]{1,2}[ -][A-Z]{1,2}[ -][0-9]{4}\$"*//*"^[A-Z]{2}[\\\\ -]?\\d{2}[\\\\ -]?[A-Z]{1,2}[\\\\ -]?\\d{4}\$"*/
    private val regexBharatRegistration = "^\\d{2}\\sBH{1,2}\\s\\d{4}\\s[^IO]{2}\$"
    private val mobilePattern = "^(\\+91[\\-\\s]?)?[0]?(91)?[6789]\\d{9}\$"
    private val emailPattern = "^[a-z.]+@(innovasolutions)\\.com\$"

    fun isPhoneNumberValid(phoneNumber: String) = phoneNumber.matches(Regex(mobilePattern))

    fun isEmailValid(email: String) = email.matches(Regex(emailPattern))

    fun isVehicleNumberValid(vehicleNumber: String) : Boolean{
        return vehicleNumber.matches(Regex(regexStateRegistration)) ||
                vehicleNumber.matches(Regex(regexBharatRegistration))
    }
}
