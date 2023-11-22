class multiple2 {
    public void displayMessage() {
        System.out.println("This is another class.");
    }
}

public class MainClass {
    public static void main(String[] args) {
        System.out.println("This is the main class.");

       
        AnotherClass anotherObject = new AnotherClass();
        anotherObject.displayMessage();
    }
}

public class AnotherClass {
    public void displayMessage() {
        System.out.println("This is another class.");
    }
}
