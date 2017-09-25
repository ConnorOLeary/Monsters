package monster.view;

import javax.swing.JOptionPane;


public class MonsterDisplay {
		//when this is called it gives a pop up window
		public void displayText(String textToDisplay) {
			JOptionPane.showMessageDialog(null,  textToDisplay);
		}
		//when this is called it gives a pop up window with an empty box that the user can type into
		public String getResponse(String questionAsk) {
			String response = "";
			response += JOptionPane.showInputDialog(null, questionAsk);
			
			return response;
		}
		
}
