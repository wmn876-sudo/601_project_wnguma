package project;

import java.util.*;
public class SecretNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int userNum;
		Random r = new Random();
		int secretNum = r.nextInt(100);
		System.out.println("Secret Number: " + secretNum);
		int i;
		System.out.println("FIND THE SECRET NUMBER");
		System.out.println("**********************");
		System.out.println();
		
		for(i=1;i<=5;i++)
		{
			System.out.print("Enter number between 0 - 100 (Chance "+i+") : ");
			userNum = sc.nextInt();
			if(userNum==secretNum)
			{
				System.out.println("The secret number is : "+secretNum);
				System.out.println("Congratulation!!! You have guessed the number correctly");
				break;
			}
			else if(userNum<secretNum)
			{
				System.out.println("Secret number is greater");
				if(secretNum - userNum <= 5) 
				{
					System.out.println("You are so close!!!");
				}
			}
			else
			{
				System.out.println("Secret number is smaller");
				if(userNum - secretNum <= 5) 
				{
					System.out.println("You are so close!!!");
				}
			}
			System.out.println();//just for one line space
		}// ending of for loop
		
		
		
		if(i==6)
		{
			System.out.println("Sorry you have used all your chances");
			System.out.println("The secret number is : "+secretNum);
			System.out.println("Better luck next time!!!");
		}
	}

}
