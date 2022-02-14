#gives 7 numbers, which are a+b+c, a+b, a+c, b+c, a, b, c.
#given 7 munbers in random order, figure out a,b,c
d, e, f, g, h, i, j  = input().split()
inputs = [int(d), int(e), int(f), int(g), int(h), int(i), int(j)]
inputs.sort()
a = inputs[0]
b = inputs[1]
sum = inputs[6]
c = int(sum) - int(a) - int(b)
print(a, b, c)