package com.gamasoft.roman.numbers;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntegersToRomansTest {

    @Test @Ignore
    public void complexIntegersToRomans(){
        assertThat(roman(123), is("CXII"));
        assertThat(roman(1968), is("MCMLXVIII"));
        assertThat(roman(444), is("CDXLIV"));
        assertThat(roman(3333), is("MMMCCCXXXIII"));
        assertThat(roman(999), is("CMXCIX"));
    }

    public void verySimpleIntegersToRomans(){
        assertThat(roman(1), is("I"));
    }

    private String roman(int number) {
        return "I";
    }
}
