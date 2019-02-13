/* Student Assignment Submission Form
==================================
I declare that the attached assignment is wholly my own work in accordance with Sheridan Academic Policy. No part of this assignment has been copied manually or electronically
from any other source (including web sites) or distributed to other students.
My name is: Ashwin Rajan */

import javax.swing.JOptionPane;

class Quiz 
{
	//Declaring Variable
	static int correct=0;
	static int incorrect=0;
	static int skip;


	//************************************************Main method*******************************************************************************************************
	public static void main(String[] args) 
	{
		//Shows Message Dialog 
		JOptionPane.showMessageDialog(null,"Welcome to General Trivia Quiz");

		//Call question method
		questions();

		//Call finalResult method
		finalResult(correct,incorrect);

		
	}
	
	//***********************************************Questions method**************************************************************************************************
	public static void questions()
	{
		//Declaring Variable
		int optionNum=0;

		//for loop for going through one question at a time and check solution
		for (int i=1;i<=10 ;i++ )
		{
			
			//Question 1
			if (i==1)
			{
				String options[] = {"George Washington","Thomas Jefferson","James Monroe","John Adams"};

				optionNum = JOptionPane.showOptionDialog(null,"Who is the first President of the United States of America ?","Question 1",
													JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
				

			}

			//Question 2
			else if (i==2)
			{
				String options[] = {"Sirius","Pole Star","Sun","Alpha Centauri","Proxima Centauri"};

				optionNum = JOptionPane.showOptionDialog(null,"Nearest star to the Earth ? ","Question 2",
													JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
				

			}

			//Question 3
			else if (i==3)
			{
				String options[] = {"Japan","China","Nepal","Bhutan"};

				optionNum = JOptionPane.showOptionDialog(null,"Yen is the currency of which country ?","Question 3",
													JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
				

			}

			//Question 4
			else if (i==4)
			{
				String options[] = {"The land of the rising sun","The land of the midnight sun","The land of the Southern Slavs","The land of Yahoos"};

				optionNum = JOptionPane.showOptionDialog(null,"What does Yugoslavia mean ?","Question 4",
													JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
				

			}

			//Question 5
			else if (i==5)
			{
				String options[] = {"Lee Harvey Oswald","John Hinckley","John Wilkes Booth","Michael Schiavo"};

				optionNum = JOptionPane.showOptionDialog(null,"Who killed US President Abraham Lincoln ?","Question 5",
													JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
				

			}

			//Question 6
			else if (i==6)
			{
				String options[] = {"Basketball","Volleyball","Hockey","Football"};

				optionNum = JOptionPane.showOptionDialog(null,"Which game is played with five players on either side ?","Question 6",
													JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
				

			}

			//Question 7
			else if (i==7)
			{
				String options[] = {"India","USA","Canada","South Africa"};

				optionNum = JOptionPane.showOptionDialog(null,"Which country has 11 official languages ?","Question 7",
													JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
				

			}

			//Question 8
			else if (i==8)
			{
				String options[] = {"Jane Austen","Agatha Christie","William Shakespeare","Bernard Shaw"};

				optionNum = JOptionPane.showOptionDialog(null,"Who is the author of Pride and Prejudice ?","Question 8",
													JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
				

			}

			//Question 9
			else if (i==9)
			{
				String options[] = {"Shamrock","Daffodil","Marigold","Jasmine"};

				optionNum = JOptionPane.showOptionDialog(null,"Which is the national flower of Ireland ?","Question 9",
													JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
				

			}

			//Question 10
			else if (i==10)
			{
				String options[] = {"Behavior of human beings","Insects","The origin and history of technical and scientific terms","The formation of rocks"};

				optionNum = JOptionPane.showOptionDialog(null,"Entomology is the science that studies","Question 10",
													JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,null);
				

			}
			
			//Calling checkSolution method to check the solution
			checkSolution(i,optionNum);
			
			//Skips the remaining question if user do not wish to continue.
			if (skip==1)
			{
				break;
			}

		}

	}
	
	//***************************************************checkSolution Method*************************************************************************************************
	public static void checkSolution(int questionNum,int optionNum)
	{
		
		
		//Shows the correct answer if user clicked wrong answer.
		if (questionNum==1 && optionNum!=0)
		{
			skip=JOptionPane.showConfirmDialog(null, "Sorry, Your answer is wrong. The answer for your quesion is George Washington.\n \n Would you like to continue to your next question?",
												"Result",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
			incorrect++;

		}
		else if (questionNum==2 && optionNum!=2)
		{
			skip=JOptionPane.showConfirmDialog(null,"Sorry, Your answer is wrong. The answer for your quesion is Sun.\n \n Would you like to continue to your next question?",
												"Result",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
			incorrect++;
		}
		else if (questionNum==3 && optionNum!=0)
		{
			skip=JOptionPane.showConfirmDialog(null,"Sorry, Your answer is wrong. The answer for your quesion is Japan.\n \n Would you like to continue to your next question?",
												"Result",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
			incorrect++;
		}
		else if (questionNum==4 && optionNum!=2)
		{
			skip=JOptionPane.showConfirmDialog(null,"Sorry, Your answer is wrong. The answer for your quesion is The land of the Southern Slavs.\n \n Would you like to continue to your next question?",
												"Result",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
			incorrect++;
		}
		else if (questionNum==5 && optionNum!=2)
		{
			skip=JOptionPane.showConfirmDialog(null,"Sorry, Your answer is wrong. The answer for your quesion is John Wilkes Booth.\n \n Would you like to continue to your next question?",
												"Result",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
			incorrect++;
		}
		else if (questionNum==6 && optionNum!=0)
		{
			skip=JOptionPane.showConfirmDialog(null,"Sorry, Your answer is wrong. The answer for your quesion is Basketball.\n \n Would you like to continue to your next question?",
												"Result",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
			incorrect++;
		}
		else if (questionNum==7 && optionNum!=3)
		{
			skip=JOptionPane.showConfirmDialog(null,"Sorry, Your answer is wrong. The answer for your quesion is South Africa.\n \n Would you like to continue to your next question?",
												"Result",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
			incorrect++;
		}
		else if (questionNum==8 && optionNum!=0)
		{
			skip=JOptionPane.showConfirmDialog(null,"Sorry, Your answer is wrong. The answer for your quesion is Jane Austen.\n \n Would you like to continue to your next question?",
												"Result",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
			incorrect++;
		}
		else if (questionNum==9 && optionNum!=0)
		{
			skip=JOptionPane.showConfirmDialog(null,"Sorry, Your answer is wrong. The answer for your quesion is Shamrock.\n \n Would you like to continue to your final question?",
												"Result",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
			incorrect++;
		}
		else if (questionNum==10 && optionNum!=1)
		{
			JOptionPane.showMessageDialog(null,"Sorry, Your answer is wrong. The answer for your quesion is Insects.",
												"Result",JOptionPane.INFORMATION_MESSAGE);
			incorrect++;
		}

		//Shows congratulatory message if user clicked correct answer
		else
		{
			skip=JOptionPane.showConfirmDialog(null,"Congratulation !!!, Your answer is right.\n \n Would you like to continue?",
												"Result",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
			correct++;
		}

			
		
	}
	
	//*****************************************************finalResult Method********************************************************************************************************
	public static void finalResult(int correct,int incorrect)
	{
		//Declaring Variable
		int correctPercentage;
		int incorrectPercentage;
		
		//Calculating correct and incorrect percentage
		correctPercentage= correct*10;
		incorrectPercentage= incorrect*10;

		//Show a message dialog box that include total number of correct, incorrect answers and Percentage of correct, incorrect answers
		JOptionPane.showMessageDialog(null," Number of correct answer: "+correct+"\n Number of incorrect answer: "+incorrect+"\n Percentage of correct answers: "+correctPercentage+
										"% \n Percentage of incorrect answers: "+incorrectPercentage+"%","Final Result",JOptionPane.INFORMATION_MESSAGE);
		 


	}
	
	

	

	
}
