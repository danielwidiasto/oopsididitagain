package oopgslc;

public class ZooManagementSystem {
    public static void main(String[] args) {
        // Get the instance of the Zoo
        Zoo zoo = Zoo.get_instance();

        // Create instances of animals
        bird parrot = new bird();
        reptile snake = new reptile();

        // Add animals to the zoo
        zoo.add_animal(parrot);
        zoo.add_animal(snake);

        // Feed all animals in the zoo
        zoo.feed_all_animals();

        // Perform basic behaviors
        parrot.chirping();
        snake.regulateBodyTemperature();
    }
}
