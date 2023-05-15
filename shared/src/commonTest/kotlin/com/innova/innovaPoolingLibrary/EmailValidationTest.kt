package com.innova.innovaPoolingLibrary

import com.innova.innovaPoolingLibrary.utils.regexUtils.RegexUtils
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class EmailValidationTest {

    @Test
    fun `check email is valid`() {
        assertTrue(
            RegexUtils().isEmailValid("yukti.vyas@innovasolutions.com"),
            "Check whether the input email id is of valid email format"
        )
    }

    @Test
    fun `check email contains at the rate symbol `() {
        assertFalse(
            RegexUtils().isEmailValid("yuktivyas2000gmail.com"),
            "Check whether the email address contains '@' symbol or not"
        )
    }

    @Test
    fun `check email contains valid domain name `() {
        assertFalse(
            RegexUtils().isEmailValid("yuktivyas2000@acsicorp.com"),
            "Check whether email address have valid domain name or not"
        )
    }

    @Test
    fun `check email contains valid user name`() {
        assertFalse(
            RegexUtils().isEmailValid("yuktivyas@innovasolutions.com"),
            "Check whether email address have valid user name format"
        )
    }
}