package com.ku.quiz;

public class Main {
	
	/**
	 * Add team members and display it.
	 * @param args not used
	 */
	public static void main(String[] args) {
		Team team = Team.getInstance();
		
		// add team members here.
		team.addMember("5610545757", "Manatsawin Hanmongkolchai");
		team.addMember("5610545749", "Pongsachon Pronsriniyom" );
		team.displayMembers();
	}
	
}
