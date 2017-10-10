package virtualPetsAmok;

public class RobotCat extends Cat implements Robot {

	public RobotCat(String petName, String discription, int maintenance, int health, int happiness) {
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
