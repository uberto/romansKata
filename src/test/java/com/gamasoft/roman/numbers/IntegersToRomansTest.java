package com.gamasoft.roman.numbers;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntegersToRomansTest {

    @Test
    @Ignore
    public void complexIntegersToRomans() {
        assertThat(roman(123), is("CXII"));
        assertThat(roman(1968), is("MCMLXVIII"));
        assertThat(roman(444), is("CDXLIV"));
        assertThat(roman(3333), is("MMMCCCXXXIII"));
        assertThat(roman(999), is("CMXCIX"));
    }

    @Test
    public void verySimpleIntegersToRomans() {
        assertThat(roman(1), is("I"));
        assertThat(roman(2), is("II"));
        assertThat(roman(3), is("III"));
        assertThat(roman(4), is("IV"));
        assertThat(roman(5), is("V"));
        assertThat(roman(6), is("VI"));
        assertThat(roman(7), is("VII"));
        assertThat(roman(8), is("VIII"));
    }

    private String roman(int number) {
        int remaining = number;
        StringBuilder res = new StringBuilder();
        while (remaining > 0) {
            if (remaining >= 5) {
                res.append("V");
                remaining -= 5;
            } else if (remaining == 4) {
               res.append("IV");
                remaining -= 4;
            } else {
                res.append("I");
                remaining--;
            }
        }

        return res.toString();
    }
}
