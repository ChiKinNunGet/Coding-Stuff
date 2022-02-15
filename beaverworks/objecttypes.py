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
    Floating point numbers
        floating point is any number with a decimal place, referred to as float and 
        Floats an be expressed in scientific notation
        138000 can be 1.38e-5

        Float precision
            changing a floating point outside its decimal place does nothing
                1.0 + 1e-16 = 1.0
            floating point numbers also result in strange behavior
            1.0+1.0+1.0-3.0 !=0 most times
        Never check if two floating point numbers are equal, check if they are close enough.
        math.isclose((0.1+0.1+0.1-0.3), 0., abs_tol=1e-9)
    """
    """
    Complex numbers
        Standard format: a+bj
            Use j because in engineering current is expressed as i
        variable name: complex
            2+3j
            complex (2, 3)
            complex (0, 1)**2
            all ways, but only j does not work. 1j can work
        Accessing different parts
            x = complex(2+3j)
            x.real = 2
            x.imag = 3            
    """
    """
    Assignment statements
        incrementing numbers or replacing it with a number
            x = x+1
        can be replaced with
            x+=1
        or any other operation
    """
    
"""
booleans
null
strings
lists
"""
