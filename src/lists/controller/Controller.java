package lists.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller 
{

	private Scanner keyboardInput;
	
	public Controller()
	{
		this.keyboardInput = new Scanner(System.in);
	}
	
	
	public void start()
	{
		listDemo();
		
		keyboardInput.close();
	}
	
	private void listDemo()
	{
		List<String> wordList = new ArrayList<>();
		System.out.println("What si the word?");
		String firstWord = keyboardInput.nextLine();
		keyboardInput.nextLine();
		System.out.println("Type in another word ...");
		String secondWord = keyboardInput.nextLine();
		
		wordList.add(firstWord);
		wordList.add(secondWord);
		System.out.println(wordList);
		
	}

}
