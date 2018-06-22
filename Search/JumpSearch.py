# Simple Python program for implementation of Linear Search Algorithm
import math

def JumpSearch(arr, x, n):

    # Determines block size that needs to be jumped
    step = math.sqrt(n)

    # Finds the block where element is located, if present
    prev = 0
    while arr[int(min(step, n) - 1)] < x:
        prev = step
        step += math.sqrt(n)
        if prev >= n:
            return -1

    # Performs a linear search for x in block beginning with previous element
    while arr[int(prev)] < x:
        prev += 1

        # If we reached next block or end
        # if element does not exist
        if prev == min(step, n):
            return -1

    # If element is found
    if arr[int(prev)] == x:
        return prev

    return -1


# Driver code to test function
arr = [0, 1, 2, 8, 12, 25, 27, 80, 777]
x = 25
n = len(arr)

# Find the index of 'x' using Jump Search
index = jumpSearch(arr, x, n) + 1

# Print the index where 'x' is located
# %.0f trims decimals
print(x, "is located on position", "%.0f" % index, "of the array")