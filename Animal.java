package STIA1123;
import java.util.*;
public class Animal {
	String name;
	String Type ;
	String Dietary;
	String Temperature;
	int Weight ;
	double averagelifespan;
	boolean Hunting;
	
	Scanner s = new Scanner(System.in);
	void printAnimal(String n, String t, String d, String p, int w) {
		System.out.println("Animal Name : " + n );
		System.out.println("Animal Type : " + t );
		System.out.println("Animal Dietary : " + d );
		System.out.println("Animal Temperature : " + p );
		System.out.println("Animal Weight : " + w + "kg" );
	}
	void printAnimalScanner() {
		System.out.println("Enter Animal Name, Type, Dietary, Temperature and Weight : ");
		String n = s.nextLine();
		String t = s.nextLine();
		String d = s.nextLine();
		String p = s.nextLine();
		int w = s.nextInt();
		
		System.out.println("Animal Details");
		System.out.println("Name :" + n + "\n" + "Type :" + t + "\n" +"Dietary :" + d + "\n" + "Temperature :" + p + "\n" + "Weight :" + w + "kg");
	}


void AverageWeightScanner() {
	double [] weight = new double [100];
	double totalweight = 0, averageweight = 0;
	int count = 0, respond;
	do {
		System.out.print("Please enter the weight of an animal(in kg): ");
		weight[count] = s.nextDouble();
		totalweight += weight[count];
		count++;
		System.out.print("Do you want to continue?(1 for yes 0 for no): ");
		respond = s.nextInt();
	} while (respond == 1);
	averageweight = totalweight/count;
	System.out.printf("The total weight of animal : %.2f kg %n",totalweight);
	System.out.printf("The average weight of animals : %.2f kg %n",averageweight);
}
	
	void Behaviour() {
		String Behaviour = ("1.Hunt \n" + "2.Breath \n" + "3.Eat \n" + "4.Walk");
		System.out.println("Behaviour : \n" + Behaviour);
	}
	
	void Hunting (boolean Hunting) {
		if (Hunting == true) {
			System.out.println("The animal do hunting for eat");
		}
		else {
			System.out.println("The animal do not hunting for eat");
		}
	}
	
	
	void Ecosystem() {
		String Ecosystem = ("1. Grassland \n" + "2. Savanna \n" + "3. Dence Scrub \n" + "4. Open Woodland");
		System.out.println("Ecosystem : \n " + Ecosystem);
	
	}
	
	void averageLifespan () {
		double averageLifespan = (14);
		System.out.println ("averageLifespan :" + averageLifespan + "years old");
	}
	
	
	
	
	
}
