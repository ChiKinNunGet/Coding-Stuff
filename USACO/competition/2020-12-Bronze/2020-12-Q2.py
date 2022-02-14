#cow takes pictures, then gets average
#every possible set with consecutive inputs except empty set has a picture
#each picture may have an average flower
number_of_flowers = int(input())
flower_petals = []
flower_petals = input().split()
for x in range (len(flower_petals)):
    flower_petals[x] = int(flower_petals[x])
#get a loop testing each consecutive subset i-j
#nested loops
#first loop decides i, second loop decides j and inside code figures out if there is an average flower
i = 0
picture = []
average_flower_exists = 0
#i goes from 0 to end of petals list
while i <= number_of_flowers-1:
    #j goes from i to end of petals list
    j = i
    while j <= number_of_flowers-1:
        picture.clear()
        #k is the number of flowers in the picture
        k = 1
        #create list of petals in picture
        while k <= int(j-i+1):
            picture.append(flower_petals[i+k-1])
            k += 1
        #get picture average
        picture_avg = (sum(picture))/(len(picture))
        #check if there is average petals
        if picture.count(picture_avg) > 0:
            average_flower_exists += 1
        j = j + 1
    i = i + 1
print(average_flower_exists)