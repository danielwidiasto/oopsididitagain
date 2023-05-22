package oopgslc;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private static Zoo instance;
	private List<animal> animal_list;
	
	public Zoo() {
		animal_list = new ArrayList<>();
	}
	
	public static Zoo get_instance() {
		if(instance == null) {
			instance = new Zoo();
		}
		return instance;
	}
	
	public void add_animal (animal animal) {
		animal_list.add(animal);
		System.out.println("Added an animal to the zoo.");
	}
	
	public void remove_animal (animal animal) {
		animal_list.remove(animal);
		System.out.println("An animal has have been removed from the zoo.");
	}
	
	public void feed_all_animals() {
		System.out.println("Feeding all animals in the zoo...");
		for(animal animal : animal_list) {
			animal.eat();
		}
	}
}
