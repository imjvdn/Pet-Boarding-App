/**
 * Test class for the Pet class focusing on failure scenarios
 * This class contains a main method to test error handling in the Pet class
 */
public class PetTestFailures {
    public static void main(String[] args) {
        System.out.println("Testing Pet class failure scenarios...\n");
        
        // Test 1: Missing pet name
        System.out.println("Test 1: Missing pet name");
        Pet pet1 = new Pet();
        pet1.setPetType("Dog");
        // Name intentionally left blank
        boolean result1 = simulateCheckIn(pet1, 3, false);
        System.out.println("Check-in should fail: " + (!result1 ? "PASS" : "FAIL") + "\n");
        
        // Test 2: Missing pet type
        System.out.println("Test 2: Missing pet type");
        Pet pet2 = new Pet();
        // Type intentionally left blank
        pet2.setPetName("Rex");
        boolean result2 = simulateCheckIn(pet2, 3, false);
        System.out.println("Check-in should fail: " + (!result2 ? "PASS" : "FAIL") + "\n");
        
        // Test 3: Invalid pet type
        System.out.println("Test 3: Invalid pet type");
        Pet pet3 = new Pet();
        pet3.setPetType("Bird"); // Not Dog or Cat
        pet3.setPetName("Tweety");
        boolean result3 = simulateCheckIn(pet3, 3, false);
        System.out.println("Check-in should fail: " + (!result3 ? "PASS" : "FAIL") + "\n");
        
        // Test 4: No available dog spaces
        System.out.println("Test 4: No available dog spaces");
        Pet pet4 = new Pet();
        pet4.setPetType("Dog");
        pet4.setPetName("Rover");
        boolean result4 = simulateCheckIn(pet4, 3, false, 0, 5); // 0 dog spaces available
        System.out.println("Check-in should fail: " + (!result4 ? "PASS" : "FAIL") + "\n");
        
        // Test 5: No available cat spaces
        System.out.println("Test 5: No available cat spaces");
        Pet pet5 = new Pet();
        pet5.setPetType("Cat");
        pet5.setPetName("Mittens");
        boolean result5 = simulateCheckIn(pet5, 3, false, 5, 0); // 0 cat spaces available
        System.out.println("Check-in should fail: " + (!result5 ? "PASS" : "FAIL") + "\n");
        
        System.out.println("All failure tests completed.");
    }
    
    /**
     * Simulate the check-in process with default space availability
     */
    private static boolean simulateCheckIn(Pet pet, int daysStay, boolean grooming) {
        return simulateCheckIn(pet, daysStay, grooming, 10, 8); // Default: 10 dog spaces, 8 cat spaces
    }
    
    /**
     * Simulate the check-in process with custom space availability
     */
    private static boolean simulateCheckIn(Pet pet, int daysStay, boolean grooming, 
                                          int availableDogSpaces, int availableCatSpaces) {
        // Validate pet information
        if (pet.getPetName().isEmpty() || pet.getPetType().isEmpty()) {
            System.out.println("Error: Pet name and type are required");
            return false;
        }
        
        // Check available spaces based on pet type
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
