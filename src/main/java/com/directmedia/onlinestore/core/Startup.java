package com.directmedia.onlinestore.core;

import java.util.HashSet;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

public class Startup {
	public static void main(String args[]){
		Artist geraud = new Artist("Géraud");
		Work w1 =new Work("Light moves");
		w1.setRelease(1993);
		Work w2 =new Work("Knowing who knows");
		w2.setRelease(2003);
		Work w3 =new Work("The perfect wisdom");
		w3.setRelease(2022);
		
		HashSet<Work> listOfWorks = new HashSet<Work>();
		listOfWorks.add(w1);
		listOfWorks.add(w2);
		listOfWorks.add(w3);
		Catalogue.setListOfWorks(listOfWorks);

		StringBuilder s = new StringBuilder();
		HashSet<Work> retrievedList = Catalogue.getListOfWorks();
		System.out.println("List of Works:");
		for(Work w : retrievedList) {
			s.append("- "+w.getTitle()+'('+w.getRelease()+')').append("\n");
		}
		
		System.out.println(s.toString());
	
	
	}
}
