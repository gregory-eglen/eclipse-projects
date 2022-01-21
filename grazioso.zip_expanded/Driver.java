import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Create a list to hold eligible monkey species to check against user input
    private static ArrayList<String> eligibleSpecies = new ArrayList<String>();
    // Instance variables (if needed)
    
    

    public static void main(String[] args) {
    	String menuSelection = "0"; // Variable for menu selection
    	Scanner scnr = new Scanner(System.in); // Initialize Scanner


        initializeDogList();
        initializeMonkeyList();

        // While loop to display the menu options to the user
        while (!"q".equals(menuSelection)) {
        		displayMenu();
        		menuSelection = scnr.nextLine();
        		if ("1".equals(menuSelection)) {
        			intakeNewDog(scnr);
        		} else if ("2".equals(menuSelection)) {
        			intakeNewMonkey(scnr);
        		} else if ("3".equals(menuSelection)) {
        			reserveAnimal(scnr);
        		} else if ("4".equals(menuSelection) || "5".equals(menuSelection) ||
        				"6".equals(menuSelection)) {
        			printAnimals(menuSelection);
        		} else {
        			System.out.println("\n\nError: Invalid Selection\n\n");
        			continue;
        		}
        }
        
        // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are ready for service and available");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "in service", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "in service", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    // Adds monkey eligible species to eligible species list
    public static void initializeMonkeyList() {
    	eligibleSpecies.add("capuchin");
    	eligibleSpecies.add("guenon");
    	eligibleSpecies.add("macaque");
    	eligibleSpecies.add("marmoset");

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
    	Boolean dogBoolean;
        System.out.println("What is the dog's name?");
        String dogName = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(dogName)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            } else {
            	System.out.println("What is the dog's breed?");
            	String dogBreed = scanner.nextLine();
            	System.out.println("What is the dog's gender?");
            	String dogGender = scanner.nextLine();
            	System.out.println("What is the dog's age?");
            	String dogAge = scanner.nextLine();
            	System.out.println("What is the dog's weight?");
            	String dogWeight = scanner.nextLine();
            	System.out.println("What is the dog's acquisition date?");
            	String dogAcquisitionDate = scanner.nextLine();
            	System.out.println("What is the dog's acquisition country?");
            	String dogAcquisitionCountry = scanner.nextLine();
            	System.out.println("What is the dog's training status?");
            	String dogTrainingStatus = scanner.nextLine();
            	System.out.println("Has the dog been reserved? y/n");
            	String dogReserved = scanner.nextLine();
            	if (dogReserved.equals("y")) {
            		dogBoolean = true;
            	} else {
            		dogBoolean = false;
            	}
            	System.out.println("What country will the dog be placed into service?");
            	String dogServiceCountry = scanner.nextLine();
            	
            	// Construct new dog using user inputs and add it to dogList
            	Dog newDog = new Dog(dogName, dogBreed, dogGender, dogAge, dogWeight,
            			dogAcquisitionDate, dogAcquisitionCountry, dogTrainingStatus,
            			dogBoolean, dogServiceCountry);
            	dogList.add(newDog);   	
            }
        }
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
        	boolean monkeyBoolean;
            System.out.println("What is the monkey's name?");
            String monkeyName = scanner.nextLine();
            // Input validation to check if a monkey is already is the list
            for(Monkey monkey: monkeyList) {
            	if(monkey.getName().equalsIgnoreCase(monkeyName)) {
            		System.out.println("\n\nThis monkey is already in our system\n\n");
            		return; //returns to menu
            	}
            }
            System.out.println("What is the monkey's species?");
            String monkeySpecies = scanner.nextLine();
            // Input validation to check if a monkey is an eligible species
        	if(!(eligibleSpecies.contains(monkeySpecies.toLowerCase()))) {
        		System.out.println("\n\nThis monkey is not a valid species for training\n\n");
        		return; // returns to menu
        	}
            System.out.println("What is the monkey's tail length?");
            String monkeyTail = scanner.nextLine();
            System.out.println("What is the monkey's height?");
            String monkeyHeight = scanner.nextLine();
            System.out.println("What is the monkey's body length?");
            String monkeyLength = scanner.nextLine();
            System.out.println("What is the monkey's gender?");
            String monkeyGender = scanner.nextLine();
            System.out.println("What is the monkey's age?");
            String monkeyAge = scanner.nextLine();
            System.out.println("What is the monkey's weight?");
            String monkeyWeight = scanner.nextLine();
            System.out.println("What is the monkey's acquisition date?");
            String monkeyDate = scanner.nextLine();
            System.out.println("What is the monkey's acquisition country?");
            String monkeyCountry = scanner.nextLine();
            System.out.println("What is the monkey's training status?");
            String monkeyTraining = scanner.nextLine();
            System.out.println("Has the monkey been reserved y/n?");
            String monkeyReserved = scanner.nextLine();
            if (monkeyReserved.equals("y")) {
            	monkeyBoolean = true;
            } else {
            	monkeyBoolean = false;
            }
            System.out.println("What country will the monkey be place into service?");
            String monkeyService = scanner.nextLine();
            
            Monkey newMonkey = new Monkey(monkeyName, monkeySpecies, monkeyTail, monkeyHeight, monkeyLength, monkeyGender, monkeyAge, monkeyWeight, monkeyDate, monkeyCountry,
            		monkeyTraining, monkeyBoolean, monkeyService);
            monkeyList.add(newMonkey);
            System.out.print(monkeyList.get(0).getName() + " added to Monkey List. This monkey is reserved: " + monkeyList.get(0).getReserved());
 
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
        	String reserveAnimalType = "0"; // Initialize variable for reserve menu loop
        	// While loop to check if an animal can be reserved
        	while (reserveAnimalType.equals("0")) {
        		System.out.println("What kind of animal would you like to reserve?");
        		System.out.println("Dog: Enter 1");
        		System.out.println("Monkey: Enter 2");
        		reserveAnimalType = scanner.nextLine();
        		if (reserveAnimalType.equals("1")) {
        			System.out.println("What in service country are you searching for?");
        			String reserveAnimalCountry = scanner.nextLine();
        			for(Dog dog: dogList) {
        				if (dog.getReserved() == false) {
        					if (reserveAnimalCountry.toLowerCase().equals(dog.getInServiceLocation().toLowerCase())) {
        						System.out.println(dog.getName() + " matches your search. Reserving " + dog.getName());
        						dog.setReserved(true);
        						return;
        					}
        						
        				}
    				}
        			System.out.println("There are no dogs matching your search.");
        		} else if (reserveAnimalType.equals("2")) {
        			System.out.println("What in service country are you searching for?");
        			String reserveAnimalCountry = scanner.nextLine();
        			for(Monkey monkey: monkeyList) {
        				if (monkey.getReserved() == false) {
        					if (reserveAnimalCountry.toLowerCase().equals(monkey.getInServiceLocation().toLowerCase())) {
        						System.out.println(monkey.getName() + " matches your search. Reserving " + monkey.getName());
        						monkey.setReserved(true);
        						return;
        					}
        				}
        			}
        			System.out.println("There are no monkeys matching your search.");
        		} else {
        			reserveAnimalType = "0";
        			continue;
        		}
        	}
        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // 4 dog - prints the list of dogs
        // 5 monkey - prints the list of monkeys
        // 6 available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String printAnimalType) {
        	// FIXME: Needs to print a list of all dogs in the array list
        	if (printAnimalType.equals("4")) {
        		System.out.println("This option needs to be implemented");
        	}
        	// FIXME: Needs to print a list of all monkeys in the array list
        	if (printAnimalType.equals("5")) {
        		System.out.println("This option needs to be implemented");
        	}
        	// Option 6 will print a list of all animals that are in service and available
        	if (printAnimalType.equals("6")) {
        		System.out.println("Available dogs ready for service:");
        		for(Dog dog: dogList) {
        			if ((dog.getReserved() == false) && (dog.getTrainingStatus().equals("in service"))) {
        				System.out.println("\nName : " + dog.getName());
        				System.out.println("Breed: " + dog.getBreed());
        				System.out.println("In Service Location: " + dog.getInServiceLocation() + "\n\n");
        				
        			}
        		}
        		System.out.println("Available monkeys ready for service:");
        		for(Monkey monkey: monkeyList) {
        			if ((monkey.getReserved() == false) && (monkey.getTrainingStatus().equals("in service"))) {
        				System.out.println("\nName : " + monkey.getName());
        				System.out.println("Species: " + monkey.getSpecies());
        				System.out.println("In Service Location: " + monkey.getInServiceLocation() + "\n\n");
        			}
        		}
        	}

        }
}

