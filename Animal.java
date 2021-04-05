package STIA1123;

public class Animal {
	String name;
	String Type ;
	String Dietary;
	String Temperature;
	int Weight ;
	
	
	void printAnimal(String n, String t, String d, String p, int w) {
		System.out.println("Animal Name : " + n );
		System.out.println("Animal Type : " + t );
		System.out.println("Animal Dietary : " + d );
		System.out.println("Animal Temperature : " + p );
		System.out.println("Animal Weight : " + w + "kg" );
	}
	
	void Behaviour() {
		String Behaviour = ("1.Hunt \n" + "2.Breath \n" + "3.Eat \n" + "4.Walk");
		System.out.println("Behaviour : \n" + Behaviour);
	}
	
	void Ecosystem() {
		String Ecosystem = ("1. Grassland \n" + "2. Savanna \n" + "3. Dence Scrub \n" + "4. Open Woodland");
		System.out.println("Ecosystem : \n " + Ecosystem);
	
	}
	
	void Lifespan () {
		int Lifespan = (14);
		System.out.println ("Lifespan :" + Lifespan + "years old");
	}
	
	
	
	
	
}
