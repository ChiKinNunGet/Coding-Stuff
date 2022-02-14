#every possible image of a single cow without partners

cowcount = int(input()) #number of cows
cowlist = list(input()) #list with all cows
removed = (0) #running count of removed images
picture_size = (3) #size of picture

temp_list = [] #temporary list, cows in each picture

def loop_over_size(size):
    picture_index = (1) #picture number with a certain size
    pictures = cowcount - size + 1 #total number of pictures with this size
    counter = (0)
    while (picture_index <= pictures):
        temp_list = cowlist[picture_index-1: picture_index+size-1]
        if (temp_list.count("G") == 1):
            counter += 1
        elif (temp_list.count("H") == 1):
            counter += 1
        picture_index += 1
    return counter

while (picture_size <= cowcount):
    removed += loop_over_size(picture_size)
    picture_size += 1

print(removed)