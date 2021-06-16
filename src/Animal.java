

public class Animal {

    private String name;
    private int braint;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int braint, int body, int size, int weight) {
        this.name = name;
        this.braint = braint;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println(getClass() + ".eat() is called.");
    }

    public void move(int speed) {
        System.out.println("Animel.move() called. Animal is moving at " + speed);

    }


    public String getName() {
        return name;
    }

    public int getBraint() {
        return braint;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
