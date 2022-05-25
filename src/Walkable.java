public interface Walkable {

     void run();

    static void sleep(){
        System.out.println("animals are sleeping");
    }
    default void eat() {
        System.out.println("animals are eating");

        }

        }




