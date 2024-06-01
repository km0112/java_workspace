// repository of useful array functions
// author: JS Iwanski, Dwight-Englewood School
// January 2022
// modified slightly April 2023

import java.util.Random;
import java.util.Arrays;

public class ArrayUtils
{
  // ****  SORTING ROUTINES  ****

  // AWFUL sort - example of a sort that may never finish!
  // Essentially, shuffle until sorted.
  // if N = arr.length, this sort has O(N!) complexity
  public static void bogoSort(int[] arr)
  {
    // while arr is not sorted, shuffle it!
    while(!isSorted(arr, true))
    { shuffle(arr, arr.length*5); }
  }

  // implements the classic bubble sort on int array arr
  // to ascending (non-descending) order
  // If N = arr.length, this sort has O(N^2) complexity
  // precondition: arr is non-empty
  public static void bubbleSort(int[] arr)
  {
    // track the number of swaps per pass through the data
    int numSwaps;

    do
    {
      // reset number of swaps to zero
      numSwaps = 0;

      // make a pass thru the data
      for(int i = arr.length-1; i > 0; i--)
      {
        // if i-th element less than (i-1)st element, swap 'em
        // and increment numSwaps by one'
        if(arr[i] < arr[i-1])
        {
          swap(arr, i, i-1);
          numSwaps++;
        }
      }
    }while(numSwaps > 0); // do until we don't have any swaps on a pass
  }

  // implements selection sort algorithm on int array arr,
  // to ascending order.
  // if N = arr.length, this sort has O(N^2) complexity
  // precondition: arr is non-empty
  public static void selectionSort(int[] arr)
  {
    // for i from 0 to (arr.length-1)
    for(int i = 0; i < arr.length-1; i++)
    {
      //   find the index of the minimum element in arr
      ///  from index i on
      int index = findMin(arr, i);

      //   and swap it with the element at index i
      swap(arr,index, i);
    }
  }

  // implements insertion sort algorithm on int array arr,
  // to ascending order
  // if N = arr.length, this sort has O(N^2) complexity
  // precondition: arr is non-empty
  public static void insertionSort(int[] arr)
  {
    // for i from 1 to arr.length
    for(int i = 1; i < arr.length; i++)
    {
      // let k equal i
      int k = i;
      int val = arr[k];

      // while k > 0 AND arr[k] < arr[k-1]
      while(k > 0 && val < arr[k-1])
      {
        // move element at index (k-1) to the right by one
        arr[k] = arr[k-1];
        //     decrement k by one
        k--;
      }

      // finally, put val in correct location
      arr[k] = val;
    }
  }

  // implements classic merge sort, a divide-and-conquer
  // recursive algorithm.
  // If N = arr.length, this sort has O(N log(N)) complexity
  // precondition: arr is non-empty
  public static void mergeSort(int[] arr)
  {
    // if a has one or fewer elements, it is sorted
    if(arr.length <= 1)
    { return; }

    // create arrays for first and second halves of a
    int[] first = new int[arr.length/2];
    int[] second = new int[arr.length - first.length];

    // copy appropriate elements from arr to first and second
    System.arraycopy(arr, 0, first, 0, first.length);
    System.arraycopy(arr, first.length, second, 0, second.length);

    // merge sort both halves and then merge together
    mergeSort(first);
    mergeSort(second);
    merge(arr, first, second);
  }

  // merges arrays first and second together into array a.
  // Assumes first and second are already sorted into
  // ascending (non-descending) order.
  private static void merge(int[] a, int[] first, int[] second)
  {
    int iFirst = 0, iSecond = 0;
    int current = 0;

    // while BOTH first and second still have elements in them,
    // add the smallest of the top elements in them to a
    while(iFirst < first.length && iSecond < second.length)
    {
      if(first[iFirst] < second[iSecond])
      {
        a[current] = first[iFirst];
        iFirst++;
      }
      else
      {
        a[current] = second[iSecond];
        iSecond++;
      }
      current++;
    }

    // only one of the two loops below will do anything

    // empty out the rest of first into a
    for(int i = iFirst; i < first.length; i++)
    {
      a[current] = first[i];
      current++;
    }

    // empty out the rest of second into a
    for(int i = iSecond; i < second.length; i++)
    {
      a[current] = second[i];
      current++;
    }
  }

  // implements classic quicksort
  // If N = arr.length, this sort has O(N log(N)) complexity
  // precondition: arr is non-empty
  public static void quickSort(int[] arr)
  { quickSort(arr, 0, arr.length-1); }

  // implements classic quick sort, a divide-and-conquer
  // recursive algorithm.
  // If N = arr.length, this sort has O(N log(N)) complexity
  private static void quickSort(int[] arr, int from, int to)
  {
    // if more than one element, must sort!
    if(from < to)
    {
        int partitionIndex = partition(arr, from, to);

        quickSort(arr, from, partitionIndex-1);
        quickSort(arr, partitionIndex+1, to);
    }
  }

