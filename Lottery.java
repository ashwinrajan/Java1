/* Student Assignment Submission Form
==================================
I declare that the attached assignment is wholly my own work in
accordance with Sheridan Academic Policy. No part of this
assignment has been copied manually or electronically from any
other source (including web sites) or distributed to other students.
My name is : Ashwin Rajan */

import javax.swing.JOptionPane;

class Lottery
{
	public static void main(String[] args) 
	{
		// Declaring Variables.
		int userGuess;
		int lotteryNum;
		int playAgain=0;
		int userFirstDigit;
		int userSecondDigit;
		int userThirdDigit;
		int userFourthDigit;
		int userFifthDigit;
		int userSixthDigit;
		int userSeventhDigit;
		int lotteryFirstDigit;
		int lotterySecondDigit;
		int lotteryThirdDigit;
		int lotteryFourthDigit;
		int lotteryFifthDigit;
		int lotterySixthDigit;
		int lotterySeventhDigit;


		// (start of do while loop) repeats the program if user choose to play again
		do
		{
	
			// Input
			String input = JOptionPane.showInputDialog(null,"***WELCOME TO MIRICLE WIN LOTTO*** \n Enter a seven digit number","");
			userGuess = Integer.parseInt(input);

			// (Begining of first if statement) Processing and Calculation if the user typed a valid seven digit number
			if (userGuess>=1000000 && userGuess<10000000)
			{
				// Generates random number between 1000000 to 9999999
				lotteryNum= 1000000+(int)(Math.random()*((9999999-1000000)+1));

				// Seperating digits from user guess
				userFirstDigit= userGuess/1000000;
				userSecondDigit= (userGuess%1000000)/100000;
				userThirdDigit= (userGuess%100000)/10000;
				userFourthDigit= (userGuess%10000)/1000;
				userFifthDigit= (userGuess%1000)/100;
				userSixthDigit= (userGuess%100)/10;
				userSeventhDigit= userGuess%10;

				
				// Seperating digits from lottery number
				lotteryFirstDigit= lotteryNum/1000000;
				lotterySecondDigit= (lotteryNum%1000000)/100000;
				lotteryThirdDigit= (lotteryNum%100000)/10000;
				lotteryFourthDigit= (lotteryNum%10000)/1000;
				lotteryFifthDigit= (lotteryNum%1000)/100;
				lotterySixthDigit= (lotteryNum%100)/10;
				lotterySeventhDigit= lotteryNum%10;

				// (Begining of second if statement) if all numbers matched, the user gets $1,000,000.
				if (userGuess==lotteryNum)
				{
					String output= "Your Number: "+userGuess+" Lottery Number: "+lotteryNum+"\n .***WINNER***. YOU JUST WON $1,000,000."; JOptionPane.showMessageDialog(null,output);
				}

				// if  All Even Place Matched, the user gets $500.
				else if ((userSecondDigit == lotterySecondDigit) && (userFourthDigit == lotteryFourthDigit) && (userSixthDigit == lotterySixthDigit))
				{
					String output= "Your Number: "+userGuess+" Lottery Number: "+lotteryNum+"\n All Even Place Matched: You Have Won $500."; JOptionPane.showMessageDialog(null,output);
				}

				// if All Odd Place Matched, the user gets $250
				else if ((userFirstDigit == lotteryFirstDigit) && (userThirdDigit == lotteryThirdDigit) && (userFifthDigit == lotteryFifthDigit) && (userSeventhDigit == lotterySeventhDigit))
				{
					String output= "Your Number: "+userGuess+" Lottery Number: "+lotteryNum+"\n All Odd Place Matched: You Have Won $250."; JOptionPane.showMessageDialog(null,output);
				}

				// if First And Last Digit Mached, the user gets $100
				else if ((userFirstDigit == lotteryFirstDigit) && (userSeventhDigit == lotterySeventhDigit))
				{
					String output= "Your Number: "+userGuess+" Lottery Number: "+lotteryNum+"\n First And Last Digit Mached: You Have Won $100."; JOptionPane.showMessageDialog(null,output);
				}

				// if none of them matched, show a messege
				else
				{
					String output= "Your Number: "+userGuess+" Lottery Number: "+lotteryNum+"\n Sorry, Better Luck Next Time"; JOptionPane.showMessageDialog(null,output);
					
				}// end of second if statement

				// shows confirm dialog box for "play again"
				playAgain= JOptionPane.showConfirmDialog(null,"Would you like to play again?");
				
	
			}

			// if user typed invaid number, show a messege
			else
			{
			String output= "Please provide a valid number"; JOptionPane.showMessageDialog(null,output);

			}// end of first if statement
				
		}
		while (playAgain == JOptionPane.YES_OPTION); // end of do loop
	}
}
