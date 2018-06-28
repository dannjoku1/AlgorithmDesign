#CodeWar
#Implement a method that accepts 3 integer values a, b, c.
# The method should return true if a triangle can be built with the sides of given length and false in any other case.

def isTriangle(a, b, c):
    if (a + b > c) and (b + c > a) and (c + a > b):
        return True
    else:
        return False

a = 1
b = 2
c = 2

isTriangle(a, b, c)
print(isTriangle(a, b, c))
