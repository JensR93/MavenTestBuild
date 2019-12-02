package main.java.org.jens.MavenTestApp;

import java.awt.Color;

public class Auto {

	public String Name;
	public Color Farbe;
	public int KilometerStand;

	public Auto(String name, Color farbe) {
		// TODO Auto-generated constructor stub
		Name = name;
		Farbe = farbe;
	}
	public Auto(String name, Color farbe, int kilometerstand) {
		// TODO Auto-generated constructor stub
		Name = name;
		Farbe = farbe;
		KilometerStand=kilometerstand;
	}

	@Override
	public String toString() {
		return "Das Auto "+ Name+ " ist "+ KilometerStand +" km gefahren";
	}
	
	public int Fahre(int kilometerstand)
	{
		try {
			KilometerStand+=kilometerstand;
		}
		catch (Exception e) {
			System.out.println("ERROR");
		}
		
		return KilometerStand;
	}
}
