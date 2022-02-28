# basic python object types

def typetest():
    """
    Checking types: isinstance, type
    it can also do multiple at once
    """
    x = 1
    print(type(x))
    print(isinstance(x, int))
    print(isinstance(x, bool))
    print(isinstance(x, (bool, int)))

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
    python math module:
        python standard library math module gives more math functions
        syntax:
        
        import math
        math.sqrt(4.)
        math.log10(10.)
        math.factorial(4)
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
    Assignment statements
        incrementing numbers or replacing it with a number
            x = x+1
        can be replaced with
            x+=1
        or any other operation
    """

def bool(): 
    """
    Booleans
        Boolean definined as logic operator
            Only True, or False
            must be capitalized
        Tests for booleans
            type(True) -> bool
            isinstance(False, bool) -> True
        Logic operators exist for bool
            And and Or operators, "And" is "&", "Or" is "|"
        Comparison statements always output bool
        For specific reasons, True and False are equal to 0, 1 respectively
    """

def null():
    """
    null
        Null defined as a variable holding nothing, "None"
            type(none) -> NoneType
        y = None
        use "is" instead of == for checking variable similarity
            "is" checks if two objects are identical, "==" checks if both objects are associated to the
            same amound.
        None example:
            #code is to get the first item in a list that is over 10, notifies if there is no such number
            large_num = None
            for number in [1, 2, 3, 4]:
                if number > 10:
                    large_num = number
                    break
            if large_num is None:
                print("no number greater than 10")
    """

def string():
    """
    strings
        Strings are used to store characters
            String can be formed using single quote, double quote, or 3 of single/double quote
            Strings can contain characters from any character in UTF-8 unicode
        Strings belong to the str type
            type("hello") -> str
            Also use str to turn other things into strings
            str(10.34) -> "10.34"
        Strings are immutable, they cannot be turned into a different type without creating a new string
        A String stores a sequence of characters, and has a means to index them
            sentence  = "the cat in the hat"
            sentence[0] = 'T'
            sentence[0:3] = "The"
        String essentials
            Backslash characters   
                backslash can act as a "backout" character that is not interpreted as part of the string
                \n acts as a newline, \t acts as a tab, \\n can be used to make "\n" a string
            String methods
                Many different string methods exist
                    https://docs.python.org/3/library/stdtypes.html#string-methods
        Formatting strings
            To implement variables and other into strings, you need to use formatting
            "{name} is {age} years old".format(name = "bruce", age=80)
                outputs as "bruce is 80 years old"
            Note: if you see % as a string formatter, this is old python 2 and should not be used
            Python 3.6 introduces f-strings for formatting
                batman = 6
                catwoman = 12
                f"Batman has {batman} apples. Catwoman has {catwoman} apples. Together they have {batman+catwoman} apples"
                no need for format method at the end
    """

def lists():
    """
    Lists
        Lists store a sequence of other objects
        Lists can store any objects
            It also provides us with the means to update them later
        List is created with square brackets [], and sections are separated by commas. Contents do not have to be the same type
        Expressions can also be included in the list, including other lists
            x = "hello"
            [2<3, x.capitalize(), 5**2, [1, 2]] == [True, 'Hello', 25, [1, 2]]
        Built in list type can also convert other sequences into lists
            list("apple") = ['a', 'p', 'p', 'l', 'e']
        Lists are sequences, so order matters. It also supports indexing and slicing
            x = [2, 4, 6, 8, 10]
            len(x) = 5, x[0] = 2, x[1:3] = [4, 6]
        Lists can also be mutated after their creation, unlike strings
            x = [1, 2, 3, 4, 5]
            x[1:4] = ["apple", -3, -4]
            x = [1, 'apple', -3, -4, 5]
        List functions/methods also exist
            listname.append(adds) adds to the end
            listname.extend([adds]) adds a sequence to the end (another list)
            listname.remove(index) removes an object at the index
            listname.pop(index) removes, and also returns the value of the item removed
    """