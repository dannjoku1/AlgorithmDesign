# Simple Python program for implementation of Bubble Sort Algorithm

def bubbleSort(arr):
    n = len(arr)
    # if array length is less than 2
    # then return the array
    if (n < 2):
        return arr

    # traverse through all array elements
    for i in range(n):

        # i is equivalent to the elements already in place
        for j in range(0, n - i - 1):

            # traverse the array from 0 to remaining unsorted array
            # swap if the element found is greater
            # than the next element
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]


# test code
arr = [64, 12, 1, 7, 105, 66, 99, 5, 18, 12, 102, 11, 0, 6, -1]

bubbleSort(arr)

print("Sorted array is:")
for i in range(len(arr)):
    print(arr[i])
