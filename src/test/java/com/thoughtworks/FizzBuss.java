package com.thoughtworks;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuss {
	@Test
    public void should_return_1_when_input_1() {
		FizzBuzz fizzBuzz = new FizzBuzz();
        //given
        int number = 1;
        //when
        String one = fizzBuzz.fizzBuzz(number);
        //then
        assertEquals("1", one);
    }
	
	@Test
	public void should_return_Fizz_when_given_3() {
		FizzBuzz fizzBuzz = new FizzBuzz();
//		given
		int number = 3;
//		when
		String fizz = fizzBuzz.fizzBuzz(number);
//		then
		assertEquals("Fizz", fizz);
	}
	
	@Test
	public void should_return_Buzz_when_given_5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
//		given
		int number = 5;
//		when
		String buzz = fizzBuzz.fizzBuzz(number);
//		then
		assertEquals("Buzz", buzz);
	}
	
	@Test
	public void should_return_Whizz_when_given_7() {
		FizzBuzz fizzBuzz = new FizzBuzz();
//		given
		int number = 7;
//		when
		String whizz = fizzBuzz.fizzBuzz(number);
//		then
		assertEquals("Whizz", whizz);
	}
	
	@Test
	public void should_return_Whizz_when_given_multiple_of_3_and_5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
//		given
		int number = 15;
//		when
		String whizz = fizzBuzz.fizzBuzz(number);
//		then
		assertEquals("FizzBuzz", whizz);
	}
	
	
}
