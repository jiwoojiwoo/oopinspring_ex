package pattern.templateMethodPattern;

public class Driver {
    public static void main(String[] args) {
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        bolt.palyWithOwner();

        System.out.println();
        System.out.println();

        kitty.palyWithOwner();
    }
}
