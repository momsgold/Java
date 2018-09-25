package com.prs.business;

import java.util.ArrayList;


public class UserDB {
	
	public UserDB() {
	}
		
	public ArrayList<User> list() {
		ArrayList<User> users = new ArrayList<>();
		
		return users;
	}

	public boolean add(User u) {
       return true;
	}

	public boolean remove(User u) {
		return true;
	}
}
