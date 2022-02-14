#each cow starts at a coordinate and a direction
#they then start going in a direction and eating the grass in that square
#if one hits a square that has been eated it stops
#some can reach infinity
number_of_cows = int(input())
class cow:
    def __init__(self, number, direction, x_location, y_location):
        self.number = number
        self.direction = str(direction)
        self.x_location = int(x_location)
        self.y_location = int(y_location)

cow_number = 0
while cow_number < number_of_cows:
    cows_direction, cows_x_location, cows_y_location = input().split() 
    cowname = str(cow_number)
    cowname = cow(cow_number, cows_direction, cows_x_location, cows_y_location)
    cow_number += 1

#print(2.x_location)