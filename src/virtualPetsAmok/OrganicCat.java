package virtualPetsAmok;

public class OrganicCat extends Cat implements Organic {

	int hunger = 100;
	int thirst = 100;
	int waste = 50;

	public OrganicCat(String petName, String discription, int waste, int hunger, int thirst) {
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

	// public void play() {
	// super.play();
	// hunger += 10;
	// thirst += 15;
	// }

	void cleanLitterBox() {
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
		happiness += 20;
	}

	@Override
	public void healthStatus() {

		if (hunger >= 0 && thirst >= 0) {
			health = ("Pet is healthy");
		} else {
			health = ("Pet died");
		}
	}

	@Override
	public void tick() {
		super.tick();
		hunger += 1;
		thirst += 1;
		waste += 1;
	}

}
