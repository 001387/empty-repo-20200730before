package com.thoughtworks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuss {
	@Test
    public void should_return_1_when_input_1() {
        //given
        int number = 1;
        //when
        String one = FizzBuzz.fizzBuzz(number);
        //then
        assertEquals("1", one);
    }
	
}
