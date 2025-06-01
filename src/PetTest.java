/**
 * Test class for the Pet class
 * This class contains a main method to test the functionality of the Pet class
 */
public class PetTest {
    public static void main(String[] args) {
        System.out.println("Testing Pet class functionality...");
        
        // Test default constructor
        System.out.println("\nTesting default constructor:");
        Pet pet1 = new Pet();
        printPetDetails(pet1);
        
        // Test parameterized constructor
        System.out.println("\nTesting parameterized constructor:");
        Pet pet2 = new Pet("Dog", "Buddy", 3, 1, 0, 5, 150.0);
        printPetDetails(pet2);
        
        // Test setters
        System.out.println("\nTesting setters:");
        pet1.setPetType("Cat");
        pet1.setPetName("Whiskers");
        pet1.setPetAge(2);
        pet1.setCatSpaces(1);
        pet1.setDaysStay(3);
        pet1.setAmountDue(90.0);
        pet1.setGrooming(true);
        printPetDetails(pet1);
        
        // Test a simple check-in scenario
        System.out.println("\nTesting a simple check-in scenario:");
        Pet pet3 = new Pet();
        pet3.setPetType("Dog");
        pet3.setPetName("Max");
        pet3.setPetAge(5);
        
        // Simulate check-in process (based on our pseudocode)
        boolean checkInSuccess = simulateCheckIn(pet3, 2, true);
        System.out.println("Check-in successful: " + checkInSuccess);
        if (checkInSuccess) {
            printPetDetails(pet3);
        }
        
        System.out.println("\nAll tests completed.");
    }
    
    /**
     * Helper method to print pet details
     * @param pet The pet to print details for
     */
    private static void printPetDetails(Pet pet) {
        System.out.println("Pet Type: " + pet.getPetType());
        System.out.println("Pet Name: " + pet.getPetName());
        System.out.println("Pet Age: " + pet.getPetAge());
        System.out.println("Dog Spaces: " + pet.getDogSpaces());
        System.out.println("Cat Spaces: " + pet.getCatSpaces());
        System.out.println("Days Stay: " + pet.getDaysStay());
        System.out.println("Amount Due: $" + pet.getAmountDue());
        System.out.println("Grooming: " + (pet.getGrooming() ? "Yes" : "No"));
    }
    
    /**
     * Simulate the check-in process based on our pseudocode
     * @param pet The pet to check in
     * @param daysStay Number of days the pet will stay
     * @param grooming Whether grooming is requested
     * @return true if check-in is successful, false otherwise
     */
    private static boolean simulateCheckIn(Pet pet, int daysStay, boolean grooming) {
        // Validate pet information
        if (pet.getPetName().isEmpty() || pet.getPetType().isEmpty()) {
            System.out.println("Error: Pet name and type are required");
            return false;
        }
        
        // Check available spaces based on pet type
        int availableDogSpaces = 10; // Assuming 10 dog spaces for testing
        int availableCatSpaces = 8;  // Assuming 8 cat spaces for testing
        
        if (pet.getPetType().equals("Dog")) {
            if (availableDogSpaces > 0) {
                pet.setDogSpaces(1);
                // In a real system, we would decrement availableDogSpaces here
            } else {
                System.out.println("Error: No dog spaces available");
                return false;
            }
        } else if (pet.getPetType().equals("Cat")) {
            if (availableCatSpaces > 0) {
                pet.setCatSpaces(1);
                // In a real system, we would decrement availableCatSpaces here
            } else {
                System.out.println("Error: No cat spaces available");
                return false;
            }
        } else {
            System.out.println("Error: Invalid pet type");
            return false;
        }
        
        // Set days stay
        pet.setDaysStay(daysStay);
        
        // Set grooming preference
        pet.setGrooming(grooming);
        
        // Calculate amount due
        double dailyRate = 35.0; // Assuming $35 per day for testing
        double groomingRate = 25.0; // Assuming $25 for grooming for testing
        
        double baseCost = pet.getDaysStay() * dailyRate;
        double groomingCost = pet.getGrooming() ? groomingRate : 0;
        
        pet.setAmountDue(baseCost + groomingCost);
        
        // In a real system, we would add the pet to a registry here
        
        System.out.println("Pet successfully checked in");
        return true;
    }
}
