package virtualPetsAmok;

public abstract class VirtualPet3 {

	String petName;
	String description;
	int happiness;
	String health;

	public VirtualPet3(String petName, String description, int happiness, String health) {
		this.petName = petName.toUpperCase();
		this.description = description;
		this.happiness = happiness;
		this.health = health;

	}

	public VirtualPet3(String petName, String discription) {
		this.petName = petName;
		this.description = discription;
		this.happiness = 100;
		this.health = "Pet is Healthy";
	}

	public String getName() {
		return petName;
	}

	public String getDescription() {
		return description;
	}

	public int getBoredom() {
		return happiness;
	}

	void hydrate() {

		happiness += 5;
	}

//	void play() {
//		happiness -= 20;
//	}

	public abstract void tick();

}
