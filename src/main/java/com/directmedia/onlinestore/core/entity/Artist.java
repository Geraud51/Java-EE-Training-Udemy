package com.directmedia.onlinestore.core.entity;

public class Artist {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Artist() {
		super();
	}
	
	public Artist(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Artist [name=" + name + "]";
	}
	public static void main(String args[]){
		System.out.println((new Artist("Mahuton")).toString());
	}

}
