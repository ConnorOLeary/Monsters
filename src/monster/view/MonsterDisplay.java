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
		public String getResponse(String questionAsk, String responseType) {
			String response = "";
			boolean parsed = true;
			while(parsed) {
				if (responseType.equals("int")) {
					try {
						int validInteger = Integer.parseInt(response);
						parsed = false;
					}catch(NumberFormatException error) {
					
					}
				}else if (responseType.equals("double")) {
					try {
						double validDouble = Double.parseDouble(response);
						parsed = false;
					}catch(NumberFormatException error) {

					}
				}else {
					parsed = false;
				}
			}
			response += JOptionPane.showInputDialog(null, questionAsk);
			
			return response;
		}
		
}
