import javax.swing.JOptionPane;
import java.util.ArrayList;

public class HackFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hacker hack=new Hacker();
		
		/*
		ArrayList<String> hack=new ArrayList<>();
		do
		{
			entree=JOptionPane.showInputDialog("Enter a element, "
					+ "or STOP to move to the next step");
			if(entree!="STOP")
			{
				hack.add(entree);
			}
		}while(entree!="STOP");
		*/
		hack.fillHack();
		
	}

}
