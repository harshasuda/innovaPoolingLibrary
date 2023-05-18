package com.innova.innovaPoolingLibrary

import com.innova.innovaPoolingLibrary.utils.regexUtils.RegexUtils
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class VehicleNumberValidationTest {

    lateinit var regexUtils: RegexUtils

    @BeforeTest
    fun setUp() {
        regexUtils = RegexUtils()
    }

    @Test
    fun `check vehicle number is a valid Bharat series number`() {
        assertTrue(
            regexUtils.isVehicleNumberValid("09 BH 1234 MP"),
            "Check whether vehicle number is of Bharat Series"
        )
    }

    @Test
    fun `check vehicle number is a valid normal vehicle number series`() {
        assertTrue(
            regexUtils.isVehicleNumberValid("MP 09 AS 1234"),
            "Check whether vehicle number is of Normal Series"
        )
    }

    @Test
    fun `check whether small letters are allowed in normal vehicle numbers`() {
        assertFalse(
            regexUtils.isVehicleNumberValid("mp 09 as 1234"),
            "Testing whether a normal vehicle number series can contain small letters"
        )
    }

    @Test
    fun `check whether small letters are allowed in bharat vehicle numbers`() {
        assertFalse(
            regexUtils.isVehicleNumberValid("09 bh 1234 MP"),
            "Testing whether a normal vehicle number series can contain small letters"
        )
    }

    @Test
    fun `check whether last alphabets of Bharat series can be 'I' and 'O'`() {
        assertFalse(
            regexUtils.isVehicleNumberValid("09 BH 1234 IO"),
            "Testing whether we can have 'I' and 'O' as the last two alphabets in Bharat series number plate"
        )
    }

    @Test
    fun `check whether white spaces are allowed in normal vehicle number`() {
        assertFalse(
            regexUtils.isVehicleNumberValid("MP09AS1234"),
            "Test whether white spaces are allowed in the normal vehicle number series"
        )
    }

    @Test
    fun `check whether white spaces are allowed in Bharat series vehicle number`() {
        assertFalse(
            regexUtils.isVehicleNumberValid("09BH1234MP"),
            "Test whether white spaces are allowed in the bharat vehicle number series"
        )
    }
}