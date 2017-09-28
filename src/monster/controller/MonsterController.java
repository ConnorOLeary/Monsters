package monster.controller;
import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;
import java.util.*;
public class MonsterController {
	
	private MonsterDisplay popup;
	
	public MonsterController() {
		popup = new MonsterDisplay();
	}
	//When the file is ran this goes first
	public void start() {
		
		boolean finished =true;
		int count = 0;
		//while(count < 100) {
		//	popup.displayText("I am so neat!");
		//	count++;
		//}
		
		for(int loop = 0; loop < 15; loop++) {
			popup.displayText("I've looped " + (loop + 1) + " times out of 15");
		}
		MarshmallowMonster sample = new MarshmallowMonster();
		//System.out.println(sample);
		popup.displayText(sample.toString());
		System.out.println("");
		MarshmallowMonster morty = new MarshmallowMonster("Morty", 2, 2, 0, false );
		//System.out.println(morty);
		popup.displayText(morty.toString());
		//System.out.println();
		popup.displayText("M- *BURRRP* M-Morty, I, I gotta borrow one of your arms Morty");
		//System.out.println();
		popup.displayText("Oh geez Rick, I-I don't know");
		//System.out.println();
		popup.displayText("Trust me morty, you won't even feel a thing");
		morty.setArms(1);
		//System.out.println();
		popup.displayText("AHHHHHHHHHHH");
		popup.displayText(morty.toString());
		//This causes the "interact with morty" part of this file using morty as the transfered variable
		interactWithTheMorty(morty);
	}
	//checks to see if a string can be parsed as an integer successfully
	private boolean isInteger(String input) {
		boolean parsed = false;
		try {
			int validInteger = Integer.parseInt(input);
			parsed = true;
		}
		catch(NumberFormatException error) {
			popup.displayText("Thats not a number idiot");
		}
		return parsed;
	}
	private boolean isDouble(String input) {
		boolean parsed = false;
		try {
			double validDouble = Double.parseDouble(input);
			parsed = true;
		}
		catch(NumberFormatException error) {
			popup.displayText("Thats not a number idiot");
		}
		return parsed;
	}
	
