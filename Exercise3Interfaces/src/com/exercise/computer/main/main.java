package com.exercise.computer.main;

import com.exercise.computer.classes.computer;
import com.exercise.computer.classes.laptop;
import com.exercise.computer.classes.stationaryComputer;

public class main {

	public static void main(String[] args) {
		computer cpt = new computer();
		laptop lt = new laptop();
		stationaryComputer stc = new stationaryComputer();
		
		cpt.turnOn();
		cpt.performDownload();
		cpt.turnOff();
		
		lt.turnOn();
		lt.performUpload();
		lt.turnOff();
		
		stc.turnOn();
		stc.playMusic();
		stc.playVideo();
		stc.turnOff();

	}

}
