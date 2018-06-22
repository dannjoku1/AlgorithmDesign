# Simple Python program for implementation of Binary Search Algorithm
# Binary search works for a sorted array.
# Note: The code logic is written for an array sorted in
#       increasing order.
# T(n): O(log n)

def binary_search(arr, target):
    low = 0
    high = len(arr) - 1
    found = False
    while (low <= high and not found):
        mid = low + (high - low) // 2
        if arr[mid] == target:
            found = True
        else:
            if target < arr[mid]:
                high = mid - 1
            else:
                low = mid + 1
    return found


print(binary_search([1, 2, 3, 5, 8, 10, 11, 12, 17, 21], 6))
print(binary_search([1, 2, 3, 5, 8, 11, 16, 99], 5))