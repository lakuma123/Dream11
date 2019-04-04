package com.dream.eleven.Dream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcessPlayerDetails {
static int failedValidTeamCount =0;
static int failedValidCrdeitCount =0;
	static void assignPlayers(List<String> names, List<String> type, List<String> credits,List<List<Integer>> validTeams) {
		int validTeamCount = 0;
		List<Player> playersList = new ArrayList<>();
		for (int i = 1; i <= 22; i++) {
			Player player = new Player();
			player.setNumber(String.valueOf(i));
			player.setName(names.get(i - 1));
			player.setCredits(credits.get(i - 1));
			player.setType(type.get(i - 1));

			//System.out.println(player);
			playersList.add(player);
		}
		
		
		for(List<Integer> team : validTeams){
			List<Player> t1 = new ArrayList<>();
			for(Integer p :team){
				t1.add(getPlayer(playersList,p));
			}
			boolean isValidCredits = isValidCredits(t1);
			if(!isValidCredits){
				failedValidCrdeitCount++;
			}
			boolean isValidTeam = isValidTeam(t1);
		//	System.out.println(t1.toString()+"crdeits : "+isValidCredits +" ValidTeam : "+ isValidTeam);
			if(isValidCredits&&isValidTeam){
				validTeamCount++;
			}
			
		}
		
		System.out.println("validTeamCount "+validTeamCount);
		System.out.println("failedValidTeamCount  "+failedValidTeamCount);
		System.out.println("failedValidCrdeitCount   "+failedValidCrdeitCount);
	}

	private static Player getPlayer(List<Player> playersList, Integer p) {
			for(Player player : playersList){
				if(player.getNumber().equalsIgnoreCase(String.valueOf(p))){
					return player;
				}
			}
		
		return null;
	}

	private static boolean isValidTeam(List<Player> t1) {
		int wk =0;
		int bat =0;
		int ar= 0;
		int bowl =0;
		for(Player p : t1){
			if(p.getType().equalsIgnoreCase("wk")){
				wk++;
			}else if(p.getType().equalsIgnoreCase("bat")){
				bat++;
			}else if(p.getType().equalsIgnoreCase("ar")){
				ar++;
			}else if(p.getType().equalsIgnoreCase("bowl")){
				bowl++;
			}
		}
		if(wk==1 && bat == 4 && ar == 2 && bowl ==4){
		//System.out.println("wk : "+ wk +" bat : "+bat +" ar : "+ar+" bowl : "+bowl);
		}
		if(wk==1 && 3<=bat && bat<=5 && 1<=ar && ar<=3 &&3<=bowl && bowl<=5){
			//System.out.println("valid players");
			//System.out.println("wk : "+ wk +" bat : "+bat +" ar : "+ar+" bowl : "+bowl);
			return true;
		}else{
			failedValidTeamCount++;
		}
		return false;
	}

	private static boolean isValidCredits(List<Player> t1) {
		Double credits = 0.0;
		for(Player p : t1){
			credits= credits+Double.valueOf(p.getCredits());
		}
		if(credits<=100){
			return true;
		}
		return false;
	}

	

}
