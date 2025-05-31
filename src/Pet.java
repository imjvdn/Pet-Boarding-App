/**
 * Pet class for Pet Boarding and Grooming (Pet BAG) application
 * This class represents a pet in the system with all relevant attributes and methods
 * as specified in the UML class diagram
 */
public class Pet {
    // Attributes with appropriate data types
    private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces;
    private int catSpaces;
    private int daysStay;
    private double amountDue;
    private boolean grooming;
    
    /**
     * Default constructor
     */
    public Pet() {
        // Initialize with default values
        this.petType = "";
        this.petName = "";
        this.petAge = 0;
        this.dogSpaces = 0;
        this.catSpaces = 0;
        this.daysStay = 0;
        this.amountDue = 0.0;
        this.grooming = false;
    }
    
    /**
     * Parameterized constructor to initialize pet attributes
     * @param petType The type of pet (e.g., "Dog", "Cat")
     * @param petName The name of the pet
     * @param petAge The age of the pet
     * @param dogSpaces Number of dog spaces required
     * @param catSpaces Number of cat spaces required
     * @param daysStay Number of days the pet will stay
     * @param amountDue Amount due for the pet's stay
     */
    public Pet(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.dogSpaces = dogSpaces;
        this.catSpaces = catSpaces;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
        this.grooming = false; // Default value for grooming
    }
    
    // Accessor methods (getters)
    
    /**
     * Get the pet type
     * @return The type of pet
     */
    public String getPetType() {
        return petType;
    }
    
    /**
     * Get the pet name
     * @return The name of the pet
     */
    public String getPetName() {
        return petName;
    }
    
    /**
     * Get the pet age
     * @return The age of the pet
     */
    public int getPetAge() {
        return petAge;
    }
    
    /**
     * Get the number of dog spaces
     * @return Number of dog spaces
     */
    public int getDogSpaces() {
        return dogSpaces;
    }
    
    /**
     * Get the number of cat spaces
     * @return Number of cat spaces
     */
    public int getCatSpaces() {
        return catSpaces;
    }
    
    /**
     * Get the number of days stay
     * @return Number of days the pet will stay
     */
    public int getDaysStay() {
        return daysStay;
    }
    
    /**
     * Get the amount due
     * @return Amount due for the pet's stay
     */
    public double getAmountDue() {
        return amountDue;
    }
    
    /**
     * Check if grooming is requested
     * @return True if grooming is requested, false otherwise
     */
    public boolean getGrooming() {
        return grooming;
    }
    
    // Mutator methods (setters)
    
    /**
     * Set the pet type
     * @param petType The type of pet
     */
    public void setPetType(String petType) {
        this.petType = petType;
    }
    
    /**
     * Set the pet name
     * @param petName The name of the pet
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }
    
    /**
     * Set the pet age
     * @param petAge The age of the pet
     */
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }
    
    /**
     * Set the number of dog spaces
     * @param dogSpaces Number of dog spaces
     */
    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }
    
    /**
     * Set the number of cat spaces
     * @param catSpaces Number of cat spaces
     */
    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }
    
    /**
     * Set the number of days stay
     * @param daysStay Number of days the pet will stay
     */
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }
    
    /**
     * Set the amount due
     * @param amountDue Amount due for the pet's stay
     */
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
    
    /**
     * Set whether grooming is requested
     * @param grooming True if grooming is requested, false otherwise
     */
    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
}
