package lists.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller 
{

	private Scanner keyboardInput;
	private ArrayList<String> nameList;
	private ArrayList<String> ageList;
	
	public Controller()
	{
		this.keyboardInput = new Scanner(System.in);
		this.nameList = new ArrayList<String>();
		this.ageList = new ArrayList<String>();
	}
	
	
	public void start()
	{
		manyMonsters();
//		moreListStuff();
//		listDemo();
//		
		keyboardInput.close();
	}
	
	private void manyMonsters()
	{
		
	}
	
	private void moreListStuff()
	{
		double val = -0.7;

		int roundedVal = (int) (val + 0.5);

		System.out.println(roundedVal);
		keyboardInput.nextLine();
		
		ArrayList<String> messages = new ArrayList<String>();		
		for (int index = 0; index<100; index++)
		{
			String message = "This is a messge and it is at index: " + index;
			messages.add(message);
		}
		
		
		if (!messages.isEmpty())
		{
			System.out.println("Stuff is in the list");
			messages.remove(50);
		}
		
//		while (!messages.isEmpty())
//		{
//			int halfway = messages.size() / 2;
//			String removed = messages.remove(halfway);
//			System.out.println(removed);
//		}
		
		messages.clear();
		System.out.println(messages);
//		System.out.println(messages.get(15));
		
		
	}
	
	private void listDemo()
	{
//		System.out.println("What si the word?");
//		String firstWord = keyboardInput.nextLine();
//		keyboardInput.nextLine();
//		System.out.println("Type in another word ...");
//		String secondWord = keyboardInput.nextLine();
		for (int index=0; index<3; index++)
		{
			System.out.println("Enter a sudent name: ");
			String name = keyboardInput.nextLine();
			keyboardInput.nextLine();
			System.out.println("Enter " + name + "'s age: ");
			String age = keyboardInput.nextLine();
			keyboardInput.nextLine();
			nameList.add(name);
			ageList.add(age);
			
		}
		
		System.out.println(nameList);
		System.out.println(ageList);
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Name: " + nameList.get(index) + " | Age: " + ageList.get(index));
			
		}
		nameList.remove(nameList.size()-1);
		
		System.out.println(nameList);
		
		String myRandomItem = "";
		int randomIndex = (int) (Math.random() * nameList.size());
		myRandomItem = nameList.get(randomIndex);
		System.out.println("The random index was: " + randomIndex);
		System.out.println("The random name is: " + myRandomItem);
		
	}

}
