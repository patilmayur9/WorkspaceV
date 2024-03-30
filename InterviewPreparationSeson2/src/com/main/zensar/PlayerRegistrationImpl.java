package com.main.zensar;
 
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class PlayerRegistrationImpl implements RegisterPlayer {
//	List<Player> playerList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	
	@Override
	public Player registerPlayer() {
		
	 System.out.println("Enter user name");
		String name = sc.nextLine();
	System.out.println("Enter Week day");
		String day = sc.nextLine();
	System.out.println("Enter games name seprated with comma ',' ");
		String games = sc.nextLine(); 
		Set<String> mySet = new HashSet<>(Arrays.asList(games.split(",")));
		String uniqueID = UUID.randomUUID().toString();
		return new Player(name, day, mySet, uniqueID); 
		
	}
	
	
	@Override
	public void showPlayerDetails(List<Player> playerList) {
		if(playerList.isEmpty()) {
			System.out.println("player list is emplty ");
			return;
		}
		// TODO Auto-generated method stub
		System.out.println("Enter player name : ");
		String name = sc.nextLine();
		int count = 0;
		for(Player p: playerList) {
			if(name.equalsIgnoreCase(p.getName())) {
				count = 1;
				System.out.println("Player information is "); 
				System.out.println(p); 
			}
		}
		if(0 == count) 
			System.out.println("Invalid Player Name");
//		 playerList.stream().filter(player -> name.equalsIgnoreCase(player.getName())).;
	}


	@Override
	public void showAllPlayer(List<Player> playerList) {
		if(playerList.isEmpty()) {
			System.out.println("player list is emplty ");
			return;
		}
			
		
		System.out.println("All Player information : ");
//		playerList.stream().forEach(System.out::println);
		 for(Player p : playerList) {
			 System.out.print(p+"\n");
		 }
	}


	@Override
	public void deletePlayer(List<Player> playerList) {
		if(playerList.isEmpty()) {
			System.out.println("player list is emplty ");
			return;
		}
		// TODO Auto-generated method stub
		System.out.println("Enter player name want to delet : ");
		String name = sc.nextLine();
		Player pObje= null;
		 for(Player p : playerList) {
			 if(name.equalsIgnoreCase(p.getName())) {
				 pObje = p;
				 break;
			 }
		 }
		 if(pObje != null) {
			 System.out.println("Player is deleted "+ pObje.getName());
			 playerList.remove(pObje);
		 } else {
			 System.out.println("Player is not present in data base");
		 }
		 
	}

}
