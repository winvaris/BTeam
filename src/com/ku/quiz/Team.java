package com.ku.quiz;

import java.util.HashMap;
import java.util.Map;

public class Team {
	
	private Map<String, String> members;
	private static Team instance;
	
	private Team() {
		members = new HashMap<String, String>();
	}
	
	public static Team getInstance() {
		if (instance == null) {
			instance = new Team();
		}
		return instance;
	}
	
	/**
	 * Add a new member to team.
	 * @param id id of a new member.
	 * @param name name of a new member.
	 */
	public void addMember(String id, String name) {
		members.put(id, name);
	}
	
	/**
	 * Display all team members on screen.
	 */
	public void displayMembers() {
		System.out.println("id          name");
		for (String id: members.keySet()) {
			System.out.println(id + "  " + members.get(id));
		}
	}
}
