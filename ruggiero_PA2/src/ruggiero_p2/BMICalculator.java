package ruggiero_p2;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
	    
		float weight, height, bMI = 0;
		int f;
		
		Scanner input = new Scanner ( System.in );
		System.out.println("Choose a formula.");
		System.out.println("1) BMI = (703 * weight In Pounds/height In Inches^2");
		System.out.println("2) BMI = weight In Kilograms/height In Meters^2");
		System.out.println("Enter your preferred formula. (1/2)");
		
		f = input.nextInt();
		
		if(f==1)
		{
			System.out.println("Enter weight in pounds:");
			weight = input.nextFloat();
			System.out.println("Enter height in inches:");
			height = input.nextFloat();
			System.out.printf("Your body max index is %f\n", bMI);	
		}
		else
		{
			System.out.println("Enter weight in kilograms:");
			weight = input.nextFloat();
			System.out.println("Enter height in meters:");
			height = input.nextFloat();
			System.out.printf("Your body max index is %f\n", bMI);
			
		}
		}

}

    

   