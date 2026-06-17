// add the element in array middle of the array
/* import java.util.Scanner;
class Day3{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[10];
        System.out.println("enter the array");
        for(int i=0;i<n;i++)
        {
             a[i]= sc.nextInt();
        }
        System.out.println("enter the element to be added");
        int element = sc.nextInt();
        int mid = n/2;
        for(int i=n-1;i>=mid;i--)
        {            a[i+1] = a[i];
        }
        a[mid] = element;
        n++;
        System.out.println("the array after adding the element in middle");
        for(int i=0;i<n;i++)        
            System.out.println(a[i]);
    }
}*/


// nested loop example
import java.util.Scanner;
/*class Day3{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int col=0;col<n;col++)
        {
            for(int row=0;row<n;row++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

/* 
class Day3{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int col=0;col<n;col++)
        {
            for(int row=0;row<=col;row++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */      


//
/*class Day3{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int col=1;col<=n;col++)
        {
            for(int row=1;row<=n;row++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}*/

//right angle triangle
/*class Day3{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int col=1;col<=n;col++)
        {
            for(int row=1;row<=col;row++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}*/

//right angle triangle with numbers
/*class Day3
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int col=1;col<=n;col++)
        {
            for(int row=1;row<=col;row++)
            {
                System.out.print(row+" ");
            }
            System.out.println(" ");
        }
    }
}*/


/*
1 1
2 1 2
3 1 2 3  */
/*class Day3
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int col=1;col<=n;col++)
        {
            System.out.print(col+" ");
            for(int row=1;row<=col;row++)
            {
                System.out.print(row+" ");
            }
            System.out.println(" ");
        }
    }
}*/

//right angle triangle with alphabets
/*class Day3
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch='A';
        for(int col=1;col<=n;col++)
        {
             ch ='A';
            for(int row=1;row<=col;row++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println(" ");
        }               
    }
}*/

//inverted right angle triangle
/*class Day3
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int col=1;col<=n;col++)         
        {
            for(int row=1;row<=n-col+1;row++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}*/       

//inverted right angle triangle with numbers
/*class Day3
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int col=1;col<=n;col++)         
        {
            for(int row=1;row<=n-col+1;row++)
            {
                System.out.print(row+" ");
            }           
            System.out.println(" ");
        }
    }
}*/


//inverted right angle triangle with alphabets
/*class Day3
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch='A';
        for(int col=1;col<=n;col++)
        {
             ch='A';
            for(int row=1;row<=n-col+1;row++)
            {
                System.out.print(ch+" ");
                ch++;
            }           
            System.out.println(" ");
        }
    }
}*/

//DIAMOND PATTERN
/*class Day3
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int col=1;col<=n;col++)
        {
            for(int row=1;row<=n-col;row++)
            {
                System.out.print(" ");
            }
            for(int row=1;row<=col;row++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int col=1;col<=n-1;col++)
        {
            for(int row=1;row<=col;row++)
            {
                System.out.print(" ");
            }
            for(int row=1;row<=n-col;row++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}*/
// HALF DIAMOND PATTERN
/*class Day3
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int col=1;col<=n;col++)
        {
            for(int row=1;row<=col;row++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int col=1;col<=n-1;col++)
        {
            for(int row=1;row<=n-col;row++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}*/

//pyramid pattern
/*class Day3
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int col=1;col<=n;col++)
        {
            for(int row=1;row<=n-col;row++)
            {
                System.out.print(" ");
            }
            for(int row=1;row<=col;row++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}*/


//hallow pattern
/*class Day3
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("");
                }
            }
            System.out.println(" ");
        }
    }
}*/

//hallown right angle triangle
/*class Day3{
    public static void main(String arg[])
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    if(i==0||i==n||j==0||j==i)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }
}*/


//hawoon square with numbers
/*class Day3{
    public static void main(String arg[])               
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a=1;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i==1||i==n||j==1||j==n)
                    {
                        System.out.print(a+" ");
                        a++;
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }                                                                                                                                   
}*/   

//hallown with alphabets
/*class Day3{
    public static void main(String arg[])               
    {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            char a='A';
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i==1||i==n||j==1||j==n)
                    {
                        System.out.print(a+" ");
                        a++;
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }
}*/

//hallow with inverse right angle triangle
/*class Day3{
    public static void main(String arg[])
    {       
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=n-i;j++)
                {
                    if(i==0||i==n||j==0||j==n-i)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                System.out.println();  
            }
    }
}
*/

//rhombus pattern
/*class Day3{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/

//hallow rhombus pattern
/*class Day3{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/

//HALLOWS DIAMOND PATTERN
/*class Day3{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i==1||j==1||j==i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++)
            {
                if(i==n-1||j==1||j==n-i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/


//HALLOW RHOBUS WITH NUMBERS
/*class Day3{
    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print(a+" ");
                    a++;
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/

//hallow rhombus with alphabets
/*class Day3{
    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n||j==1||j==n)
                {
                    System.out.print(a+" ");
                    a++;
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/

//Squarepattern with odd numbers
/*class Day3{
    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}*/


//Squarepattern with even numbers
/*class Day3{
    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=2;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}*/

//Squarepattern witth factorial numbers
/*class Day3{
    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {   
                fact=fact*j;
                System.out.print(fact+" ");
            }
            System.out.println();
        } 
    }
}*/

//Squarepattern with square numbers
class Day3{
    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);      
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int square=j*j;
                System.out.print(square+" ");
            }
            System.out.println();
        }
    }
}

//square pattern with cube numbers
/*class Day3{
    public static void main (String arg[])      
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int cube=j*j*j;
                System.out.print(cube+" ");
            }
            System.out.println();
        }
    }
}*/        