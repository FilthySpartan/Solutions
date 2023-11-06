import random as rand

answer = rand.randint(1, 100)

guessed_correctly = False
count = 1
while guessed_correctly == False:

    guess = input("Guess a number between 1 and 100 (Press 'q' to quit): ")
    if guess == 'q':
        break

    guess = int(guess)
    if guess == answer:
        print("Correct guess, that took " + str(count) + " attempts.")
        guessed_correctly = True
    elif guess > answer:
        print("Incorrect, too high")
    elif guess < answer:
        print("Incorrect, too low")
    count += 1
    
print("Thanks for playing!")