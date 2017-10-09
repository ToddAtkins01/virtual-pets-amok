package virtualPetsAmok;

public class Dog extends VirtualPet3 {

	public Dog(String petName, String discription) {
		super(petName, discription);

	}

	public void walk() {
		happiness += 20;

	}

	@Override
	public void tick() {
		happiness -= 10;
	}

}
