
public class Dog {
	private int dogSpaceNumber;
	private int dogWeight;
	private boolean grooming;		
	
	public Dog() {                  // Default constructor
		dogSpaceNumber = 0;         // Default dogSpaceNumber: 0 indicates dogSpaceNumber was not set
		dogWeight = 0;              // Default dogWeight: 0 indicates dogWeight was not set
		grooming = false;           // Default grooming: false unless indicated otherwise		
	}

	// Constructor with arguments
	public Dog(int initDogSpaceNumber, int initDogWeight, boolean initGrooming) {
		dogSpaceNumber = initDogSpaceNumber;                                          
		dogWeight = initDogWeight;
		grooming = initGrooming;
	}
	
	//Getter method for dogSpaceNumber
	public int getDogSpaceNumber() {
		return dogSpaceNumber;
	}
	
	//Setter method for dogSpaceNumber
	public void setDogSpaceNumber(int assignedSpaceNumber) {
		dogSpaceNumber = assignedSpaceNumber;
	}
	
	//Getter method for dogWeight
	public int getDogWeight() {
		return dogWeight;
	}
	
	//Setter method for dogWeight
	public void setDogWeight(int assignedDogWeight) {
		dogWeight = assignedDogWeight;
	}
	
	//Getter method for grooming
	public boolean getGrooming() {
		return grooming;
	}
	
	//Setter method for grooming
	public void setGrooming(boolean assignedGrooming) {
		grooming = assignedGrooming;
	}
}