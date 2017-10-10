package virtualPetsAmok;

public abstract class VirtualPet3 {

	String petName;
	int happiness;
	String health;

	public VirtualPet3(String petName, String health) {
		this.petName = petName.toUpperCase();
		this.happiness = 100;
		this.health = "Pet is Healthy";

	}

	public String getName() {
		return petName;
	}

	public int getHappiness() {
		return happiness;
	}

	public String getHealth() {
		return health;
	}

	void hydrate() {

		happiness += 5;
	}

	void play() {
		happiness -= 20;
	}

	public abstract void tick();

}
