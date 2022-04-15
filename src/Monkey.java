
public class Monkey extends RescueAnimal {	
	//constructor
	public Monkey(String name, String animalType, String gender, String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, Boolean reserved, String inServiceCountry) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

	}

}
