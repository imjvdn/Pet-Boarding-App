# Global Rain Summary Report

## Pet Boarding and Grooming (Pet BAG) Application

### Pseudocode for Pet Check-In Method

FUNCTION checkInPet(pet)
    // Validate pet information
    IF pet.petName is empty OR pet.petType is empty THEN
        DISPLAY "Error: Pet name and type are required"
        RETURN false
    END IF
    
    // Check available spaces based on pet type
    IF pet.petType equals "Dog" THEN
        IF availableDogSpaces > 0 THEN
            DECREMENT availableDogSpaces
            SET pet.dogSpaces to 1
        ELSE
            DISPLAY "Error: No dog spaces available"
            RETURN false
        END IF
    ELSE IF pet.petType equals "Cat" THEN
        IF availableCatSpaces > 0 THEN
            DECREMENT availableCatSpaces
            SET pet.catSpaces to 1
        ELSE
            DISPLAY "Error: No cat spaces available"
            RETURN false
        END IF
    ELSE
        DISPLAY "Error: Invalid pet type"
        RETURN false
    END IF
    
    // Calculate amount due based on stay duration and services
    SET baseCost to pet.daysStay * dailyRate
    
    IF pet.grooming equals true THEN
        SET groomingCost to groomingRate
    ELSE
        SET groomingCost to 0
    END IF
    
    SET pet.amountDue to baseCost + groomingCost
    
    // Add pet to the system
    ADD pet to petRegistry
    
    DISPLAY "Pet successfully checked in"
    RETURN true
END FUNCTION
 
### Flowchart for Pet Check-In Method

[Insert your flowchart image here]
 
### OOP Principles Explanation

In developing the Pet class for the Pet BAG application, I applied key object-oriented programming principles including encapsulation and inheritance. Encapsulation was implemented by making all attributes private and providing public accessor and mutator methods, which protects the data from unauthorized access and maintains data integrity. The class structure follows the UML diagram specifications, allowing for future inheritance where specialized pet types (like Dog or Cat) could extend the base Pet class. This approach promotes code reusability, maintainability, and a clear separation of concerns, which are fundamental aspects of object-oriented design.
