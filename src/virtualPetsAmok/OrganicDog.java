package virtualPetsAmok;

public class OrganicDog extends Dog implements Organic {

	int hunger = 100;
	int thirst = 100;
	int waste = 50;

	public OrganicDog(String petName, String discription, int waste, int hunger, int thirst) {
		super(petName, discription);
		this.waste = waste;
		this.hunger = hunger;
		this.thirst = thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getWaste() {
		return waste;
	}

	public void walk() {
		super.walk();
		hunger += 5;
		thirst += 10;
		waste -= 30;
	}

	// public void play() {
	// super.play();
	// hunger += 10;
	// thirst += 15;
	// }

	void cleanCage() {
		waste -= 50;
	}

	@Override
	public void feed() {
		hunger -= 20;
		thirst += 5;
		waste += 15;
	}

	@Override
	public void hydrate() {
		hunger += 0;
		thirst -= 20;
		waste += 5;
	}

	@Override
	public void healthStatus() {

		if (hunger >= 0 && thirst >= 0 && waste <= 150) {
			health = ("Pet is healthy");
		}
		health = ("Pet died");
	}

	@Override
	public void tick() {
		super.tick();
		hunger += 1;
		thirst += 1;
		waste += 1;
	}

}
