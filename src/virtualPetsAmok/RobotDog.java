package virtualPetsAmok;

public class RobotDog extends Dog implements Robot {

	public RobotDog(String petName, String discription, int maintenance, int health, int happiness) {
		super(petName, discription);

	}

	@Override
	public void oil() {
	}

	@Override
	public void tick() {
		happiness -= 10;
	}

	@Override
	public void healthStatus() {
	}

}
