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
		interactWithTheMonster(morty);
	}
	
	private void interactWithTheMonster(MarshmallowMonster morty) {
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
			}else if (choice2.contains("arm")){
				morty.setArms(morty.getArmCount() + 1);
			}else if (choice2.contains("tentacle")){
				morty.setTentacles(morty.getTentacleAmount() + 1);
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
			}else if (choice2.contains("arm")){
				morty.setArms(morty.getArmCount() - 1);
			}else if (choice2.contains("tentacle")){
				morty.setTentacles(morty.getTentacleAmount() - 1);
			}else if (choice2.contains("Bloop")){
				morty.setBloop(false);
			}else {
				System.out.println("What?");
			}
		}else {
			System.out.println("What?");
		}
		System.out.println(morty);
		
	}
}
