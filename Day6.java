// given arr of ints print all armstron
import java.util.*;
/*class Day6
{
    public static void main(String arg[])
    {
        int a[]={153,151,123,121};
        for(int i=0;i<a.length;i++)
        {
            int num=a[i];
            int temp=num;
            int sum=0;
            while(temp==0)
            {
              int rem=temp%10;
              sum=sum+rem*rem*rem;
              temp=temp/10;  
            }
            if(temp==sum)
            {
                System.out.println(num);
            }
        }
    }
}*/



/*class Day6{
    public static int search1(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int possible = -1;
        while(low <= high)
        {
            int mid =low+((high-low)/2);
            if(nums[mid]==target)
            {
                possible = mid;
                high=mid-1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return possible;
    }
     public static int search2(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int possible = -1;
        while(low <= high)
        {
            int mid =low+((high-low)/2);
            if(nums[mid]==target)
            {
                possible = mid;
                low=mid+1;
            }
            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return possible;
    }
    public static void main(String arg[])
    {
        int[] nums={5,7,7,8,8,10};
        int target=6;
        int left=search1(nums,target);
         int right=search2(nums,target);
         System.out.println(left);
         System.out.println(right);

    }
}*/
/*class Day6
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       int i=0;
       while(i*i<a)
       {
        i++;
       }
       if(i*i==a)
       {
        System.out.println("yes");
       }
       else
       {
        System.out.println("No");
       }
    }
}


 class Day6
 {
    public static int perfect(int value)
    {
        for(int num=1;num<=value;num++)
        {
            if((num*num)==value)
            {
                return num;
            }
            else if((num*num)>value){
                return num-1;
            }
        }
        return -1;
    }
    public static void main(String arg[])
    {
        int num=16;
        System.out.println(perfect(num)


class Day6{
    public static int[] merge(int[] a1,int[] a2)
    {
        int a1_size =a1.length;
        int a2_size=a2.length;
        int result[]=new int[a1_size + a2_size];
        int i=0,j=0,k=0;
        while(i<a1_size && j<a2_size)
        {
            if(a1[i]<=a2[j])
            {
                result[k++]=a1[i++];
            }
            else
            {
                result[k++]=a2[j++];
            }
        }
        while(i<a1_size)
        {
            result[k++]=a1[i++];
        }
        while(j<a2_size)
        {
            result[k++]=a2[j++];
        }

        return result;
    }
    public static void main(String arg[])
    {
        int [] m={1,2,3},n={4,5,6,7,8};
        int sol[]=merge(m,n);
        for(int ele:sol)
        {
            System.out.print(ele+" ");
        }
    }
}

class Day6 {
    public static void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void merge(int arr[], int low, int mid, int high) {
        int size = high - low + 1;
        int dummy[] = new int[size];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                dummy[k++] = arr[i++];
            } else {
                dummy[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            dummy[k++] = arr[i++];
        }

        while (j <= high) {
            dummy[k++] = arr[j++];
        }

        for (int ind = 0; ind < size; ind++) {
            arr[low + ind] = dummy[ind];
        }
    }
    public static void main(String arg[]) {
        int[] m = {10, 7, 15, 3, 16, 8};

        mergeSort(m, 0, m.length - 1);

        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
    }
}




class Day6 {
    public static int mergeSort(int arr[], int low, int high) {
        int ans=0;
        if (low < high) {
            int mid = (low + high) / 2;
            ans += mergeSort(arr, low, mid);
            ans += mergeSort(arr, mid + 1, high);
            ans += merge(arr, low, mid, high);
        }
        return ans;
    }
    public static int merge(int arr[], int low, int mid, int high) {
        int size = high - low + 1;
        int dummy[] = new int[size];
        int i = low, j = mid + 1, k = 0,count=0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                dummy[k++] = arr[i++];
            } else {
                count+=(mid-i+ 1);
                dummy[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            dummy[k++] = arr[i++];
        }

        while (j <= high) {
            dummy[k++] = arr[j++];
        }

        for (int ind = 0; ind < size; ind++) {
            arr[low + ind] = dummy[ind];
        }
        return count;
    }
    public static void  main(String arg[]) {
        int[] m = {5,6,8,1,2,7};

        int sol= mergeSort(m, 0, m.length - 1);
            System.out.println(sol );
    }
}*/


import java.util.Arrays;
public class Day6{
    public static void  partition(int arr[],int pivort)
    {
        int low=0,upper=arr.length-1;
        while(low<upper && arr[low]<=pivot)
            low++;
        while(upper>low &&arr[upper]>pivot)
            upper --;
        if(low<upper)
        {
            int safe=arr[low];
            arr[low]=arr[upper];
            arr[upper]=safe;
        }
}
public static void main(string arg[])
{
    int[] arr={5,6,71,86,96,75,95,38,30,100};
    int pivot=53;
    partition(arr,pivot);
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
}
}