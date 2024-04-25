package com.images.junittestsample


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest
{

    @Test
    fun isUserNameEmpty(){

        val result = RegistrationUtil.validRegistrationInput(
            "",
            "abc",
            "abc"
        )
        assertThat(result).isFalse()
    }


    @Test
    fun `are username and correctly repeated password`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Amarjit",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }


    @Test
    fun `is username already taken`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Mantej1",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    // if confirm password does nt matches the password return false
    @Test
    fun `are password and confirm password same`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Rahul",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    // in this test if password has less than two digits than return false
    @Test
    fun `less than two digit password return false`() {
        val result = RegistrationUtil.validRegistrationInput(
            "Rahul",
            "abcd1",
            "abcd1"
        )
        assertThat(result).isFalse()
    }
}