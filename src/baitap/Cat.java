package baitap;

public class Cat extends Animal implements AnimalFunction {
    private int speed;


    public Cat() {
    }

    public Cat(String name, double weight, int age, int speed) {
        super(name, weight, age);
        this.speed = speed;
    }
    public void eat(Mouse mouse){
        System.out.println("Ăn chuột:");
        super.setWeight(super.getWeight() + mouse.getWeight());
    }

    @Override
    public String toString() {
        return (super.toString() + makeSound());
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "Mèo kêu: meow meow";
    }
}
