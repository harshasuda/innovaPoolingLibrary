package com.innova.innovaPoolingLibrary.utils.regexUtils

class RegexUtilsClass {


    private val regexStateRegistration = "^[A-Z]{2}[\\\\ -]?\\d{2}[\\\\ -]?[A-Z]{1,2}[\\\\ -]?\\d{4}\$"
    private val regexBharatRegistration = "^\\d{2}[\\\\ -]?BH{1,2}[\\\\ -]?\\d{4}[\\\\ -]?[A-Z]{2}\$"
    private val mobilePattern = "[0-9]{10}"
    private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

    fun isPhoneNumberValid(phoneNumber: String) = phoneNumber.matches(Regex(mobilePattern))

    fun isEmailValid(email: String) = email.matches(Regex(emailPattern))

    fun isVehicleNumberValid(vehicleNumber: String) : Boolean{
        return vehicleNumber.matches(Regex(regexStateRegistration)) ||
                vehicleNumber.matches(Regex(regexBharatRegistration))
    }


}
