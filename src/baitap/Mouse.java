package baitap;

public class Mouse extends Animal implements AnimalFunction{
    int speed;
    public Mouse() {
    }

    public Mouse(String name, double weight, int age, int speed) {
        super(name, weight, age);
        this.speed = speed;
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Chit chit";
    }

    @Override
    public String toString() {
        return (super.toString() + makeSound());
    }
}
