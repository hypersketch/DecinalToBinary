import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int number, base, quotient, remainder, i;
		boolean valid = false;
		int[] list = new int[100];
		
		i = 0;
		quotient = 100;
		
		do {
		System.out.println("Please input a number");
		number = input.nextInt();
		base = input.nextInt();
		
		if(number <0 || base <2 || base >16)
		{
			System.out.println("Plases input a valid Input");
		}
		else valid = true;
		}
		while(valid == false);
		
		input.close();
	
		while(quotient !=0)
		{
			quotient = number/base;
			remainder = number%base;
			number = quotient;
			list[i] = remainder;
			i++;	
		}
		
		for(int j = i-1; j>=0;j--)
		{
			System.out.print(list[j]);
		}
		
		
	}

}
