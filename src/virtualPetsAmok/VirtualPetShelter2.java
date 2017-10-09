package virtualPetsAmok;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class VirtualPetShelter2 {

	Map<String, VirtualPet3> shelter = new HashMap<>();

	public VirtualPet3 getName(String petName) {
		return shelter.get(petName);
	}

	public Collection<VirtualPet3> allPets() {
		return shelter.values();
	}

	public void addPet(VirtualPet3 newPet) {
		shelter.put(newPet.getName(), newPet);
	}

	public void removePet(String adoptedPet) {
		shelter.remove(adoptedPet);
	}

	public void feedPets() {
		for (VirtualPet3 pet : allPets()) {
			if (pet instanceof Organic) {
				Organic organicPet = (Organic) pet;
				organicPet.feed();
			}
		}
	}

	public void hydratePets() {
		for (VirtualPet3 pet : allPets()) {
			if (pet instanceof Organic) {
				Organic organicPet = (Organic) pet;
				organicPet.hydrate();
			}
		}
	}

	void cleanCages() {
		for (VirtualPet3 pet : allPets()) {
			if (pet instanceof OrganicDog) {
				OrganicDog organicDog = (OrganicDog) pet;
				organicDog.cleanCage();
			}
		}
	}

	void cleanLitterBox() {
		for (VirtualPet3 pet : allPets()) {
			if (pet instanceof OrganicCat) {
				OrganicCat organicCat = (OrganicCat) pet;
				organicCat.cleanLitterBox();
			}
		}
	}

	void walkDog() {
		for (VirtualPet3 pet : allPets()) {
			if (pet instanceof Dog) {
				Dog dog = (Dog) pet;
				dog.walk();
			}
		}
	}
	// public void playOnePet(VirtualPet3 playOnePet) {
	// playOnePet.play();
	// }

	public void timeTick() {
		for (VirtualPet3 pet : allPets()) {
			if (pet instanceof Organic) {
				Organic organicPet = (Organic) pet;
				organicPet.tick();
			} else if (pet instanceof Robot) {
				Robot roboticPet = (Robot) pet;
				roboticPet.tick();
			}
		}
	}
}
