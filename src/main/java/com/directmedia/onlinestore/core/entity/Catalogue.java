package com.directmedia.onlinestore.core.entity;

import java.util.HashSet;

public class Catalogue {
	private static HashSet<Work> listOfWorks = new HashSet<>(); ;
	


	public static HashSet<Work> getListOfWorks() {
		return listOfWorks;
	}

	public static void setListOfWorks(HashSet<Work> listOfWorks) {
		Catalogue.listOfWorks = listOfWorks;
	}

}
