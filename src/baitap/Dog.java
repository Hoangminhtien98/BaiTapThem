package baitap;

public class Dog extends Animal implements AnimalFunction {
    private int speed;

    public Dog() {
    }

    public Dog(String name, double weight, int age, int speed) {
        super(name, weight, age);
        this.speed = speed;
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Gâu gâu";
    }
}
