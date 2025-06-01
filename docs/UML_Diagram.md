# Pet Class UML Diagram Documentation

## Class Overview

The `Pet` class is designed to represent pets in a boarding and grooming application. It encapsulates all the information needed to manage pets in the system, including their basic information, boarding details, and financial information.

## UML Class Diagram

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

## Attributes

| Attribute   | Type    | Description                                         |
|-------------|---------|-----------------------------------------------------|
| petType     | String  | Type of pet (e.g., "Dog", "Cat")                    |
| petName     | String  | Name of the pet                                     |
| petAge      | int     | Age of the pet in years                             |
| dogSpaces   | int     | Number of dog spaces allocated (0 or 1)             |
| catSpaces   | int     | Number of cat spaces allocated (0 or 1)             |
| daysStay    | int     | Number of days the pet will stay                    |
| amountDue   | double  | Total amount due for the pet's stay and services    |
| grooming    | boolean | Whether grooming service is requested (true/false)  |

## Constructors

| Constructor | Parameters | Description |
|-------------|------------|-------------|
| Pet() | None | Default constructor that initializes all attributes to default values (empty strings for text, 0 for numbers, false for boolean) |
| Pet(String, String, int, int, int, int, double) | petType, petName, petAge, dogSpaces, catSpaces, daysStay, amountDue | Parameterized constructor that initializes all attributes with the provided values |

## Methods

### Accessor Methods (Getters)

| Method | Return Type | Description |
|--------|-------------|-------------|
| getPetType() | String | Returns the pet type |
| getPetName() | String | Returns the pet name |
| getPetAge() | int | Returns the pet age |
| getDogSpaces() | int | Returns the number of dog spaces allocated |
| getCatSpaces() | int | Returns the number of cat spaces allocated |
| getDaysStay() | int | Returns the number of days the pet will stay |
| getAmountDue() | double | Returns the total amount due |
| getGrooming() | boolean | Returns whether grooming is requested |

### Mutator Methods (Setters)

| Method | Parameters | Description |
|--------|------------|-------------|
| setPetType(String) | petType | Sets the pet type |
| setPetName(String) | petName | Sets the pet name |
| setPetAge(int) | petAge | Sets the pet age |
| setDogSpaces(int) | dogSpaces | Sets the number of dog spaces allocated |
| setCatSpaces(int) | catSpaces | Sets the number of cat spaces allocated |
| setDaysStay(int) | daysStay | Sets the number of days the pet will stay |
| setAmountDue(double) | amountDue | Sets the total amount due |
| setGrooming(boolean) | grooming | Sets whether grooming is requested |

## Implementation Notes

1. **Encapsulation**: All attributes are private, with public getters and setters to control access.
2. **Data Validation**: The implementation should include validation to ensure:
   - petType is either "Dog" or "Cat"
   - petName is not empty
   - petAge is non-negative
   - dogSpaces and catSpaces are appropriate for the pet type
   - daysStay is positive
   - amountDue is calculated correctly based on daysStay and services

3. **Business Logic**: The Pet class serves as a foundation for the pet boarding system, with methods that can be extended to include:
   - Check-in process
   - Check-out process
   - Cost calculation
   - Space allocation

## Relationship to Other Classes

In a complete system, the Pet class would likely have relationships with other classes such as:

- **Customer**: A customer can have multiple pets
- **Boarding**: Manages the boarding spaces available
- **Grooming**: Manages grooming services
- **Billing**: Handles payment processing

These relationships would be implemented in a full object-oriented design of the Pet Boarding and Grooming application.
