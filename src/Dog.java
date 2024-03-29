

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("dog.chew() called");
    }

//    @Override
//    public void eat() {
//        super.eat();
//        System.out.println("Dog.eat() called");
//        chew();
//    }



    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("Dog.move() called.");
        moveLegs(speed);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called.");
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }


}
