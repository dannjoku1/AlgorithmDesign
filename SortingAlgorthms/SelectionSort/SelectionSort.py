
def selectionSort(arr):
    # Traverse through all array elements
    for i in range(len(arr)):

        # Find the minimum element in remaining
        # unsorted array
        min_idx = i
        for j in range(i + 1, len(arr)):
            if arr[min_idx] > arr[j]:
                min_idx = j

        # Swap the found minimum element with
        # the first element
        arr[i], arr[min_idx] = arr[min_idx], arr[i]

# Driver code to test above
arr = [12, 11, 13, 5, 6, 34, 56, 17, 88, 17, 15]
selectionSort(arr)
print("Sorted array is:")
for i in range(len(arr)):
    print("%d" % arr[i]),