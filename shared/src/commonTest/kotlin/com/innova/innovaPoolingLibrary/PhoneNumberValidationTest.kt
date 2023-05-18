package com.innova.innovaPoolingLibrary

import com.innova.innovaPoolingLibrary.utils.regexUtils.RegexUtils
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PhoneNumberValidationTest {

    lateinit var regexUtils: RegexUtils
    @BeforeTest
    fun setUp() {
        regexUtils = RegexUtils()
    }

    @Test
    fun `check phone number is valid`() {
        assertTrue(
            regexUtils.isPhoneNumberValid("6267035889"),
            "Check whether the mobile number is a valid Indian mobile number"
        )
    }

    @Test
    fun `check mobile number contains India Country Code`() {
        assertTrue(
            regexUtils.isPhoneNumberValid("+91-9826611673"),
            "Check whether a mobile number starts with India Country Code +91 "
        )
    }

    @Test
    fun `check input mobile number contains less then ten numbers`() {
        assertFalse(
            regexUtils.isPhoneNumberValid("84798728"),
            "Check mobile number contains less then ten digits"
        )
    }

    @Test
    fun `check input mobile number is empty string`() {
        assertFalse(
            regexUtils.isPhoneNumberValid(""),
            "Check whether mobile number string is empty or not"
        )
    }

    @Test
    fun `check whether a mobile number has a valid operator code`() {
        assertFalse(
            regexUtils.isPhoneNumberValid("1234567890"),
            "Check whether the mobile have a valid operator code which can start from any number between 6 to 9"
        )
    }

    @Test
    fun `check input mobile number string contain characters and integers both`() {
        assertFalse(
            regexUtils.isPhoneNumberValid("98yukti13"),
            "Check whether the input mobile number string contains any character or not"
        )
    }

    @Test
    fun `check input mobile number string contain character only`() {
        assertFalse(
            regexUtils.isPhoneNumberValid("yuktivyass"),
            "Check whether the input mobile number string contains characters only and no integer value"
        )
    }

}