#take input and convert to set
#"['q', 'a', 'a', 4, 'b', 'b', 2, 'c', 'c', 3, 'd']""
def run_length_decoder(input):
    listthing = input
    """
    listthing = []
    remove = "[\" ],'"
    for char in remove:
        input = input.replace(char, "")
    #"qaa4bb2cc3d"
    for char in input:
        if char not in "qwertyuiopasdfghjklzxcvbnm":
            listthing.append(int(char))
        else:
            listthing.append(char)
    #['q', 'a', 'a', 4, 'b', 'b', 2, 'c', 'c', 3, 'd']
    """
    i=0
    if len(listthing)>0: 
        while i < (len(listthing)):
            if type(listthing[i]) == int:
                n = listthing[i]
                indexcheck = i-1
                j=0
                listthing.pop(i)
                listthing.pop(i-1)
                for j in range(n-1):
                    listthing.insert(i-2, listthing[i-2])
                    j+=1    
                i-=(n-2)
            else:
                i+=1
    #['q', 'a', 'a', 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'd']
    final = ""
    return ("'"+str(final.join(listthing))+"'")

print(run_length_decoder(["a", "b", "a", "b", "a"]))
print(run_length_decoder(["a", "a", 2, "b", "b", 2, "a", "b", "a"]))
print(run_length_decoder(["a", "b", "b", 4, "a", "a", 2]))
print(run_length_decoder(["a", "a", 4, "b", "b", 2, "c", "c", 3, "d"]))
print(run_length_decoder(["H", "e", "l", "l", 2, "o", " ", "W", "o", "r", "l", "d", "d", 4, "!", "!", 3]))
#[]
#["a", "b", "b", 4, "a", "a", 2]
#['2']