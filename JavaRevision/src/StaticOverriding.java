class Parent {
    // Static method in Parent class
    public static void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    // Static method in Child class (hiding the method in Parent class)
    public static void greet() {
        System.out.println("Hello from Child");
    }
}

public class StaticOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Parent parent = new Parent();
        parent.greet();  // Output: Hello from Parent

        // Calling the static method using Child class reference
        Parent childAsParent = new Child();
        childAsParent.greet();  // Output: Hello from Parent (due to reference type)

        // Calling the static method using Child class reference
        Child child = new Child();
        child.greet();  // Output: Hello from Child

	}

}
