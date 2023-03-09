package Game;

import java.util.Scanner;

 //class pass 
//{
//	{
//			
//		}
//}
class Guesser
	{
	int guessNum;
	int guessNum() 
	{
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Guesser Kindly Guess The Number");
	guessNum=scan.nextInt();
	return guessNum;
	}
	
}
class Player{
	int guessNum;
	int guessNum()
{
	Scanner scan= new Scanner(System.in);
	System.out.println("Player kindly guess the Number");
	guessNum=scan.nextInt();
	return guessNum;
}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if (numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println(" All Player Won the Game");
			}
			else if (numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player1 and Player2  won the game");
			}
			else if (numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player1 and Player3  won the game");
			}
			else
			{
				System.out.println("Player1 won the game");
			}
			
		}
		else if (numFromGuesser==numFromPlayer2)
		{
			if (numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player2 and Player3 won the game");
			}
			else
			{
				System.out.println("Player2 won the game");
			}
		}
		else if (numFromGuesser==numFromPlayer3)
		{
			System.out.println("player3 you won the game");	
		}
		else
		{
			System.out.println("Game lost try Again");
			
		}
	}
	
}

public class Guessergame 
{

	public static void main(String[] args)
	{
	
		 int NUM_UPPER_LETTERS = 2;
		 int NUM_LOWER_LETTERS = 3;
		 int NUM_DIGITS = 2;
		int uppercount= 0;
		int lowercount= 0;
		int digitcount= 0;
		int lettercount= 0;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter Your Password (Password must have 2 uppercase 3 lowercase 2 digits): ");
		String input = in.nextLine();
		int inputLen= input.length();
		for(int i=0; i<inputLen; i++)
		{
			char ch= input.charAt(i);
			if(Character.isUpperCase(ch))
				uppercount++;
			else if (Character.isLowerCase(ch))
				lowercount++;
			else if (Character.isDigit(ch))
				digitcount++;
		}
		
		if(uppercount >= NUM_UPPER_LETTERS && lowercount >= NUM_LOWER_LETTERS && digitcount >= NUM_DIGITS)
		{
			System.out.println("Valid Password now you can play the game ");	
			
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayer();
			u.compare();
		}
		else 
		{
			System.out.println("The password does not have enough of the following: ");
			if(uppercount < NUM_UPPER_LETTERS)
				System.out.println("uppercase letter");
			if(lowercount < NUM_LOWER_LETTERS)
				System.out.println("lowercase letter");
			if(digitcount < NUM_DIGITS)
				System.out.println("digits");
			
		 }	
		
	}
	
}
