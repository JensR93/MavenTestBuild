package test.java;


import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import main.java.org.jens.MavenTestApp.Auto;

public class TestBuild {

	int kilometer = 14400;
	int fahrleistung = 20;

	@Test
	public void test() {
		Auto auto = new Auto("VW", Color.blue, 14400);
		assertTrue(auto.Fahre(fahrleistung) == fahrleistung + kilometer);
	}

	@Test
	public void test2() {
		Auto auto = new Auto("VW", Color.blue);
		assertTrue(auto.Fahre(fahrleistung) == fahrleistung);
	}

}
