
public class Monkey extends RescueAnimal {
	
	// Instance variable
	private String species;     // Variable to indicate Monkey species
	private String tailLength;  // Variable for measurement of Monkey's tail
	private String height;      // Variable for measurement of Monkey's height
	private String bodyLength;  // Variable for measurement of Monkey's body length
	
	// Constructor method
	public Monkey(String name, String species, String tailLength,
			String height, String bodyLength, String gender, String age,
			String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry) {
		setName(name);
		setSpecies(species);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
	}
	
	// Monkey species setter method
	public void setSpecies(String inputSpecies) {
		this.species = inputSpecies;
	}
	
	// Monkey species getter method
	public String getSpecies() {
		return species;
	}
	
	// Monkey tailLength setter method
	public void setTailLength(String inputTailLength) {
		this.tailLength = inputTailLength;
	}
	
	// Monkey tailLength getter method
	public String getTailLength() {
		return tailLength;
	}
	
	// Monkey height setter method
	public void setHeight(String inputHeight) {
		this.height = inputHeight;
	}
	
	// Monkey height getter method
	public String getHeight() {
		return height;
	}
	
	// Monkey bodyLength setter method
	public void setBodyLength(String inputBodyLength) {
		this.bodyLength = inputBodyLength;
	}
	
	// Monkey bodyLength getter method
	public String getBodyLength() {
		return bodyLength;
	}
}