package com.exercise.computer.classes;

import com.exercise.computer.interfaces.computerOperations;

public class computer implements computerOperations{
	private String className = " ";

	public computer() {
		this.className = "Computer";
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void turnOn() {
		System.out.println(getClassName()+" is now turned on!");
		
	}

	public void turnOff() {
		System.out.println(getClassName()+" is now turned off!");
		
	}

	public void performDownload() {
		System.out.println(getClassName()+" is now performing a download!");
		
	}

	public void performUpload() {
		System.out.println(getClassName()+" is now performing a upload!");
		
	}

	public void playVideo() {
		System.out.println(getClassName()+" is now playing a video!");
		
	}

	public void playMusic() {
		System.out.println(getClassName()+" is now playing a music!");
		
	}
	
	
	
	

}
