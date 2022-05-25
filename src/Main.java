public class Main {
    public static void main(String[] args) {

        Walkable dog = new Dog("Tom");

        Walkable shark = new Shark(7);

        Walkable cow = new Cow(5);

        Walkable[] animals = {dog, shark, cow};
        for (Walkable eatable : animals) {

            System.out.println(eatable);

        }

        dog.run();

        cow.run();

        shark.run();
        cow.eat();
        Walkable.sleep();

    }
}




