import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;


public class Hacker {
	private ArrayList<String> hack;
	private HashMap<String, Integer> entered;
	
	public Hacker()
	{
		
	}
	public void fillHack()
	{
		String entree;
		ArrayList<String> hack=new ArrayList<>();
		do
		{
			entree=JOptionPane.showInputDialog("Enter a element, "
					+ "or STOP to move to the next step");
			//System.out.println(entree);
			if(!entree.equals("STOP"))
			{
				hack.add(entree);
			}
		}while(!entree.equalsIgnoreCase("STOP"));
		getWord();
	}
	public void getWord()
	{
		String words[];
		entered=new HashMap<String,Integer>(20);
		//String length;
		String enter=JOptionPane.showInputDialog("Enter the word you picked and "
				+ "the number matched with a space between them");
		System.out.println(enter);
		words=enter.split(" ");
		System.out.println(words[0] + words[1]);
		entered.put(words[0], Integer.parseInt(words[1]));
		check(words[0]);
	}
	public void check(String word)
	{
		ArrayList<String> answerList = new ArrayList<>();
		for(String s : hack)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==word.charAt(i))
				{
					count++;
				}
			}
			if(count==entered.get(word))
			{
				answerList.add(word);
			}
		}
		JOptionPane.showMessageDialog(null, answerList);
	}
}
