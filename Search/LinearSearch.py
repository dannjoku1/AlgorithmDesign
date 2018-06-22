# Simple Python program for implementation of Linear Search Algorithm

def linearSearch(arr, target):
    found = "Object not found"

    for i in range(len(arr)):
        if arr[i] == target:
            return i

    return found

print(linearSearch([1, 2, 3, 5, 8, 10, 11, 12, 17, 21], 3))