import java.util.Arrays;
//
/*public class Day9{
    public static int partition(int arr[], int lower, int upper) {
        int pivot = arr[lower], low = lower, high = upper;
        while (low <= high) {
            while (low <= upper && arr[low] <= pivot) {
                low++;
            }
            while (high >= lower && arr[high] > pivot) {
                high--;
            }
            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        int temp = arr[lower];
        arr[lower] = arr[high];
        arr[high] = temp;
        return high;
    }

    public static int quicsort(int arr[], int lower, int upper, int target) {
        if (lower <= upper) {
            int pivot = partition(arr, lower, upper);
            if (target == pivot) {
                return arr[pivot];
            } else if (target < pivot) {
                return quicsort(arr, lower, pivot - 1, target);
            } else {
                return quicsort(arr, pivot + 1, upper, target);
            }
        }
        return -1;
    }

    public static void main(String arg[]) {
        int[] arr = {30, 6, 71, 86, 96, 75, 95, 38, 5, 100};
        int targetIndex = 2;
        int sol = quicsort(arr, 0, arr.length - 1, targetIndex);
        System.out.print(sol);
    }
}
//sort an array 0's,1's,2's
class Day9 {
    public static void sort(int arr[])
    {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) 
               count0++;
            else if (arr[i] == 1) 
                count1++;
            else 
            count2++;
        }
        
        for(int i=0;i<count0;i++)
        {
            arr[i]=0;
        }
        for(int i=count0;i<(count1+count1);i++)
        {
            arr[i]=1;
        }
        for(int i=count0+count1;i<(count0+count1+count2);i++)
        {
            arr[i]=2;
        }
    }
    public static void main(String args[]) {
        int arr[] = {0,1,2,2,1,0,1,2,0,0,2,1,1,2,0,1,0,2};
        sort(arr);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}*/


/*class Day9 {
    private static void swap(int[] arr,int first,int second)
    {
        int safe=arr[first];
        arr[first]=arr[second];
        arr[second]=safe;
    }
    public static void sort(int arr[])
    {
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid ++;
            }
            else
            {
                swap(arr,mid,high);
                high --;
            }
        }    
    }
    public static void main(String args[]) {
        int arr[] = {0,1,2,2,1,0,1,2,0,0,2,1,1,2,0,1,0,2};
        sort(arr);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
    }
}*/

//min heap
/*import java.util.*;

class Day9
{
    public static void main(String arg[])
    {
        PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>();

        min_heap.add(10);
        min_heap.add(20);
        min_heap.add(30);

        min_heap.poll();   

        min_heap.add(3);

        System.out.print(min_heap);
    }
}

import java.util.*;
class Day9
{
    public static void main(String arg[])
    {
        PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>();
        max_heap.add(-11);
        max_heap.add(-5);
        max_heap.add(-3);
        max_heap.add(-12);
        max_heap.add(12);
        System.out.print(max_heap);
    }
}*/


//given N rope lengths,find the minimum cost to connect all ropes (always merge two short)solve using sorting
import java.util.*;
class Day9{
public static int min_cost(int[] arr)
{
    PriorityQueue<Integer> min_heap =new PriorityQueue<Integer>();
    for(int val :arr)min_heap.add(val);


    while(min_heap.size()>1)
    {
        int first =min_heap.poll();
        int second =min_heap.poll();
        min_heap.add(first+second);
    }
    return min_heap.poll();
}
  public static void main(String arg[])
  {
    int arr[]={2,2,1,7,5,3};
    System.out.println(min_cost(arr));
  }
}
