package demo.model;

import java.util.ArrayList;

public class DebugDuck 
{
	private String name;
	private int answeredQuestions;
	private ArrayList<String> questions;
	
	public DebugDuck()
	{
		this.name = "Mr. Quaxxers";
		this.answeredQuestions = 0;
		this.questions = new ArrayList<String>();
	}
	
	
	public DebugDuck(String name)
	{
		this.name = name;
		this.answeredQuestions = 0;
		this.questions = new ArrayList<String>();

	}
	
	
	public String getName()
	{
		return name;
	}
	
	
	public int getAnsweredQuestions()
	{
		return questions.size();
	}
	
	
	public void setName()
	{
		this.name = name;
	}
	
	
	public void resetQuestions()
	{
		this.questions = new ArrayList<String>();
	}
	
	
	public void askQuestion(String question)
	{
		questions.add(question);
		answeredQuestions++;
	}
	
	
}
