package baitap;

public class Mouse extends Animal implements AnimalFunction{
    public Mouse() {
    }

    public Mouse(String name, double weight, int age, int speed) {
        super(name, weight, age, speed);
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return null;
    }
}
