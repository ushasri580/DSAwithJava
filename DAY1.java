import java.util.*;

/*class DAY1{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        if((a&1)==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }    
    }
}*/


/*class DAY1{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        for(int i=0;i<N;i++)
        {
            System.out.println("enter a number");
            int a =sc.nextInt();
            if((a&1)==0)
            {
                 System.out.println("even");
            }
            else
            {
                System.out.println("odd");
            }    

        }
    }
}*/


// Numeric to BINARY CONVERSION
class DAY1{
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int n= obj.nextInt();
        String  Binary =" ";
        while(n>0)
        {
            int rem =n%2;
            Binary=rem+Binary;
            n=n/2;
        }
        System.out.println(Binary);
    }
}


