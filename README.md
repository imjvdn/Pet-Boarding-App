# Pet Boarding and Grooming Application

## Project Overview
This application is designed for Pet Boarding and Grooming (Pet BAG), a local pet boarding and grooming business. The software aims to modernize operations by replacing inefficient paper-based processes with a digital solution for pet check-in and check-out.

## Project Structure
```
Pet-Boarding-App/
├── docs/                   # Documentation files
│   └── Global_Rain_Summary_Report.md  # Project summary report
├── src/                    # Source code
│   ├── Pet.java            # Pet class implementation
│   ├── PetTest.java        # Test class for successful scenarios
│   ├── PetTestFailures.java # Test class for failure scenarios
│   └── TEST_RESULTS.md     # Documentation of test results
└── README.md               # This file
```

## Features
- Pet check-in functionality
- Pet check-out functionality
- Pet information management
- Boarding space allocation
- Cost calculation

## Implementation Details
The application is built using object-oriented programming principles in Java. The core `Pet` class handles pet information, space allocation, and cost calculations. The project follows a modular design to allow for future expansion.

## Testing
The project includes comprehensive test files to verify the functionality of the Pet class:

- **PetTest.java**: Tests successful scenarios including constructors, getters, setters, and the check-in process
- **PetTestFailures.java**: Tests error handling for invalid inputs and resource constraints
- **TEST_RESULTS.md**: Documents expected test results and behavior

All tests have been run and verified to ensure the Pet class meets the requirements specified in the UML diagram.

## Development Team
This project is being developed by Global Rain, a software engineering company specializing in custom software design and development.