	private void interactWithTheMorty(MarshmallowMonster morty) {
		popup.displayText("What should rick Change from morty next?");
		Scanner myScanner = new Scanner(System.in);
		String choice = popup.getResponse("Should he give something or take something?");
		if (choice.contains("give")){
			System.out.println();
			String choice2 = popup.getResponse("What should he give Morty?");
			if(choice2.contains("eye")) {
				morty.setEyes(morty.getEyeCount() + 1);
				System.out.println();
				popup.displayText("Here morty, I have an extra eyeball lying around, w-*BELCH*-Want it?");
				System.out.println();
				popup.displayText("I don't know rick, I-I kinda like just having my 2");
				System.out.println();
				popup.displayText("I'll take that as a yes then");
				System.out.println();
				popup.displayText("AHHHHHHHHHHH");
			}else if (choice2.contains("arm")){
				morty.setArms(morty.getArmCount() + 1);
				System.out.println();
				popup.displayText("You know what Morty, I-I'm sorry heres your arm back");
				System.out.println();
				popup.displayText("Wha-what really Rick? Thanks");
				System.out.println();
				popup.displayText("Ya ya, d-don't make me change my mind Morty, here you go");
				System.out.println();
				popup.displayText("AHHHHHHHHHHH");
			}else if (choice2.contains("tentacle")){
				morty.setTentacles(morty.getTentacleAmount() + 1);
				System.out.println();
				popup.displayText("Hey Morty, you want a tentacle?");
				System.out.println();
				popup.displayText("Wait what Rick?");
				System.out.println();
				popup.displayText("I Saaaaaaid, you want a tentacle?");
				System.out.println();
				popup.displayText("I-I'm not sure Rick, that sounds kinda weird");
				System.out.println();
				popup.displayText("S-stop being such pussy morty, here you go");
				System.out.println();
				popup.displayText("AHHHHHHHHHHH");
			}else if (choice2.contains("Bloop")){
				morty.setBloop(true);
			}else {
				System.out.println("What?");
			}
			
		}else if (choice.contains("take")){
			System.out.println();
			String choice2 = popup.getResponse("What should he take from Morty?");
			if(choice2.contains("eye")) {
				morty.setEyes(morty.getEyeCount() - 1);
				System.out.println();
				popup.displayText("S-Sorry morty, b-but it looks like I'm gonna need one of your eyes");
				System.out.println();
				popup.displayText("wait what rick?");
				System.out.println();
				popup.displayText("I'm gonna need one of your eyes morty, dont worry morty you won't feel anything, you'll be perfectly fine morty");
				System.out.println();
				popup.displayText("Wait.. but thats what you said about my ar-AHHHHHHHHHHH");
			}else if (choice2.contains("arm")){
				morty.setArms(morty.getArmCount() - 1);
				System.out.println();
				popup.displayText("Alright morty, time for the second one");
				System.out.println();
				popup.displayText("b-but Rick, I still need my second arm, w-without it I can't do normal stuff");
				System.out.println();
				popup.displayText("You won't need to do normal stuff with where we're going morty, now hold still");
				System.out.println();
				popup.displayText("oh gee-AHHHHHHHHHHH");
			}else if (choice2.contains("tentacle")){
				morty.setTentacles(morty.getTentacleAmount() - 1);
				System.out.println();
				popup.displayText("MORTY, I'm gonna need to take a tentacle from you morty");
				System.out.println();
				popup.displayText("w-wait what? But I don't have any tentacles Rick");
				System.out.println();
				popup.displayText("Do I look like I care morty? Now hold still");
				System.out.println();
				popup.displayText("AHHHHHHHHHHH");
			}else if (choice2.contains("Bloop")){
				morty.setBloop(false);
			}else {
				System.out.println();
				popup.displayText("What?");
			}
		}else {
			System.out.println("What?");
		}
		popup.displayText(morty.toString());
		
		
		//2nd Iteration
		if (choice.contains("take")){
			System.out.println();
			popup.displayText("You-you know what morty, I'm sorry morty, I shouldn't have taken something from you");
			System.out.println();
			popup.displayText("R-really, ah geeze thanks rick");
			System.out.println();
			popup.displayText("Let me make it up to you morty, just name it and I'll give it to you, an eye, an arm, a tentacle, a bloop");
		}else if (choice.contains("give")){
			System.out.println();
			popup.displayText("I'm gonna be honest with you morty, that whatever I gave you, it had cancer in it morty");
			System.out.println();
			popup.displayText("WAIT WHAT");
			System.out.println();
			popup.displayText("Ya morty, but its too late, its already entered too far into your system morty, I'm gonna need to focus it somewhere, and rip that part right out");
			System.out.println();
			popup.displayText("Ah Geeze Rick");
			System.out.println();
			popup.displayText("I'm gonna leave it up to you what I take and how much of it morty");
		}
		
		
		if (choice.contains("take")){
			String choice3 = popup.getResponse("What body part?");
			int choice4ae = 0;
			double choice4t = 0;
			String choice4b = "a";
			if(choice3.contains("tentacle")) {
				String choice4 = popup.getResponse("How many?");
				if(isDouble(choice4)) {
					choice4t = Double.parseDouble(choice4);
				}else {
					choice4t = 0;
				}
				popup.displayText("Alright here you go morty " + choice4t + " " + choice3 + "s");
			}else if(choice3.contains("bloop")){
				popup.displayText("Alright here you go morty " + choice4b + " " + choice3);
			}else {
				String choice4 = popup.getResponse("How many?");
				if(isInteger(choice4)) {
					choice4ae = Integer.parseInt(choice4);
				}else {
					choice4ae = 0;
				}
				popup.displayText("Alright here you go morty " + choice4ae + " " + choice3 + "s");
			}
			
			System.out.println();
			
			
			if(choice3.contains("eye")) {
				morty.setEyes(morty.getEyeCount() + choice4ae);
			}else if (choice3.contains("arm")){
				morty.setArms(morty.getArmCount() + choice4ae);
			}else if (choice3.contains("tentacle")){
				morty.setTentacles(morty.getTentacleAmount() + choice4t);
			}else if (choice3.contains("Bloop")){
				morty.setBloop(true);
			}else {
				System.out.println();
				popup.displayText("Hmm, I might have forgotten to carry the 2, well lets see what happens anyways");}
			
		}else if (choice.contains("give")) {
			System.out.println();
			String choice3 = popup.getResponse("What body part?");
			int choice4ae = 0;
			double choice4t = 0;
			String choice4b = "a";
			if(choice3.contains("tentacle")) {
				String choice4 = popup.getResponse("How many?");
				if(isDouble(choice4)) {
					choice4t = Double.parseDouble(choice4);
				}else {
					choice4t = 0;
				}
			}else if(choice3.contains("bloop")){
				
			}else {
				String choice4 = popup.getResponse("How many?");
				if(isInteger(choice4)) {
					choice4ae = Integer.parseInt(choice4);
				}else {
					choice4ae = 0;
				}
			}
			
			
			if(choice3.contains("eye")) {
				if(morty.getEyeCount() < choice4ae) {
					System.out.println();
					popup.displayText("I'm sorry morty but I'd never take more from you than I could, Guess I'll need to let the cancer build");
					System.out.println();
					popup.displayText("Ah Geeze");
				}else {
				morty.setEyes(morty.getEyeCount() + choice4ae);}
			}else if (choice3.contains("arm")){
				if(morty.getArmCount() < choice4ae) {
					System.out.println();
					popup.displayText("I'm sorry morty but I'd never take more from you than I could, Guess I'll need to let the cancer build");
					System.out.println();
					popup.displayText("Ah Geeze");
				}else {
				morty.setArms(morty.getArmCount() + choice4ae);}
			}else if (choice3.contains("tentacle")){
				if(morty.getTentacleAmount() < choice4t) {
					System.out.println();
					popup.displayText("I'm sorry morty but I'd never take more from you than I could, Guess I'll need to let the cancer build");
					System.out.println();
					popup.displayText("Ah Geeze");
				}else {
				morty.setTentacles(morty.getTentacleAmount() + choice4t);}
			}else if (choice3.contains("Bloop")){
				morty.setBloop(true);
			}else {
				System.out.println();
				popup.displayText("Hmm, I might have forgotten to carry the 2, well lets see what happens anyways");}
		}
		System.out.println();
		popup.displayText("AHHHHHHHHHHHHHHHH");
		System.out.println();
		popup.displayText(morty.toString());
		
		popup.displayText("I'M MR MEESEEKS LOOK AT MEEEEEE!");
		String answer = popup.getResponse("WHAT IS YOUR REQUEST?");
		popup.displayText(answer);
	}
}
