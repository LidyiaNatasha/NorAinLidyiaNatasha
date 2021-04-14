package STIA1123;

public class MainFruits {

	public static void main(String[] args) {
				
		Fruits w = new Fruits();
		
		w.setName("Watermelon");
		w.setColor("Green & Red");
		w.setTaste("Sweet");
		w.setJuiceContent("92%");
		w.setSize(9);
		w.setWeight(10);

		System.out.println("Fruits: " + w.getName());
		System.out.println("Color: " + w.getColor());
		System.out.println("Taste: " + w.getTaste());
		System.out.println("Juice Content: " + w.getJuiceContent());
		System.out.println("Size: " + w.size() + "cm");
		System.out.printf("Weight: %.2f kg %n",w.getWeight());
		System.out.printf("Total weight: %.2fkg %n",w.getTotalWeight());
		System.out.println();

		Fruits L = new Fruits();
		L.setName("Lemon");
		L.setColor("Yellow");
		L.setTaste("Sour");
		L.setJuiceContent("25%");
		L.setSize(5);
		L.setWeight(0.5);


		System.out.println("Fruits: " + L.getName());
		System.out.println("Color: " + L.getColor());
		System.out.println("Taste: " + L.getTaste());
		System.out.println("Juice Content: " + L.getJuiceContent());
		System.out.println("Size: " + L.size() + "cm");
		System.out.printf("Weight: %.2f kg %n",L.getWeight());
		System.out.printf("Total weight: %.2fkg %n",L.getTotalWeight());
		System.out.println();
		}

}
