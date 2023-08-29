# Below is the code for a simple calculator. You have 2 main tasks here:
# 1. Edit the code to ensure that it calculates correctly
# 2. Add code to do an additional calculation

print("Welcome to this calculator app! Enter the operator you want to use by choosing the corresponding number... ")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")
### 2. Added the additional line for the new "power" operator 
print("5.Power")
### Added an additional line for new functionality
print("0.Exit Calculator")

### Variable calculate used to control the while loop, 
### this allows multiple uses of the calculator instead of having to run the code each time
calculate = True

while calculate:
    # Take input from the user
    operator = input("Enter operator option: ")

    if operator in ('1', '2', '3', '4','5'):
        firstnum = float(input("Enter first number: "))
        secondnum = float(input("Enter second number: "))

        if operator == '1':
            print(firstnum, "+", secondnum, "=", firstnum + secondnum)

        elif operator == '2':
            print(firstnum, "-", secondnum, "=", firstnum - secondnum)

        # read this block - is this correct? edit it to make sure it is
        ### 1. Changed the 'X' to '*' which is the correct symbol for multiplication operator
        elif operator == '3':
            print(firstnum, "*", secondnum, "=", firstnum * secondnum)

        elif operator == '4':
            print(firstnum, "/", secondnum, "=", firstnum / secondnum)

        # add an additional statement here to calculate the power of the first number by the second number
        ### 2. Added additional elif statement to accommadate the power operator which takes the input as '5'
        elif operator == '5':
            print (firstnum, "**", secondnum, "=", firstnum ** secondnum)
        
      ### If the user enters '0' as their operator input it sets calculate to False, prints an exit message and ends the program
    elif operator == '0':
        calculate = False
        print("Exiting calculator")
        

        
    else:
        print("Invalid Input")