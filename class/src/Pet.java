
public class Pet {
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces = 30;
	private int catSpaces = 12;
	private int daysStay;
	private double amountDue;
	
	public Pet() {                     // Default constructor
		petType = "";
		petName = "";
		petAge = 0;
		dogSpaces = getDogSpaces();
		catSpaces = getCatSpaces();
		daysStay = 0;
		amountDue = 0.0;
	}
	
	//Getter method for getting the type of pet
	public String getPetType() {
		return petType;
	}
	
	//Setter method for setting the type of pet
	public void setPetType(String assignedPetType) {
		petType = assignedPetType;
	}
	
	//Getter method for getting the name of the pet
	public String getPetName() {
		return petName;
	}
	
	//Setter method for setting the name of the pet
	public void setPetName(String assignedPetName) {
		petName = assignedPetName;
	}
	
	//Getter method for getting the age of a pet
	public int getPetAge() {
		return petAge;
	}
	
	//Setter method for setting the age of a pet
	public void setPetAge(int assignedPetAge) {
		petAge = assignedPetAge;
	}
	
	//Getter method for getting the number of dog spaces
	public int getDogSpaces() {
		return dogSpaces;
	}
	
	//Setter method for setting the number of dog spaces
	public void setDogSpaces(int assignedDogSpaces) {
		dogSpaces = assignedDogSpaces;
	}
	
	//Getter method for getting the number of cat spaces
	public int getCatSpaces() {
		return catSpaces;
	}
	
	//Setter method for setting the number of cat spaces
	public void setCatSpaces(int assignedCatSpaces) {
		catSpaces = assignedCatSpaces;
	}
	
	//Getter method for getting the number of days staying
	public int getDaysStay() {
		return daysStay;
	}
	
	//Setter method for setting the number of days staying
	public void setDaysStay(int assignedDaysStay) {
		daysStay = assignedDaysStay;
	}
	
	//Getter method for getting amount due
	public double getAmountDue() {
		return amountDue;
	}
	
	//Setter method for setting amount due
	public void setAmountDue(double assignedAmountDue) {
		amountDue = assignedAmountDue;
	}

}
