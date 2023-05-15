package com.innova.innovaPoolingLibrary

import com.innova.innovaPoolingLibrary.utils.regexUtils.RegexUtils
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class VehicleNumberValidationTest {

    @Test
    fun `check vehicle number is a valid Bharat series number`() {
        assertTrue(
            RegexUtils().isVehicleNumberValid("09 BH 1234 MP"),
            "Check whether vehicle number is of Bharat Series"
        )
    }

    @Test
    fun `check vehicle number is a valid normal vehicle number series`() {
        assertTrue(
            RegexUtils().isVehicleNumberValid("MP 09 AS 1234"),
            "Check whether vehicle number is of Normal Series"
        )
    }

    @Test
    fun `Check whether small letters are allowed in normal vehicle numbers`() {
        assertFalse(
            RegexUtils().isVehicleNumberValid("mp 09 as 1234"),
            "Testing whether a normal vehicle number series can contain small letters"
        )
    }

    @Test
    fun `Check whether small letters are allowed in bharat vehicle numbers`() {
        assertFalse(
            RegexUtils().isVehicleNumberValid("09 bh 1234 MP"),
            "Testing whether a normal vehicle number series can contain small letters"
        )
    }

    @Test
    fun `Check whether last alphabets of Bharat series can be 'I' and 'O'`() {
        assertFalse(
            RegexUtils().isVehicleNumberValid("09 BH 1234 IO"),
            "Testing whether we can have 'I' and 'O' as the last two alphabets in Bharat series number plate"
        )
    }
}