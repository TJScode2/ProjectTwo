
public class Monkey extends RescueAnimal {	
	Boolean tail;

	//constructor
	public Monkey(String name, String animalType, String gender, String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, Boolean reserved, String inServiceCountry) {
        setName(name);
        setTail(tail);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
	}

	// Accessor Method
	public Boolean getTail() {
		return tail;
	}

    // Mutator
	public void setTail(boolean hasTail) {
		tail = hasTail;
	}
}