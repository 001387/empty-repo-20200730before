package com.thoughtworks;

import static org.junit.Assert.*;

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
	
	@Test
	public void should_return_Fizz_when_given_3() {
//		given
		int number = 3;
//		when
		String fizz = FizzBuzz.fizzBuzz(number);
//		then
		assertEquals("Fizz", fizz);
	}
}
