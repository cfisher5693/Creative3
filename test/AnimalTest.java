package test;

import java.util.ArrayList;
import model.Animal;
import model.Herbivore;
import model.Omnivore;
import model.Carnivore;

public class AnimalTest {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Herbivore("White-Tailed Deer", "Odocoileus Virginianus"));
		animals.add(new Herbivore("Horse", "Equus Ferus"));
		animals.add(new Omnivore("Dog", "Canis Lupus"));
		animals.add(new Omnivore("Brown Bear", "Ursus Arctos"));
		animals.add(new Carnivore("Great White Shark", "Carcharodon Carcharias"));
		animals.add(new Carnivore("Tiger", "Panthera Tigris"));
		for(var a: animals) {
			System.out.println(a.toString());
		}
	}
}
