package STIA1123;

public class MainHuman {

	public static void main(String[] args) {
		Human a = new Human();
		System.out.println("Gender  : " + a.gender);
		System.out.println("Name  : " + a.name);
		System.out.println("job  : " + a.job);
		System.out.println("age  : " + a.age);
		System.out.printf("Weight: %.2f kg %n",a.weight, "Kg" );
		System.out.printf("Height: %.2f kg %n",a.height, "meter");
		System.out.printf("BMI: %.2fkg %n",a.BMI);
		System.out.printf("total BMI: %.2fkg %n",a.total);
		
		System.out.println("\n\n");
		
		Human b = new Human("Female", "Name", "Idol", 24, 45, 1.68, 16);
		System.out.println("Gender  : " + b.gender);
		System.out.println("Name  : " + b.name);
		System.out.println("job  : " + b.job);
		System.out.println("age  : " + b.age);
		System.out.printf("Weight: %.2f kg %n",b.weight );
		System.out.printf("Height: %.2f kg %n",b.height );
		System.out.printf("BMI: %.2fkg %n",b.BMI);
		System.out.printf("Total BMI: %.2fkg %n",b.total);	

}
}