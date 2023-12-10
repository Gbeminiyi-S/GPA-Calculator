# GPA Calculator

Welcome to the GPA Calculator, a Java program designed to help you calculate your semester GPA based on the courses you've taken. This README provides information on how to interact with the program.

## Getting Started

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Gbeminiyi-S/GPA-Calculator.git
   cd GPA-Calculator
   ```

2. **Run the Program:**
   - Open the project in your preferred Java IDE.
   - Locate and run the `Main` class.
   - Alternatively, run the program through the command line:
     ```bash
     javac Main.java
     java Main
     ```

## Usage

1. **Enter the Number of Courses:**
   - Upon running the program, you will be prompted to enter the number of courses you want to compute GPA for.

2. **Enter Course Details:**
   - For each course, enter the following details:
     - Course name
     - Course unit (between 1 and 6)
     - Score (between 0 and 100)

3. **Review Results:**
   - After entering details for all courses, the program will display a table summarizing your semester.
   - The table includes information such as course name, course unit, grade, and grade unit.

4. **View GPA:**
   - At the end of the table, your GPA for the semester will be displayed.

5. **Repeat or Exit:**
   - If you have more semesters to calculate, you can choose to run the program again.
   - To exit, simply close the program.

## Example

Here is an example of how you would interact with the program:

```bash
Welcome to your personal GPA calculator
*******************************************
How many courses do you want to compute for? 3

Enter the details for course 1
    Course name: CS101
    Course unit (min: 1, max:6): 3
    Score (min: 0, max: 100): 85

Enter the details for course 2
    Course name: MATH202
    Course unit (min: 1, max:6): 4
    Score (min: 0, max: 100): 75

Enter the details for course 3
    Course name: ENG101
    Course unit (min: 1, max:6): 2
    Score (min: 0, max: 100): 92

*** The semester breakdown ***

|---------------|-------------|-------|------------|
| COURSE & CODE | COURSE UNIT | GRADE | GRADE-UNIT |
|---------------|-------------|-------|------------|
| CS101         | 3           | A     | 15         |
| MATH202       | 4           | B     | 16         |
| ENG101        | 2           | A     | 10         |
|--------------------------------------------------|
Your GPA = 3.90
```
