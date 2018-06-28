# CodeWars
# Very simple, given a number, find its opposite.
# ex: 1 -> -1 | 10 -> -10 | 99 -> -99

def oppositeNumber(number):
    return number - number * 2
    # return number * - 1 will also work


number = 100
oppositeNumber(number)

print(oppositeNumber(number))