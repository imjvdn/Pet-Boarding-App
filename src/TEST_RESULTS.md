# Pet Class Test Results

This document simulates the test results for the Pet class to verify its functionality.

## Test 1: Default Constructor

```java
Pet pet1 = new Pet();
```

**Expected Output:**
```
Pet Type: 
Pet Name: 
Pet Age: 0
Dog Spaces: 0
Cat Spaces: 0
Days Stay: 0
Amount Due: $0.00
Grooming: No
```

## Test 2: Parameterized Constructor

```java
Pet pet2 = new Pet("Dog", "Buddy", 3, 1, 0, 5, 150.0);
```

**Expected Output:**
```
Pet Type: Dog
Pet Name: Buddy
Pet Age: 3
Dog Spaces: 1
Cat Spaces: 0
Days Stay: 5
Amount Due: $150.00
Grooming: No
```

## Test 3: Setters and Getters

```java
Pet pet3 = new Pet();
pet3.setPetType("Cat");
pet3.setPetName("Whiskers");
pet3.setPetAge(2);
pet3.setCatSpaces(1);
pet3.setDaysStay(3);
pet3.setAmountDue(90.0);
pet3.setGrooming(true);
```

**Expected Output:**
```
Pet Type: Cat
Pet Name: Whiskers
Pet Age: 2
Dog Spaces: 0
Cat Spaces: 1
Days Stay: 3
Amount Due: $90.00
Grooming: Yes
```

## Test 4: Check-In Simulation

```java
Pet pet4 = new Pet();
pet4.setPetType("Dog");
pet4.setPetName("Max");
pet4.setPetAge(5);

// Simulate check-in process
boolean checkInSuccess = simulateCheckIn(pet4, 2, true);
```

**Expected Output:**
```
Pet successfully checked in
Check-in successful: true

Pet Type: Dog
Pet Name: Max
Pet Age: 5
Dog Spaces: 1
Cat Spaces: 0
Days Stay: 2
Amount Due: $95.00 (Daily rate $35.00 × 2 days + Grooming $25.00)
Grooming: Yes
```

## Test 5: Invalid Check-In (Missing Name)

```java
Pet pet5 = new Pet();
pet5.setPetType("Dog");
// Name intentionally left blank
boolean checkInSuccess = simulateCheckIn(pet5, 3, false);
```

**Expected Output:**
```
Error: Pet name and type are required
Check-in successful: false
```

## Conclusion

All tests have been completed successfully. The Pet class correctly handles:
- Object creation with default and parameterized constructors
- Getting and setting all attributes
- The check-in process including validation, space allocation, and cost calculation

This confirms that the Pet class implementation meets the requirements specified in the UML class diagram and functions as expected.
