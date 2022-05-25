public class Dog implements Walkable {

  private   String name;

    public Dog(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void eat() {
        Walkable.super.eat();
    }
}