  // uses the value at index hi as pivot and then
  // arranges all the elements from low to hi so that
  // elements that are less than or equal to the pivot value are to
  // the left of the pivot and otherwise are to the right of the
  // pivot value. Then returns the index where the pivot has
  // been placed.
  private static int partition(int[] a, int low, int hi)
  {
    // store pivot as the element at right end of this section
    int pivot = a[hi];
    // initialize i to one below low
    int i = (low-1);

    // arrange elements around pivot
    for (int j = low; j < hi; j++)
    {
        if (a[j] <= pivot)
        {
            i++;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    // move the pivot and return the index where it ends up
    int temp = a[i+1];
    a[i+1] = a[hi];
    a[hi] = temp;
    return i+1;
  }

  // ****  SEARCH ROUTINES ****

  // implements a linear search on array arr and
  // returns the smallest index in arr where target occurs
  // or -1 if target does NOT occur in arr
  // If N = arr.length, this search has O(N) complexity
  public static int linSearch(int[] arr, int target)
  {
    // for each index i in arr
    for(int i = 0; i < arr.length; i++)
    {
      // if arr[i] equals target return i
      if(arr[i] == target){ return i; }
    }
    // return -1 if target not found
    return -1;
  }

  // implements a binary search, which is a recursive
  // search algorithm that is only guaranteed to work
  // on a sorted array. We assume that arr is sorted
  // in ascending order here and we search for value key
  // If N = arr.length, this search has O(log(N)) complexity
  public static int binSearch(int[] arr, int key)
  { return  binSearch(arr, key, 0, arr.length-1); }

  // uses binary search to find an index where key occurs,
  // or -1 if it is not found. Searches indexes lo to hi,
  // and arr is assumed to be sorted ascending.
  private static int binSearch(int[] arr, int key, int lo, int hi)
  {
    // base case 1: key not found in arr
    if(hi < lo){ return -1; }

    // base case 2: look at middle value and compare to key
    int mid = (lo + hi)/2;
    if(arr[mid] == key)
    { return mid; }

    // recursive cases: figure out which half of the array to search
    if(arr[mid] < key) // search upper half
    {
      return binSearch(arr, key, mid+1, hi);
    }

    return binSearch(arr, key, lo, mid-1);
  }

  // ****  other miscellaneous routines  ****

  // returns true if arr is sorted
  // if ascending is true then tests for ascending order,
  // otherwise tests for descending order
  public static boolean isSorted(int[] arr, boolean ascending)
  {
    if(ascending)
    {
      for(int i = 1; i < arr.length; i++)
      {
        if(arr[i] < arr[i-1]){ return false; }
      }
    }
    else // descending
    {
      for(int i = 1; i < arr.length; i++)
      {
        if(arr[i] > arr[i-1]){ return false; }
      }
    }

    return true;
  }

  // randomizes arr by implementing a random swap of
  // values in arr (quality) times.
  public static void shuffle(int[] arr, int quality)
  {
    Random rgen = new Random();

    for(int i = 0; i < quality; i++)
    {
      int index = rgen.nextInt(arr.length);
      swap(arr, 0, index);
    }
  }

  // reverses the order of elements in arr
  public static void reverse(int[] arr)
  {
    for(int i = 0; i < arr.length/2; i++)
    {
      swap(arr, i, arr.length-1-i);
    }
  }

  // returns the lowest index of the minimum element in
  // int array arr from index k onwards.
  //
  // precondition: arr is non-empty and k is a valid index
  public static int findMin(int[] arr, int k)
  {
    // algorithm:
    // 1. create an int variable called currMin and set to k
    int currMin = k;

    // 2. for every index in arr from k+1 to the end
    for(int i = k+1; i < arr.length; i++)
    {
      //   2a. if the value at that index is smaller than the
      //       value at currMin, set currMin to that index
      if(arr[i] < arr[currMin])
      { currMin = i; }
    }

    // 3. return currMin
    return currMin;
  }

  // swaps the values at index a and index b in array arr
  private static void swap(int[] arr, int a, int b)
  {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  // creates and returns an int array of length n
  // whose values are randomly chosen from the interval [min, max)
  // precondition: n > 0, min <= max
  public static int[] fillRandom(int n, int min, int max)
  {
    // 0. create a Random object
    Random rgen = new Random();

    // 1. create an int array result with n rows and m columns
    int[] result = new int[n];

    // 2. for every location in result
    // 2a. assign that location a random number in [min,max)
    for(int i = 0; i < n; i++)
    {
      // 2a. assign that location a random number in [min,max)
      result[i] = rgen.nextInt(max-min) + min;
    }

    // 3. return the result
    return result;
  }

}
