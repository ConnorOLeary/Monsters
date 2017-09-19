package monster.controller;
import monster.model.MarshmallowMonster;
import java.util.*;
public class MonsterController {
	public void start() {
		MarshmallowMonster sample = new MarshmallowMonster();
		System.out.println(sample);
		System.out.println("");
		MarshmallowMonster morty = new MarshmallowMonster("Morty", 2, 2, 0, false );
		System.out.println(morty);
		System.out.println("M- *BURRRP* M-Morty, I, I gotta borrow one of your arms Morty");
		System.out.println("Oh geez Rick, I-I don't know");
		System.out.println("Trust me morty, you won't even feel a thing");
		morty.setArms(1);
		System.out.println("AHHHHHHHHHHH");
		System.out.println(morty);
		interactWithTheMorty(morty);
	}
	
	private void interactWithTheMorty(MarshmallowMonster morty) {
		System.out.println("");
		System.out.println("What should rick Change from morty next?");
		System.out.println("Should he give something or take something?");
		Scanner myScanner = new Scanner(System.in);
		String choice = myScanner.nextLine();
		if (choice.contains("give")){
			System.out.println("What should he give Morty?");
			String choice2 = myScanner.nextLine();
			if(choice2.contains("eye")) {
				morty.setEyes(morty.getEyeCount() + 1);
				System.out.println("Here morty, I have an extra eyeball lying around, w-*BELCH*-Want it?");
				System.out.println("Idk rick, I-I kinda like just having my 2");
				System.out.println("I'll take that as a yes then");
				System.out.println("AHHHHHHHHHHH");
			}else if (choice2.contains("arm")){
				morty.setArms(morty.getArmCount() + 1);
				System.out.println("You know what Morty, I-I'm sorry heres your arm back");
				System.out.println("Wha-what really Rick? Thanks");
				System.out.println("Ya ya, d-don't make me change my mind Morty, here you go");
				System.out.println("AHHHHHHHHHHH");
			}else if (choice2.contains("tentacle")){
				morty.setTentacles(morty.getTentacleAmount() + 1);
				System.out.println("Hey Morty, you want a tentacle?");
				System.out.println("Wait what Rick?");
				System.out.println("I Saaaaaaid, you want a tentacle?");
				System.out.println("I-I'm not sure Rick, that sounds kinda weird");
				System.out.println("S-stop being such pussy morty, here you go");
				System.out.println("AHHHHHHHHHHH");
			}else if (choice2.contains("Bloop")){
				morty.setBloop(true);
			}else {
				System.out.println("What?");
			}
			
		}else if (choice.contains("take")){
			System.out.println("What should he take from Morty?");
			String choice2 = myScanner.nextLine();
			if(choice2.contains("eye")) {
				morty.setEyes(morty.getEyeCount() - 1);
				System.out.println("S-Sorry morty, b-but it looks like I'm gonna need one of your eyes");
				System.out.println("wait what rick?");
				System.out.println("I'm gonna need one of your eyes morty, dont worry morty you won't feel anything, you'll be perfectly fine morty");
				System.out.println("Wait.. but thats what you said about my ar-AHHHHHHHHHHH");
			}else if (choice2.contains("arm")){
				morty.setArms(morty.getArmCount() - 1);
				System.out.println("Alright morty, time for the second one");
				System.out.println("b-but Rick, I still need my second arm, w-without it I can't do normal stuff");
				System.out.println("You won't need to do normal stuff with where we're going morty, now hold still");
				System.out.println("oh gee-AHHHHHHHHHHH");
			}else if (choice2.contains("tentacle")){
				morty.setTentacles(morty.getTentacleAmount() - 1);
				System.out.println("MORTY, I'm gonna need to take a tentacle from you morty");
				System.out.println("w-wait what? But I don't have any tentacles Rick");
				System.out.println("Do I look like I care morty? Now hold still");
				System.out.println("AHHHHHHHHHHH");
			}else if (choice2.contains("Bloop")){
				morty.setBloop(false);
			}else {
				System.out.println("What?");
			}
		}else {
			System.out.println("What?");
		}
		System.out.println(morty);
		
		
		//2nd Iteration
		if (choice.contains("take")){
			System.out.println("You-you know what morty, I'm sorry morty, I shouldn't have taken something from you");
			System.out.println("R-really, ah geeze thanks rick");
			System.out.println("Let me make it up to you morty, just name it and I'll give it to you, an eye, an arm, a tentacle, a bloop");
		}else if (choice.contains("give")){
			System.out.println("I'm gonna be honest with you morty, that whatever I gave you, it had cancer in it morty");
			System.out.println("WAIT WHAT");
			System.out.println("Ya morty, but its too late, its already entered too far into your system morty, I'm gonna need to focus it somewhere, and rip that part right out");
			System.out.println("Ah Geeze Rick");
			System.out.println("I'm gonna leave it up to you what I take and how much of it morty");
		}
		
		
		if (choice.contains("take")){
			System.out.println("What body part?");
			String choice3 = myScanner.nextLine();
			System.out.println("How many?");
			int choice4 = myScanner.nextInt();
			
			System.out.println("Alright here you go morty " + choice4 + " " + choice3 + "s");
			
			if(choice3.contains("eye")) {
				morty.setEyes(morty.getEyeCount() + choice4);
			}else if (choice3.contains("arm")){
				morty.setArms(morty.getArmCount() + choice4);
			}else if (choice3.contains("tentacle")){
				morty.setTentacles(morty.getTentacleAmount() + choice4);
			}else if (choice3.contains("Bloop")){
				morty.setBloop(true);
			}else {
				System.out.println("Hmm, I might have forgotten to carry the 2, well lets see what happens anyways");}
		}else if (choice.contains("give")) {
			System.out.println("What body part?");
			String choice3 = myScanner.nextLine();
			System.out.println("How many?");
			int choice4 = myScanner.nextInt();
			
			if(choice3.contains("eye")) {
				if(morty.getEyeCount() < choice4) {
					System.out.println("I'm sorry morty but I'd never take more from you than I could, Guess I'll need to let the cancer build");
					System.out.println("Ah Geeze");
				}else {
				morty.setEyes(morty.getEyeCount() + choice4);}
			}else if (choice3.contains("arm")){
				if(morty.getArmCount() < choice4) {
					System.out.println("I'm sorry morty but I'd never take more from you than I could, Guess I'll need to let the cancer build");
					System.out.println("Ah Geeze");
				}else {
				morty.setArms(morty.getArmCount() + choice4);}
			}else if (choice3.contains("tentacle")){
				if(morty.getTentacleAmount() < choice4) {
					System.out.println("I'm sorry morty but I'd never take more from you than I could, Guess I'll need to let the cancer build");
					System.out.println("Ah Geeze");
				}else {
				morty.setTentacles(morty.getTentacleAmount() + choice4);}
			}else if (choice3.contains("Bloop")){
				morty.setBloop(true);
			}else {
				System.out.println("Hmm, I might have forgotten to carry the 2, well lets see what happens anyways");}
		}
		System.out.println("AHHHHHHHHHHHHHHHH");
		System.out.println(morty);
	}
}
