package STIA1123;

public class Main {

	public static void main(String[] args) {
		Animal Lion = new Animal();   //Create new object Lion
		Lion.printAnimal("Lion", "Reptiles", "Carnivore", "Cold-blooded", 230 );
		Lion.Behaviour();
		Lion.Ecosystem ();
		Lion.Lifespan ();
		
		
		System.out.println();
		
		Animal Deer = new Animal();   //Create new object Lion
		Deer.printAnimal("Deer", "Mammals", "Herbivore", "Warn-blooded", 170 );
		Deer.Behaviour();
		Deer.Ecosystem ();
		Deer.Lifespan ();
		
	}
	
}
