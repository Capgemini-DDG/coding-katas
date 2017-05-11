package main;

import java.util.Scanner;

public class Fib {
	
	int number;
	
	public void fibo(){
	
	Scanner input = new Scanner(System.in);	
	System.out.print("enter a number: ");	
	number = input.nextInt();
		
	for (int i = 0; i < number; i++){
		
		i = i + i;
		System.out.println(i);
	}
	
	}
	
	public static int fib( int test ){
		
		if (test == 0){
			return 0;
		}
		
		else if (test == 1){
			return 1;
		}

		else {
			
			return fib(test -1) + fib(test- 2);
		
		}
	}

}
