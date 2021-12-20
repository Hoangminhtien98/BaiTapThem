package baitap;

public class Cat extends Animal implements AnimalFunction {
    private int speed;
    public void eat(){
        System.out.println("Nhoàm nhoàm");
    }

    public Cat() {
    }

    public Cat(String name, double weight, int age, int speed) {
        super(name, weight, age);
        this.speed = speed;
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
