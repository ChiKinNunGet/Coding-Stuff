#rock paper scissors game


import random


def main():
    print("Welcome to the Rock Paper Scissors Game!")
    print("The rules are simple:")
    print("Rock beats Scissors")
    print("Scissors beats Paper")
    print("Paper beats Rock")
    print("The first to 5 wins!")
    print("Good Luck!")
    print()

    player_score = 0
    computer_score = 0

    while player_score < 5 and computer_score < 5:
        player = input("Rock, Paper, or Scissors? ").lower()
        computer = random.choice(["rock", "paper", "scissors"])
        print("Computer plays", computer)
        print()

        if player == computer:
            print("It's a tie!")
        elif player == "rock":
            if computer == "paper":
                print("You lose!", computer, "covers", player)
                computer_score += 1
            else:
                print("You win!", player, "smashes", computer)
                player_score += 1
        elif player == "paper":
            if computer == "scissors":
                print("You lose!", computer, "cut", player)
                computer_score += 1
            else:
                print("You win!", player, "covers", computer)
                player_score += 1
        elif player == "scissors":
            if computer == "rock":
                print("You lose...", computer, "smashes", player)
                computer_score += 1
            else:
                print("You win!", player, "cut", computer)
                player_score += 1
        else:
            print("That's not a valid play. Check your spelling!")

        print("The score is currently:")
        print("Player:", player_score)
        print("Computer:", computer_score)
        print()

    if player_score > computer_score:
        print("You win the game!")
    else:
        print("You lose the game!")


main()


