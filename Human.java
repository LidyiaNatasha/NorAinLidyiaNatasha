package STIA1123;
import java.util.*;
public class Human {
	String gender;
	String name;
	String job;
	int age;
	double weight, height, BMI, total ;
	
	Scanner s = new Scanner(System.in);
	//default constructor
	//Human h = new Human();
	Human() {
		
		System.out.println("Enter gender : ");
		this.gender = s.nextLine();
		s.nextLine();
		System.out.println("Enter name");
		this.name= s.nextLine();
		s.nextLine();		
		System.out.println("Enter job");
		this.job = s.nextLine();
		s.nextLine();
		System.out.println("Enter age");
		this.age = s.nextInt();
		System.out.println("Enter weight");
		this.weight = s.nextDouble();
		System.out.println("Enter height");
		this.height = s.nextDouble();
		System.out.println("Enter BMI");
		this.BMI = s.nextDouble();
		System.out.println("Enter total BMI");
		this.total = s.nextDouble();
	}
	
	
	//Parameterized constructor
	Human(String g, String n, String i, int a, double w, double h, double b){
			this.gender=g;
			this.name=n;
			this.job=i;
			this.age=a;
			this.weight=w;
			this.height=h;
			this.BMI=b;
			this.total = this.weight / (this.height * this.height);
	}


	
}
