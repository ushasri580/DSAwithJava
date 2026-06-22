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
import java.util.*;
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
        System.out.println(perfect(num));

    }
 }*/

