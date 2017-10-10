package virtualPetsAmok;

public class Cat extends VirtualPet3 {

	public Cat(String petName, String discription) {
		super(petName, discription);

	}

	@Override
	public void tick() {
		happiness -= 10;
	}

}
