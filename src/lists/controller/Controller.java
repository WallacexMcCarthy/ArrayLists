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
		listDemo();
		
		keyboardInput.close();
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
		
	}

}
