package lists.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller 
{

	private Scanner keyboardInput;
	private ArrayList<String> nameList;
	private ArrayList<String> ageList;
	private ArrayList<String> testerList;
	
	public Controller()
	{
		this.keyboardInput = new Scanner(System.in);
		this.nameList = new ArrayList<String>();
		this.ageList = new ArrayList<String>();
		this.testerList = new ArrayList<String>();
	}
	
	
	public void start()
	{
		sortingStrings();
//		System.out.print(nameList);
////		manyMonsters();
//		moreListStuff();
//		listDemo();
//		
//		keyboardInput.close();
//		testerList.add(0,"1");
//		testerList.add("2");
//		testerList.set(0, "2"); // set(index, value)
//		testerList.add("3");
//		testerList.add("4");
//		testerList.add("5");
//		testerList.add("6"); // add(value)
//		testerList.add("7");
//		testerList.add(2, "8"); // add(index, value)
//		testerList.add("9");
//		testerList.add("10");
//		testerList.remove(0);
//		System.out.println(testerList);
//		String print = testerList.get(3); // get()
//		System.out.println(print);
//		System.out.println(testerList.size()); // .size()
//		if(testerList.contains("10"))
//		{
//			System.out.println(".contains pased");
//		}
//		testerList.clear(); // .clear()
//		System.out.println("this is a cleared list: " + testerList + "....");
	}
//	
//	private void manyMonsters()
//	{
//		
//	}
	private void sortingStrings()
	{
		testerList.add(0,"1");
		testerList.add("2");
		testerList.set(0, "2"); // set(index, value)
		testerList.add("3");
		testerList.add("4");
		testerList.add("5");
		testerList.add("6"); // add(value)
		testerList.add("7");
		testerList.add(2, "8"); // add(index, value)
		testerList.add("9");
		testerList.add("10");
		testerList.add("weergf");
		testerList.add("aretsthgm");
		testerList.add("liukjhg");
		testerList.add("hggf");
		testerList.add("vbfg");
		testerList.add("k[adsf");
		testerList.add("[p-");
		testerList.add("234");
		testerList.add("[");
		testerList.add("]0---");
		testerList.add("=-0");
		testerList.add("['/;");
		testerList.add("srtyh");
		testerList.add("RTHDFGHFGH");
		testerList.add("RTI['");
		testerList.add("PL;'[PO'P");
		testerList.add("][P;LOIK");
		testerList.add("UI;O'O;L/K.");
		testerList.add("KJL;JO;'L;L;'");
		testerList.add(";[[';;");
		testerList.add("7546");
		testerList.add("=-][P;'K,.JHG");
		testerList.add("-=[OIUKL;'P[P';/");
		testerList.add("STRYDTUFIGOHPU'/HL.G,JFM");
		testerList.add("drytuitoup0u9-i[op';lk");
		testerList.add(""
				+ ";][l'pk;ljkgfjgh");
		arrayListSort(testerList);
		for( String word : testerList)
		{
			System.out.println(word);
		}
		
	}
	private void arrayListSort(ArrayList <String> words)
	{
		for (int outerLoop = 0; outerLoop < words.size(); outerLoop++)
		{
			int maxIndex = outerLoop;
			for (int inner = outerLoop + 1; inner < words.size(); inner++)
			{
				if (words.get(inner).compareToIgnoreCase(words.get(maxIndex)) > 0)
				{
					maxIndex = inner;
				}
			}
			
			if (maxIndex != outerLoop)
			{
				swapItems(maxIndex, outerLoop, words);
			}
		}
	}
	
	private void usingWrapperClass()
	{
		ArrayList<Double> lotsOfNumbers = new ArrayList<Double>();
		for (int index = 0; index < 400; index++)
		{
			double random = Math.random();
			lotsOfNumbers.add(random);
			
		}
		arrayListDoubleSort(lotsOfNumbers);
		for (Double number : lotsOfNumbers)
		{
			System.out.print(number + " ");
		}
	}
	
	private void swapItemsDouble(int firstIndex, int secondIndex, ArrayList <Double> numbers)
	{
		Double temp = numbers.get(firstIndex);
		numbers.set(firstIndex, numbers.get(secondIndex));
		numbers.set(secondIndex, temp);
	}
	
	private void arrayListDoubleSort(ArrayList <Double> numbers)
	{
		for (int outerLoop = 0; outerLoop < numbers.size(); outerLoop++)
		{
			int maxIndex = outerLoop;
			for (int inner = outerLoop + 1; inner < numbers.size(); inner++)
			{
				if (numbers.get(inner) < (numbers.get(maxIndex)))
				{
					maxIndex = inner;
				}
			}
			
			if (maxIndex != outerLoop)
			{
				swapItemsDouble(maxIndex, outerLoop, numbers);
			}
		}
	}
	
	private void swapItems(int firstIndex, int secondIndex, ArrayList <String> source)
	{
		String temp = source.get(firstIndex);
		source.set(firstIndex, source.get(secondIndex));
		source.set(secondIndex, temp);
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
