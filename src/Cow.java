public class Cow implements Walkable {
  private   int age;

    public Cow(int age) {
        this.age = age;
    }

    @Override
    public void run() {
        System.out.println("Cow is running ");
    }

    @Override
    public void eat() {
        Walkable.super.eat();
    }

    @Override
    public String toString() {
        return "Cow{" +
                "age=" + age +
                '}';
    }
}
