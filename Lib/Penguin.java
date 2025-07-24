package Lib;

public class Penguin extends Bird implements Swimmable {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Squawk!";
    }

    @Override
    public String swim() {
        return "The penguin dives gracefully in the water.";
    }
}
