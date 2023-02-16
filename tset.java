class Human {
	int age;
	int weight;
	int height;
	String name;
	String gender;

	public Human ( int age, int weight, int height, String name, String gender) {
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.gender = gender;
	}

	public double getBMI() {
		return Math.round(weight / Math.pow(height, 2) * 10000);
	}
}

public class tset {
	public static void main(String[] args) {
		Human human = new Human(30, 74, 177, "test", "maile");
		System.out.println("결과값");
		System.out.println(human.getBMI());
		
	}
}
