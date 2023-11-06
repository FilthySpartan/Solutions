
import math

salary = float(input("Enter your salary (£): "))

def getIncomeTax(salary):
    taxper = 0

    if salary >= 0 and salary <= 34500:
        taxper = 20
    elif salary >= 34501 and salary < 150001:
        taxper = 40
    elif salary > 150000:
        taxper = 45

    print("Income tax (%): " + str(taxper))
    tax = round((salary / 100) * taxper, 2)

    return tax

print("Total income tax (£): £" +  str(getIncomeTax(salary)))