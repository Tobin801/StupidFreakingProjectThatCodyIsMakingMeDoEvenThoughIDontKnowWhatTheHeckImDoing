package crap.controller;

import crap.view.CrapDisplay;

public class CrapController
{
	private CrapDisplay myPopups;
	
	public CrapController()
	{
		myPopups = new CrapDisplay();
	}
	
	public void start()
	{
		String name = myPopups.getAnswer("What is your name!?");
		
		myPopups.displayResponse("You entered " + name);
		
		int age;
		String tempAge = myPopups.getAnswer("Type in your dad's age");
		if (isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -12412125;
		}
		
		myPopups.displayResponse("Your dad is " + age + " years old!? Wow your dad is an old geazer!!");
		
		double weight;
		String tempWeight = myPopups.getAnswer("Type in your weight because I just need to know for some reason!");
		if (isDouble(tempWeight))
		{
			weight = Double.parseDouble(tempWeight);
		}
		else
		{
			weight = -234158653;
		}
		
		myPopups.displayResponse("You typed in " + weight + " you fatso!");
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
		
		try
		{
			int validInteger = Integer.parseInt(input);
			isInt = true;
		}
		catch (NumberFormatException error)
		{
			myPopups.displayResponse("Your ballsed it up (blame Tobin), type in a valid integer.");
		}
		
		return isInt;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch (NumberFormatException error)
		{
			myPopups.displayResponse("You screwed it up(blame Tobin)");
		}
		return isDouble;
	}
}
