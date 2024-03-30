package com.main.zensar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		  List<Player> playerList = new ArrayList<>();   
		int a ;
		System.out.println("Week long sports Event Registration System");
		do {
			a = 0;
			System.out.println("Enter your Choice \n"
		
				+ "Player registration press        'a' \n"
				+ "Display Player Details press     'b' \n"
				+ "Display All Player Details press 'c' \n"
				+ "Delete player press              'd' \n"
				+ "Stop Execution press             '1' \n");
		RegisterPlayer p = new PlayerRegistrationImpl(); 
		String sh = sc.next();
		switch(sh) {
		case "a":
			playerList.add(p.registerPlayer());
			System.out.println("Player informatio added successfully..");
			break;
		case "b":
			p.showPlayerDetails(playerList);
			break;
		case "c": 
			p.showAllPlayer(playerList);
			break;
		case "d":
			p.deletePlayer(playerList);
			break;
		case "1":
			System.exit(0);
			break;
		default:
			System.out.print("Invalid Choise :"+sh); 
		}
		System.out.println("if you want to continue please enter 1 ");
		a = sc.nextInt();
		}while(a == 1);
	}

}
