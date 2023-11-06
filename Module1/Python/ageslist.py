# part 1
ages = [12,18,33,84,45,67,12,82,95,16,10,23,43,29,40,34,30,16,44,69,70,74,38,65,36,83,50,11,79,64,78,37,3,8,68,22,4,60,33,82,45,23,5,18,28,99,17,81,14,88,50,19,59,7,44,93,35,72,25,63,11,69,11,76,10,60,30,14,21,82,47,6,21,88,46,78,92,48,36,28,51]

newages = [12,18,33,84,45,67,12,82,95,16,10,23,43,29,40,34,30,16,44,69,70,74,38,65,36,83,50,11,79,64,78,37,3,8,68,22,4,60,33,82,45,23,5,18,28,99,17,81,14,88,50,19,59,7,44,93,35,72,25,63,11,69,11,76,10,60,30,14,21,82,47,6,21,88,46,78,92,48,36,28,51]
# # part 2
# print("Part 2")
ageslen = len(ages)
# print(ageslen)

# # part 3
# print("Part 3")
# for age in len(ages) - 1:
#     print(age)

# # part 4
# print("Part 4")
# for age in len(ages) - 1:
#     age != 1
#     print(age)

# part 5
print("Part 5")
#print(ages)
index = 0

for age in ages:
    if age < 16 or age > 65:
        newages.remove(age)

print(newages)

# part 6
print("Part 6")
newcount = 0
for age in ages:
    if age >= 16 and age <= 25:
        newcount += 1
    
print(newcount)

# part 7
print("Part 7")
ages.sort()
print(ages)

# part 8
print("Part 8")
