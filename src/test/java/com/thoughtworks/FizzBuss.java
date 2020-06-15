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
	
	@Test
	public void should_return_Whizz_when_given_multiple_of_3_and_7() {
		FizzBuzz fizzBuzz = new FizzBuzz();
//		given
		int number = 21;
//		when
		String FizzWhizz = fizzBuzz.fizzBuzz(number);
//		then
		assertEquals("FizzWhizz", FizzWhizz);
	}
	
	@Test
	public void should_return_Whizz_when_given_multiple_of_5_and_7() {
		FizzBuzz fizzBuzz = new FizzBuzz();
//		given
		int number = 70;
//		when
		String BuzzWhizz = fizzBuzz.fizzBuzz(number);
//		then
		assertEquals("BuzzWhizz", BuzzWhizz);
	}
	
	@Test
	public void should_return_Whizz_when_given_multiple_of_3_and_5_and_7() {
		FizzBuzz fizzBuzz = new FizzBuzz();
//		given
		int number = 105;
//		when
		String FizzBuzzWhizz = fizzBuzz.fizzBuzz(number);
//		then
		assertEquals("FizzBuzzWhizz", FizzBuzzWhizz);
	}
	
	@Test
	public void should_return_Fizz_when_given_number_contains_3() {
		FizzBuzz fizzBuzz = new FizzBuzz();
//		given
		int number = 30;
//		when
		String Fizz = fizzBuzz.fizzBuzz(number);
//		then
		assertEquals("Fizz", Fizz);
	}
	
	@Test
	public void should_return_Fizz_when_given_number_contains_5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
//		given
		int number = 35;
//		when
		String BuzzWhizz = fizzBuzz.fizzBuzz(number);
//		then
		assertEquals("BuzzWhizz", BuzzWhizz);
	}
	
	@Test
	public void should_return_Fizz_when_given_number_contains_7() {
		FizzBuzz fizzBuzz = new FizzBuzz();
//		given
		int number = 75;
//		when
		String Fizz = fizzBuzz.fizzBuzz(number);
//		then
		assertEquals("Fizz", Fizz);
	}
}
