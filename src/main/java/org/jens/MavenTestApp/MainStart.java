package main.java.org.jens.MavenTestApp;

public class MainStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println( "Hello World!" );
        Auto auto = new Auto("Mein TestAuto",Color.blue,100000);
        auto.Fahre(25);
        
        System.out.println(auto.toString());
	}

}
