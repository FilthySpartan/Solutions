
word = input("Enter a word: ")
lettercount = len(word)

count = 0
vowelcount = 0
vowels = ['a','e','i','o','u']

while count < lettercount:

    if word[count] in vowels:
        print(word[count])
        vowelcount += 1

    
    count += 1

print("Number of vowels: " + str(vowelcount))


