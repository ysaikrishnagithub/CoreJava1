package Interface;

public interface Dog {
	void bark(int age);
	static void eat() {
		System.out.println("Eating peddigree");
	}
	default void sleep() {
		System.out.println("sleep 12 hr daily");
	}

}
