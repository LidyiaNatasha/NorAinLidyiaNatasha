package STIA1123;
import java.util.*;

public class Fruits {
	Scanner s = new Scanner(System.in);

	String name;
	String color;
	String taste;
	String JuiceContent;
	int size;
	double weight;
	double totalWeight;
	
	  
	 // Create Setter Method
	  public void setName(String name) {
		  System.out.println ("Enter the name :");
	    this.name = s.nextLine();
	  }
	  
	  public void setColor(String color) {
		  System.out.println ("Enter the color :");
		  this.color = s.nextLine();
	  }
	  
	  public void setTaste(String taste) {
		  System.out.println ("Enter the taste :");
		  this.taste = s.nextLine();
	  }
	  
	  public void setJuiceContent(String JuiceContent) {
		  System.out.println ("Enter the Juice Content :");
		    this.JuiceContent = s.nextLine();
	  }
	  
	  public void setSize(int size) {
		  System.out.println ("Enter the size :");
	    this.size = s.nextInt();
	  }
	  
	  public void setWeight(double weight) {
		  System.out.println ("Enter the weight :");
		  this.weight = s.nextDouble();;
	  }

	  // Create Getter Method
	  
	 public String getName() {
		  return this.name;
	  }
	  
	  public String getColor() {
	 	  return this.color;
 	  }
	  
	  public String getTaste() {
	 	  return this.taste;
 	  }
	  public String getJuiceContent() {
	 	  return this.JuiceContent;
 	  }
	  public Integer size() {
		  return this.size;
	  }
	  public double getWeight() {
		  return this.weight;
	  }
	  
	
	public double getTotalWeight() {
		this.totalWeight = this.weight;
		return this.totalWeight;
	}
}
