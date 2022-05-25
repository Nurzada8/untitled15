public class Shark implements Walkable {
    public Shark(int weight) {
        this.weight = weight;
    }

    private int weight;

    @Override
    public void run() {
        System.out.println("Shark is running");
    }

    @Override
    public void eat() {
        Walkable.super.eat();
    }

    @Override
    public String toString() {
        return "Shark{" +
                "weight=" + weight +
                '}';
    }
}
