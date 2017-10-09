package virtualPetsAmok;

import java.util.Scanner;

public class VirtualPetShelter2App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter2 coopersShelter = new VirtualPetShelter2();
		RobotDog spanky = new RobotDog("Spanky", "Robotic Dog", 50, 50, 10);
		RobotCat careBear = new RobotCat("CaraBear", "Robotic Cat", 50, 50, 10);
		OrganicDog cooper = new OrganicDog("Cooper", "Organic Dog", 40, 50, 20);

		coopersShelter.addPet(spanky);
		coopersShelter.addPet(careBear);
		coopersShelter.addPet(cooper);

		while (!coopersShelter.shelter.isEmpty()) {

			System.out.println("Welcome to Cooper's Virtual Pet Shelter!!");
			System.out.println();
			// System.out.println("This is the status of our available pets:");
			// System.out.println();
			// System.out.println("Name \t|Hunger |Thirst |Boredom");
			// System.out.println("-----\t|-------|-------|------");
			for (VirtualPet3 pets : coopersShelter.allPets()) {
				// System.out.println(pets.getName() + "\t|" + pets.getHunger() + "\t|" +
				// pets.getThirst() + "\t|"
				// + pets.getBoredom());
			}
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("Press 1 to Feed all the organic pets.");
			System.out.println("Press 2 to Hydrate all the organic pets.");
			System.out.println("Press 3 to Oil all the robotic pets.");
			System.out.println("Press 4 to Walk all the dogs");
			System.out.println("Press 5 to Clean all of the dog cages.");
			System.out.println("Press 6 to Clean the literbox.");
			// System.out.println("Press 7 to play with the pets.");
			System.out.println("Press 8 to Adopt a Pet");
			System.out.println("Press 9 to Admit a new Pet.");
			System.out.println("Press 10 to Leave the Shelter.");

			int userOption = input.nextInt();

			while (userOption != 1 && userOption != 2 && userOption != 3 && userOption != 4 && userOption != 5
					&& userOption != 6 && userOption != 7 && userOption != 8 && userOption != 9 && userOption != 10)
				;

			switch (userOption) {

			case 1:
				coopersShelter.feedPets();
				System.out.println("Thank you for feeding the pets!");
				System.out.println();
				System.out.println();
				coopersShelter.timeTick();
				break;

			case 2:
				coopersShelter.hydratePets();
				System.out.println("Thank you for giving the pets something to drink!");
				System.out.println();
				System.out.println();
				coopersShelter.timeTick();
				break;

			case 3:
				System.out.println("Which pet would you like to play with?");
				System.out.println("Enter their name to continue.");
				for (VirtualPet3 currentPet : coopersShelter.allPets()) {
					System.out.println(currentPet.petName + ", the " + currentPet.getDescription());
				}
				String petToPlayWith = (input.next()).toUpperCase();
				coopersShelter.getName(petToPlayWith).play();
				System.out.println("You played with " + petToPlayWith);
				System.out.println();
				System.out.println();
				coopersShelter.timeTick();
				break;

			case 4:
				System.out.println("So who would you like to adopt?");
				for (VirtualPet3 currentPet : coopersShelter.allPets()) {
					System.out.println(currentPet.petName + ", " + currentPet.getDescription());
				}
				System.out.println();
				System.out.println("Please enter the pet you would like to adopt.");
				String adoptedPet = (input.next()).toUpperCase();
				coopersShelter.removePet(adoptedPet);
				System.out.println("You adopted " + adoptedPet + "!");
				System.out.println();
				System.out.println();
				coopersShelter.timeTick();
				break;

			case 5:
				System.out.println("Looks like your little friend needs a new home.");
				System.out.print("What is the pet's name? ");
				String newPet = (input.next()).toUpperCase();
				System.out.print("What type or breed is this pet? ");
				String newDescription = input.nextLine();
				VirtualPet3 addedPet = new VirtualPet3(newPet, newDescription);
				coopersShelter.addPet(addedPet);
				System.out.println();
				System.out.println("Thank you, rest assured Cooper's Shelter will take GREAT care of " + newPet + ".");
				System.out.println();
				System.out.println();
				coopersShelter.timeTick();
				break;

			case 6:
				System.out.println("Thank you so much for stopping by Cooper's Shelter! Take Care!");
				System.exit(0);

				// if (!digiPet.petIsAlive(digiPet.petName)) {
				// System.out.println("You KILLED " + digiPet.petName + "! You BASTARD!!!!");
				//
			}
		}
		input.close();

	}
}
