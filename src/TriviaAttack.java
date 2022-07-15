/**
 * @author tmitc
 * @version 1.0
 * TriviaAttack Quiz Game Application
 * Agile Development Principals Practice
 */

//TODO minimum working skeleton of application (basic command terminal game)

import java.io.*;
import java.util.Scanner;

public class TriviaAttack
{
	public static void main(String[] args) throws IOException
	{
		// Scanner/File objects to receive input from keyboard and text file.
		File myFile = new File("GameQuestionsBasic.txt");
		Scanner inputFile = new Scanner(myFile),
				keyboard = new Scanner(System.in);
		
		//TODO add asking the user questions
		
		//close input files
		inputFile.close();
		keyboard.close();	
	}
}