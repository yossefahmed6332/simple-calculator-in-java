# Simple Calculator in Java

This is a **simple interactive calculator** program written in Java. It allows the user to perform **basic arithmetic operations** and some **mathematical functions** using the `Math` library, with input validation to prevent errors like dividing by zero or entering non-numeric values.

## Features

- **Basic arithmetic operations**:  
  - Addition (`+`)  
  - Subtraction (`-`)  
  - Multiplication (`*`)  
  - Division (`/`) – handles division by zero  
  - Power (`pow`) – calculates `x` raised to the power of `y`  

- **Optional functions on the result**:  
  - Square root (`sqr`)  
  - Absolute value (`abs`)  

- **Input validation**:  
  - Ensures that both first and second numbers are valid numeric values.  
  - Re-prompts the user if invalid input is detected.  
  - Prevents division by zero.  

---

## How to Use

1. Run the `Main.java` file in a Java-supported IDE or terminal.  
2. Enter the first number.  
3. Choose an operation (`+`, `-`, `*`, `/`, or `pow`).  
4. Enter the second number.  
   - For division, entering zero is not allowed.  
   - The program will keep asking until a valid number is provided.  
5. Optionally, choose a function to apply to the result:  
   - `sqr` → square root of the result  
   - `abs` → absolute value of the result  
6. The program will display the final result.  

---

## Example Session
hello! it is simple calculator you only add two numbers , please add first number:
5
yours is: 5
now enter operation between + , - , *, /
enter "pow" for power (x power y)
add your operation:
pow
enter second number
3
result: 125.0
do you want use absolute Value or square root?
enter sqr to use square root enter abs to use absolute Value enter any value to refuse
sqr
result: 11.180339887498949
that's your last result: 11.180339887498949, thanks for use my calculator

---

## Code Organization Notes

- Input reading and validation are handled with `while` loops to ensure proper user input.  
- `switch` statements are used for operation selection.  
- Optional functions (`sqr` and `abs`) reuse the same variable for efficiency.  
- The code currently uses nested loops for reading the second number and handling division.  

---

## TODO / Next Steps

1. **Refactor loops for readability**  
   - Combine nested loops for second number input into a single reusable function.  

2. **Error handling improvements**  
   - Prevent program crash on non-numeric input anywhere.  
   - Handle unexpected inputs for optional functions.  

3. **Add more math functions**  
   - Exponentials, logarithms, trigonometric functions.  

4. **Support multiple calculations in one run**  
   - Allow the user to continue with the result as the new first number.  

5. **Code modularization**  
   - Split code into methods like `readNumber()`, `readOperation()`, `calculateResult()`.  

6. **Better user interface**  
   - Clearer prompts and instructions.  
   - Display the history of calculations.  

---

## Notes

- This project is a **personal effort** by the author, demonstrating understanding of **Java basics**: variables, loops, input handling, and `switch` statements.  
- The README is **manually adapted** from your code to reflect its current behavior and features.



