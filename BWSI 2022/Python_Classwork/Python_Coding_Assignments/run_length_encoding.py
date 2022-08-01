#input string
#separate string into characters in a list, create second list
#create index
stringthing = list(input())
outputthing = []

#loop through stringthing and replace consecutive repeated letters with the letters concatenated together
for i in range(len(stringthing)):
    if i == 0:
        outputthing.append(stringthing[i])
    elif stringthing[i] == stringthing[i-1]:
        outputthing[-1] = outputthing[-1] + stringthing[i]
    else:
        outputthing.append(stringthing[i])
i=0
while i < len(outputthing):
    a = len(outputthing[i])
    if a>1:
        outputthing[i] = outputthing[i][0]
        outputthing.insert(i+1, outputthing[i][0])
        outputthing.insert(i+2, a)
        i+=3
    else:
        outputthing[i] = outputthing[i]
        i+=1
    

print(outputthing)

















def run_length_encoder(stringthing):
    stringthing = list(stringthing)
    outputthing = []
    for i in range(len(stringthing)):
        if i == 0:
            outputthing.append(stringthing[i])
        elif stringthing[i] == stringthing[i-1]:
            outputthing[-1] = outputthing[-1] + stringthing[i]
        else:
            outputthing.append(stringthing[i])
    i=0
    while i < len(outputthing):
        a = len(outputthing[i])
        if a>1:
            outputthing[i] = outputthing[i][0]
            outputthing.insert(i+1, outputthing[i][0])
            outputthing.insert(i+2, a)
            i+=3
        else:
            outputthing[i] = outputthing[i]
            i+=1
    return(outputthing)
