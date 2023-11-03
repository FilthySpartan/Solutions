
import math

salary = 20000

def getIncomeTax(salary):
    taxper = 0

    if salary >= 0 and salary <= 34500:
        taxper = 20
    elif salary >= 34501 and salary < 150001:
        taxper = 40
    elif salary > 150000:
        taxper = 45

    tax = (salary / 100) * taxper

    return tax

print(getIncomeTax(salary))