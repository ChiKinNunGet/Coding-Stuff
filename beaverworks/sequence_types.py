#sequence types in python https://www.pythonlikeyoumeanit.com/Module2_EssentialsOfPython/SequenceTypes.html

def tuples():
    """
    Tuples
        tuples are the last data set type that has to be introduced
        tuples are similar to a list, but constructed usimg () instead of []. 
            For one entry in a tuple, you should put a trailing comma after. x = (3,)
        tuples are immutable so they cant be changed after being created/doesnt support item assignment
        similar to list where it can carry all item types
            x = [2, 4, 8], y = tuple(x)
    """

def sequencereview():
    """
    Sequence review
        String
            Written with '', "", """"""""
            Only contains single characters (from UTF-8)
            immutable after creation
            supports indexing, + and *
            supports methods
        List    
            Written with []
            Contains any other type, including lists and tuples
            mutable after creation 
            supports indexing, + and *
            supports methods
        Tuple
            Written with () (must have a trailing comma if has a single value)
            Contains any other type, including lists and tuples
            immutable after creationg
            supports indexing, + and *
            doesnt support changing methods (supports non-destructive, like len)
        List used most frequently, but tuple can be used as keys, return statements, or error prevention
    """

def working_with_sequences():
    """
    Working with sequences
        sequences include lists, tuples, and strings (not arrays, those are c++ and other)
        Checking if an object is contained in a sequence
            obj in seq
            x = [1, 3, 5]
            3 in x -> True
            Cannot check for subsequences in any sequence (except strings), it must be a single member
            [1, 3] in x -> False
            [1, 3] in [None, [1, 3], None] -> True
        Concatenating sequences (in order)
            [1, 2] + [3, 4] -> [1, 2, 3, 4]
            "c" + "at" -> cat
        repeated concatenation (in order) https://www.stackvidhya.com/concatenate-lists-in-python/
            "cat" * 3 = 'catcatcat'
            4 * (1, 2) = (1, 2, 1, 2, 1, 2, 1, 2)
        length method of sequences
            len("dog") = len([1, 2, 3]) = len((4, 5, 6)) = 3
        Getting index/count of x in a sequence
            "cat cat cat".index("t") = 2
            "catcatcat".count('t') = 3
    """

def indexing_and_slicing():
    """
    Indexing and slicing sequences
        Index, access specific values in a sequence
            x = "abcdefg", x[0] = "a"   x[-1] = "g"
            indexing for all starts at 0. negative values loop from the last value
        Cutting a sequence
            gives a subsequence of items in the sequence from start to stop index (stop index exclusive)
            x[0:3] = "abc"
        Indexing diagram
            +---+---+---+---+---+---+
            | P | y | t | h | o | n |
            +---+---+---+---+---+---+
              0   1   2   3   4   5
             -6  -5  -4  -3  -2  -1
        Slicing (different from cutting but fundamentally similar)
            format: listname[a:b:c]
            a = start index (included), b = stop index (excluded), c = increment
            a = "abcdefg"
            a[0:4:1] = 'abcd', a[0:5:2] = 'ace', a[0:0:1] = ''
            default values: start 0, end at length, step 1. you can omit them beteen the :: or type None to get default
                omit second colon entirely to use step 1 default
                seq[:] = 'abcdefg', seq[::2] = 'aceg'
            negative values can be used in a slice too, to traverse backwards
            slice method, seq.slice(a, b, c)
                seq1 = 'apple', seq2 = (1, 2, 3, 4, 5), seq3 = [True, False, None]
                reverse = slice(None, None, -1)
                    seq1[reverse] = 'elppa'
                    seq2[reverse] = (5, 4, 3, 2, 1)
                    seq3[reverse] = [None, False, True]
        Out of bounds indices
            attempting to get a member from a sequence using an out of bounds index raises an IndexError
            But specifying a out of bounds start or stop value will instead revert to the closest valid value
            

    """
