# basic python object types

"""Checking types: isinstance, type"""
def typetest():
    x = 1
    print(type(x))
    print(isinstance(x, int))
    print(isinstance(x, bool))

print("blogosphere"[::2]*5)

def numbers():
    """
    numbers:
        there are int, and floating point. int have no decimal, floating point do
        dividing two numbers in python 3 always gives floating point, eg. 4/2 = 2.0
            x+y sum
            x-y difference
            x*y product
            x/y quotient 
            x//y floor value quotient, always returns integer
            x%y modulo division
            x**y x raised to the y power
            -x negated x
            abs(x) absolute value of x
            x==y check if two values are equal, returns boolean (True, False)
            x!=y check if two values are not equal, returns bool. ! is not
            x>y check greater
            x>=y check greater or equal to
    """
    """
    python math module:
        python standard library math module gives more math functions
        syntax:
        
        import math
        math.sqrt(4.)
        math.log10(10.)
        math.factorial(4)
    """
    """
    integers are any whole number
    """

"""
booleans
null
strings
lists
"""
