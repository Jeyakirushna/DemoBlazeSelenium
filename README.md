# Selenium Automation Project for Demo Blaze

## Table of Contents
- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Running the Tests](#running-the-tests)
- [Test Cases](#test-cases)
- [Contributing](#contributing)
- [License](#license)

---

## Project Overview
This project contains Selenium-based automation scripts for the **Demo Blaze** website. The scripts cover end-to-end testing of various features on the site, ensuring its functionality and reliability.

---

## Features
- Automated test cases for core workflows of the Demo Blaze site, such as:
  - User registration and login.
  - Adding products to the cart.
  - Placing an order.
  - Logout functionality.
- Extensive validation for expected vs. actual results.
- Modular design for reusability and scalability.

---

## Technologies Used
- **Programming Language**: Java / Python (replace with your project's language)
- **Test Framework**: TestNG / JUnit / Pytest
- **Build Tool**: Maven / Gradle (if applicable)
- **Automation Tool**: Selenium WebDriver
- **Reporting**: Extent Reports / Allure Reports
- **Version Control**: Git

---

## Setup and Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd demo-blaze-selenium
   ```
3. Install required dependencies:
   - For Maven:
     ```bash
     mvn install
     ```
   - For Python:
     ```bash
     pip install -r requirements.txt
     ```
4. Update the `config.properties` file (or equivalent) with the following details:
   - URL of the Demo Blaze site.
   - Browser preferences (e.g., Chrome, Firefox).
   - Test data paths.

---

## Running the Tests
1. To execute all test cases, use:
   - For Maven:
     ```bash
     mvn test
     ```
   - For Python:
     ```bash
     pytest
     ```
2. To run specific tests, specify the test class or method:
   ```bash
   mvn test -Dtest=TestClassName
   ```

---

## Test Cases
Test cases for this project are documented in a Google Sheets file. You can view the detailed test cases, including steps, expected results, and actual outcomes, by visiting the following link:

[Test Case Sheet](https://docs.google.com/spreadsheets/d/15H7V-R0qR7RyoZDf8linjcA_PABuIO0837q1jwWPtUE/edit?gid=643032625)

---

## Contributing
Contributions are welcome! Follow these steps to contribute:
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-branch-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Your commit message"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-branch-name
   ```
5. Create a pull request.

---

## License
This project is licensed under the [MIT License](LICENSE).

---

### Notes
- Ensure the WebDriver executable is set up and included in the system PATH.
- Use the latest stable version of Selenium and the browser drivers for best results.
