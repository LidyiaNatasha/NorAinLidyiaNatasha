package STIA1123;

public class Fruits {
	String name;
	String color;
	String taste;
	String JuiceContent;
	int size;
	double weight;
	double totalWeight;
	
	  
	 // Create Setter Method
	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  public void setColor(String color) {
		    this.color = color;
	  }
	  
	  public void setTaste(String taste) {
		    this.taste = taste;
	  }
	  
	  public void setJuiceContent(String JuiceContent) {
		    this.JuiceContent = JuiceContent;
	  }
	  
	  public void setSize(int size) {
	    this.size = size;
	  }
	  
	  public void setWeight(double weight) {
		  this.weight = weight;
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
	  
	// Create a fullThrottle() method
	public void fullThrottle() {
		System.out.println("The fruits are always healthy and unhygienic!");
	}

	public double getTotalWeight() {
		
		return this.totalWeight;
	}
}
