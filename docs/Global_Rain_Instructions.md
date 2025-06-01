# Global Rain Project Instructions

## Project Overview

Global Rain is a software engineering company specializing in custom software design and development. As part of our contract with Pet Boarding and Grooming (Pet BAG), we are developing a custom software solution to replace their paper-based processes.

## Assignment Requirements

### 1. Create a Pet Class Based on UML Diagram

Create a Java class named `Pet` that implements the following UML diagram:

```
+----------------------------------+
|              Pet                 |
+----------------------------------+
| - petType: String                |
| - petName: String                |
| - petAge: int                    |
| - dogSpaces: int                 |
| - catSpaces: int                 |
| - daysStay: int                  |
| - amountDue: double              |
| - grooming: boolean              |
+----------------------------------+
| + Pet()                          |
| + Pet(String, String, int, int,  |
|       int, int, double)          |
| + getPetType(): String           |
| + setPetType(String): void       |
| + getPetName(): String           |
| + setPetName(String): void       |
| + getPetAge(): int               |
| + setPetAge(int): void           |
| + getDogSpaces(): int            |
| + setDogSpaces(int): void        |
| + getCatSpaces(): int            |
| + setCatSpaces(int): void        |
| + getDaysStay(): int             |
| + setDaysStay(int): void         |
| + getAmountDue(): double         |
| + setAmountDue(double): void     |
| + getGrooming(): boolean         |
| + setGrooming(boolean): void     |
+----------------------------------+
```

### 2. Create Pseudocode and Flowchart for Pet Check-In/Check-Out

Create pseudocode and a flowchart for either the pet check-in or check-out method. The method should:
- Validate pet information
- Check for available space
- Calculate costs
- Process the check-in or check-out

### 3. Apply Object-Oriented Programming Principles

Demonstrate the application of object-oriented programming principles in your implementation:
- Encapsulation
- Inheritance (if applicable)
- Polymorphism (if applicable)
- Abstraction

### 4. Professional Organization

Organize your project professionally:
- Use appropriate directory structure
- Follow coding standards and best practices
- Include proper documentation
- Implement version control using Git

### 5. Testing

Create test cases to verify that the Pet class functions correctly:
- Test constructors
- Test getters and setters
- Test the check-in or check-out method
- Document test results

## Deliverables

1. **Pet.java**: The Java implementation of the Pet class
2. **Global_Rain_Summary_Report.md**: A report containing:
   - Pseudocode for the check-in or check-out method
   - Flowchart for the check-in or check-out method
   - Explanation of object-oriented programming principles applied
3. **Test files**: Java files that test the Pet class functionality
4. **TEST_RESULTS.md**: Documentation of test results

## Evaluation Criteria

Your submission will be evaluated based on:
1. Correct implementation of the Pet class according to the UML diagram
2. Quality and clarity of pseudocode and flowchart
3. Proper application of object-oriented programming principles
4. Professional organization and documentation
5. Thoroughness of testing and test documentation

## Timeline

- **Start Date**: Beginning of the term
- **Due Date**: End of Module 5
- **Review Period**: 1-2 weeks after submission

## Contact Information

For questions or clarifications about this assignment, please contact:
- Project Manager: [Project Manager Name]
- Technical Lead: [Technical Lead Name]
- Email: support@globalrain.com
