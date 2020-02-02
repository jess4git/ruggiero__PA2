package ruggiero_p1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args)
    {
        int firstDigit, secondDigit, thirdDigit, fourthDigit, number, temp;
        Scanner input = new Scanner( System.in );
 
        do{
        System.out.print(" Enter four digit number to be encrypted: ");
        number = input.nextInt();
        }while(number / 1000 == 0 || number / 10000 != 0 );
 
        firstDigit = number / 1000;
        secondDigit = number / 100 % 10;
        thirdDigit = number / 10 % 10;
        fourthDigit = number % 10;
 
        firstDigit = (firstDigit + 7) % 10;
        secondDigit = (secondDigit + 7) % 10;
        thirdDigit = (thirdDigit + 7) % 10;
        fourthDigit = (fourthDigit + 7) % 10;
 
        temp = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = temp;
 
        temp = secondDigit;
        secondDigit = fourthDigit;
        fourthDigit = temp;
 
        System.out.printf("The encrypted number is %d%d%d%d\n",
                firstDigit, secondDigit, thirdDigit, fourthDigit);
    }
        
        public static void main(String[] args)
        {
            int firstDigit, secondDigit, thirdDigit, fourthDigit, number, temp;
            Scanner input = new Scanner( System.in );
     
            do{
            System.out.print(" Enter encrypted number: ");
            number = input.nextInt();
            }while(number / 1000 == 0 || number / 10000 != 0 );
     
            firstDigit = number / 1000;
            secondDigit = number / 100 % 10;
            thirdDigit = number / 10 % 10;
            fourthDigit = number % 10;
     
            if(firstDigit <= 6 && firstDigit >= 0)
                firstDigit = firstDigit + 10;
            if(secondDigit <= 6 && secondDigit >= 0)
                secondDigit = secondDigit + 10;
            if(thirdDigit <= 6 && thirdDigit >= 0)
                thirdDigit = thirdDigit + 10;
            if(fourthDigit <= 6 && fourthDigit >= 0)
                fourthDigit = fourthDigit + 10;
     
            firstDigit = firstDigit - 7;
            secondDigit = secondDigit - 7;
            thirdDigit = thirdDigit - 7;
            fourthDigit = fourthDigit - 7;
     
            temp = firstDigit;
            firstDigit = thirdDigit * 1000;
            thirdDigit = temp * 10;
     
            temp = secondDigit;
            secondDigit = fourthDigit * 100;
            fourthDigit = temp;
     
            System.out.printf("The decrypted number is %d\n",
                    firstDigit + secondDigit + thirdDigit + fourthDigit);
        }
    }