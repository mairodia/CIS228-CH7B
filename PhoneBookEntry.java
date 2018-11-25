// File: PhoneBookEntry.java
// Programmer: Jennifer King
// Date: 10/27/2018

import java.util.ArrayList;

public class PhoneBookEntry 
{
	String name;
	String number;
	
	public PhoneBookEntry(String a, String b)
	{
		name = a;
		number = b;
	}
	
	public String getName() {return name;}
	public String getNumber() {return number;}
	
	public static void main(String[] args)
	{
		ArrayList<PhoneBookEntry> phoneBook = new ArrayList<PhoneBookEntry>();
		
		PhoneBookEntry entry1 = new PhoneBookEntry("Belle", "555-1234");
		PhoneBookEntry entry2 = new PhoneBookEntry("Buster", "555-4789");
		PhoneBookEntry entry3 = new PhoneBookEntry("Elektra", "555-4569");
		PhoneBookEntry entry4 = new PhoneBookEntry("Chester", "555-8282");
		PhoneBookEntry entry5 = new PhoneBookEntry("Sammy", "555-9854");
		phoneBook.add(entry1);
		phoneBook.add(entry2);
		phoneBook.add(entry3);
		phoneBook.add(entry4);
		phoneBook.add(entry5);
		
		System.out.println("My Phone Book:");
		for(int i = 0; i < phoneBook.size(); i++)
		{
			System.out.println("------------------------------");
			System.out.println("Name: " + phoneBook.get(i).getName());
			System.out.println("Phone number: " + phoneBook.get(i).getNumber());
		}
		
	}
}
