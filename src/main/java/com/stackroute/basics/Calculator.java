package com.stackroute.basics;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class Calculator {
	private static Scanner scan;
	private static int c = 0;
    private static String answer = "";
	// define,declare scanner and call getValues with scanner as parameter
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		new Calculator().getValues(scan);

	}

	// Get values and which operator from the menu
	public void getValues(Scanner scan) {
		int firstValue;
		int secondValue;
		int operator;

		do {
			answer ="";
			firstValue = scan.nextInt();
			secondValue = scan.nextInt();
			operator = scan.nextInt();

			System.out.println(calculate(firstValue, secondValue, operator));
			if (c == 1) {
				return;
			}
			
		} while (scan.next().equalsIgnoreCase("y"));

	}

	public String calculate(int firstValue, int secondValue, int operator) {
		
		int result;
		answer ="";
		switch (operator) {
		case 1:

			result = firstValue + secondValue;
			answer = firstValue + " + " + secondValue + " = " + result;
			break;
		case 2:
			result = firstValue - secondValue;
			answer = firstValue + " - " + secondValue + " = " + result;
			break;
		case 3:
			result = firstValue * secondValue;
			answer = firstValue + " * " + secondValue + " = " + result;
			break;

		case 4:

			if (secondValue == 0) {
				c+=1;
				answer = "The divider (secondValue) cannot be zero";
			}

			else {
				result = firstValue / secondValue;
				answer = firstValue + " / " + secondValue + " = " + result;
			}
			break;

		default:
			c+=1;
			answer = "Entered wrong option " + operator;

			break;
		}

		return answer;
	}
}
