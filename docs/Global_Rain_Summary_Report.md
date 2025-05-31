Pseudocode
When you are done implementing the Pet class, refer back to the Pet BAG Specification Document and select either the pet check in or check out method. These methods are detailed in the Functionality section of the specification document.
 
Write pseudocode that lays out a plan for the method you chose, ensuring that you organize each step in a logical manner. Remember, you will not be creating the actual code for the method. You do not have to write pseudocode for both methods. Your pseudocode must not exceed one page.
 
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
 
Flowchart
Based on the pseudocode you wrote, create a flowchart using a tool of your choice for the method you selected. In your flowchart, be sure to include start and end points and appropriate decision branching, and align the flowchart to the check in or check out process. Your flowchart must be confined to one page.
 
[Insert your flowchart image here. Refer to the Project One Supporting Materials for tool options to create your flowchart and support for copying images into this template.]
 
OOP Principles Explanation
Briefly explain how you applied object-oriented programming principles and concepts (such as encapsulation, inheritance, and so on) in your software development work thus far. Your explanation should be one paragraph, or four to six sentences.
 
In developing the Pet class for the Pet BAG application, I applied key object-oriented programming principles including encapsulation and inheritance. Encapsulation was implemented by making all attributes private and providing public accessor and mutator methods, which protects the data from unauthorized access and maintains data integrity. The class structure follows the UML diagram specifications, allowing for future inheritance where specialized pet types (like Dog or Cat) could extend the base Pet class. This approach promotes code reusability, maintainability, and a clear separation of concerns, which are fundamental aspects of object-oriented design.
