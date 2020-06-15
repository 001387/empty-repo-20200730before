package com.thoughtworks;

import javax.xml.ws.AsyncHandler;

public class FizzBuzz {

	public String fizzBuzz(int number) {
		String result = "";
		String Fizz = "Fizz";
		String Buzz = "Buzz";
		String Whizz = "Whizz";
		
		
		if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0) {
			return result += Fizz + Buzz + Whizz;
		}
		
		if (number % 3 ==0 && number % 5 ==0) {
			return result += Fizz + Buzz;
		}
		
		if (number % 3 ==0 && number % 7 ==0) {
			return result += Fizz + Whizz;
		}
		
		if (number % 5 ==0 && number % 7 ==0) {
			return result += Buzz + Whizz;
		}
		
		if(number % 3 == 0) {
			return result += Fizz;
		}
		
		if (number % 5 ==0) {
			return result += Buzz;
		}
		
		if (number % 7 ==0) {
			return result += Whizz;
		}
		return String.valueOf(number);
	}

}
