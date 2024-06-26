class Lecture08 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 08");

        // SELF-CHECK PROBLEMS:
        // Section 13.1: Searching and Sorting in the Java Class Libraries
        // 3. Should you use a sequential or binary search on an array of Point objects,
        // and why? You should use a sequential search if:
        // The array is not sorted
        // You should use a binary search if:
        // the array is already sorted

        // 4. Under what circumstances can the Arrays.binarySearch and
        // Collections.binarySearch methods be used successfully?
        // The array or collection must be sorted.

        // 5. In what order does the Collections.sort method arrange a list of strings?
        // How could you arrange them into a different order?
        // The Collections.sort method arranges a list of strings in its natural order if possible. A, B, C...

        // Section 13.2: Program Complexity
        // 9. Approximate the runtime of the following code fragment listed in Canvas
        // Because we are doubling j each time, it is based on a logarithm base 2.
        // Time Complexity: O(log n)

        // 10. Approximate the runtime of the following code fragment listed in Canvas
        // The first sum increment statement appears in the outer loop executing every time, n - 1.
        // The second sum increment appears in the inner loop with the condition n % 2 == 0.
        // Which only executes on even numbers, which is half of n. n/2.
        // (n - 1) + n/2 = 1.5n - 1
        // Time Complexity: O(n)

        // 11. Approximate the runtime of the following code fragment listed in Canvas
        // The first loop is a nested for loop which is O(n^2)
        // The second loop is constant O(1)
        // Time Complexity: O(n^2)

        // Section 13.3: Implementing Searching and Sorting Algorithms
        // 16. What is the runtime complexity class of a sequential search on an
        // unsorted array?
        // What is the runtime complexity class of the modified sequential search on a
        // sorted array?
        // The runtime complexity class of a sequential search on an unsorted array is:
        // O(n) because the algorithm checks each element in the array one by one.
        // The runtime complexity class of the modified sequential search on a sorted array is:
        // Also O(n) unless the target is at the beginning of the array, then it is O(1)

        // 17. Why does the binary search algorithm require the input to be sorted?
        // This is because the binary search algorithm relies on dividing the search interval in half.
        // If the target is in the lower half or upper half, we keep that half and divide once more.
        // Without sorting, cutting the search interval in half is useless.

        // 18. How many elements (at most) does a binary search examine if the array
        // contains 60 elements?
        // log_2(60) = 6
        // At the most, a binary search algorithm, on an array of 60 elements will examine 6 elements.

        // 19. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input arrays?
        // What value will the binary search algorithm return?

        // A. int[] numbers = {1, 3, 6, 7, 8, 10, 15, 20, 30};
        // B. int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        // C. int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // D. int[] numbers = {8, 9, 12, 14, 15, 17, 19, 25, 31};

        // A. return Middle element = numbers[4] = 8

        // B. Middle element = numbers[4] = 5
        //    return Middle element = numbers[6] = 8

        // C. Middle element = numbers[4] = 5
        //    Middle element = numbers[6] = 7
        //    return Middle element = numbers[7] = 8

        // D. Middle element = numbers[4] = 15
        //    Middle element = numbers[2] = 12
        //    Middle element = numbers[1] = 9
        //    return Middle element = numbers[0] = 8

        // 20. What indexes will be examined as the middle element by a binary search
        // for the target value 8 when the search is run on the following input array?
        // Notice that the input array isn’t in sorted order. What can you say about the
        // binary search algorithm’s result?

        // int[] numbers = {6, 5, 8, 19, 7, 35, 22, 11, 9};

        // The middle element is 7, but because it is not sorted, this is meaningless.

        // 23. What modifications would you have to make to the selectionSort method to
        // cause it to sort an array of double values rather than one of integer values?

        // 24. Consider the following array:

        // int[] numbers = {29, 17, 3, 94, 46, 8, –4, 12};
        // After a single pass of the selection sort algorithm (a single swap), what
        // would be the state of the array?

        // A. {–4, 29, 17, 3, 94, 46, 8, 12}
        // B. {29, 17, 3, 94, 46, 8, 12}
        // C. {–4, 29, 17, 3, 94, 46, 8, –4, 12}
        // D. {–4, 17, 3, 94, 46, 8, 29, 12}
        // E. {3, 17, 29, 94, –4, 8, 46, 12}

        // 25. Trace the execution of the selection sort algorithm as shown in this
        // section when run on the following input arrays.
        // Show each element that will be selected by the algorithm and where it will be
        // moved, until the array is fully sorted.

        // A. {29, 17, 3, 94, 46, 8, –4, 12}
        // B. {33, 14, 3, 95, 47, 9, –42, 13}
        // C. {7, 1, 6, 12, –3, 8, 4, 21, 2, 30, –1, 9}
        // D. {6, 7, 4, 8, 11, 1, 10, 3, 5, 9}
    }
}
