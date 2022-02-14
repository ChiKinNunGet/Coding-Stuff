cowcount = int(input())
cowlist = list(input())
removed = (0)
picture_size = (3)
temp_list = []

while (picture_size <= cowcount):
    picture_index = (1)
    pictures = cowcount - picture_size + 1
    counter = (0)
    while (picture_index <= pictures):
        temp_list = cowlist[picture_index-1: picture_index+picture_size-1]
        if (temp_list.count("G") == 1):
            counter += 1
        elif (temp_list.count("H") == 1):
            counter += 1
        picture_index += 1
    removed += counter
    picture_size += 1
print(removed)