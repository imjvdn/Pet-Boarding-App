# Global Rain Summary Report

**Project:** Pet BAG Project: Pet Class and Check-In Method  
**Client:** Pet Boarding and Grooming (Pet BAG)  
**Developer:** Jadan Morrow  
**Date:** May 31, 2025  
**Version:** 1.0

## Executive Summary

This report summarizes the development work completed for the Pet Boarding and Grooming (Pet BAG) application. The primary goal of this initial phase was to design and implement the foundational Pet class according to the provided UML specifications, and to develop the logic for the pet check-in process. This document includes pseudocode, a flowchart, and an explanation of the object-oriented programming principles applied in the implementation.

## Project Overview

Pet Boarding and Grooming (Pet BAG) is a local business seeking to modernize its operations by replacing inefficient paper-based processes with a digital solution. The application will initially focus on two key functional areas: pet check-in and pet check-out. This report focuses on the Pet class implementation and the pet check-in process.

## Class Implementation

### Pet Class Overview

The Pet class serves as the foundation of the Pet BAG application, encapsulating all essential information about pets being boarded at the facility. This class was implemented according to the UML specifications provided by Global Rain, with careful attention to proper encapsulation and documentation.

> **Implementation Note:** The Pet class is designed to be extensible, allowing for future specialized pet types (e.g., Dog, Cat) to inherit from it while maintaining a consistent interface for the application.

### Key Attributes

| Attribute | Data Type | Description |
|-----------|-----------|-------------|
| petType | String | Type of pet (e.g., "Dog", "Cat") |
| petName | String | Name of the pet |
| petAge | int | Age of the pet in years |
| dogSpaces | int | Number of dog spaces assigned |
| catSpaces | int | Number of cat spaces assigned |
| daysStay | int | Duration of stay in days |
| amountDue | double | Total cost for boarding and services |
| grooming | boolean | Whether grooming service is requested |

### Check-In Process

The check-in process is a critical component of the Pet BAG application, ensuring that pets are properly registered and that space availability is accurately tracked. The following pseudocode and flowchart detail the logic for this process.

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

![Pet Check-In Process Flowchart](https://i.imgur.com/mUAft3x.png)

*This flowchart visualizes the pet check-in process as described in the pseudocode, including validation of pet information, checking for available spaces, calculating costs, and registering the pet in the system.*
 
## Object-Oriented Programming Principles

In developing the Pet class for the Pet BAG application, I applied several key object-oriented programming principles to ensure the code is robust, maintainable, and extensible. Below is a detailed explanation of how these principles were implemented:

### Encapsulation

Encapsulation is the bundling of data and methods that operate on that data within a single unit (class), and restricting direct access to some of the object's components. This principle was implemented in the Pet class by:

- **Private Attributes:** All class attributes (petType, petName, petAge, etc.) were declared as private, preventing direct access from outside the class.
- **Public Accessor Methods:** Getter methods were implemented for all attributes, providing controlled read access.
- **Public Mutator Methods:** Setter methods were implemented with appropriate validation to ensure data integrity.

> **Code Example:** The Pet class implements encapsulation by making attributes private and providing public getters and setters:
> ```java
> private String petName;
> 
> public String getPetName() {
>     return petName;
> }
> 
> public void setPetName(String petName) {
>     this.petName = petName;
> }
> ```

### Inheritance

While not explicitly implemented in this phase, the Pet class was designed with inheritance in mind. The class structure allows for future specialized pet types (like Dog or Cat) to extend the base Pet class, inheriting its attributes and methods while adding type-specific functionality.

### Abstraction

Abstraction involves hiding complex implementation details and showing only the necessary features of an object. The Pet class provides a clean interface through its methods, abstracting away the internal details of how pet data is stored and processed.

### Polymorphism

The design of the Pet class supports future polymorphic behavior, where specialized pet types could override methods like calculating boarding costs based on pet-specific requirements.

## Future Considerations

### Planned Enhancements

As the Pet BAG application evolves, several enhancements are planned to extend its functionality:

- **Specialized Pet Classes:** Implementing Dog and Cat classes that inherit from the Pet base class to handle type-specific requirements.
- **Validation Improvements:** Adding more robust validation for pet attributes to ensure data integrity.
- **Service Customization:** Expanding the grooming options to include different service levels and pet-specific treatments.
- **Space Management:** Implementing a more sophisticated system for tracking and allocating boarding spaces.

### Technical Debt Considerations

The current implementation has been designed to minimize technical debt, but some areas for future improvement include:

- Implementing comprehensive exception handling for edge cases
- Adding unit tests to ensure code reliability during future modifications
- Considering design patterns like Factory or Strategy for managing different pet types

## Conclusion

The implementation of the Pet class and the check-in process logic provides a solid foundation for the Pet BAG application. By adhering to object-oriented programming principles, the code is structured to be maintainable, extensible, and robust. The pseudocode and flowchart for the check-in process demonstrate a comprehensive approach to handling the business logic requirements.

As development continues, the application will evolve to include more features while maintaining the clean design principles established in this initial phase.
