//String :Sequence of characters
//String is a class in java.lang package
//string is immutable
//string is a reference type
/* String methods list
 concatenation: + or concat()
 length: length()
 charAt: charAt(index)
 indexOf: indexOf(char)
 lastIndexOf: lastIndexOf(char)
 substring: substring(start, end)
 toLowerCase: toLowerCase()
 toUpperCase: toUpperCase()
 trim: trim()
 */

 //String basic program and count the string length
 import java.util.*;
 /*class Day5
 {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         String str=sc.nextLine();
         System.out.println("String length is: "+str.length());
         System.out.println("String is: "+str);
     }
 }*/

     //String with for loop count the string length
     /*class Day5
        {
            public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                String str=sc.nextLine();
                int count=0;
                for(int i=0;i<str.length();i++)
                {
                    count++;
                }
                System.out.println("String length is: "+count);
                System.out.println("String is: "+str);
            }
        }*/

 //slicing the string
/*class Day5
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String str="My class room of the cse and cseit students are very good and innocent people and talent person's";
        String str1=str.substring(12, 24);
        System.out.println("Sliced string is: "+str1);
    }
} */         

//slicing the string with negative index
/*class Day5
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String str="My class room of the cse and cseit students are very good and innocent people and talent person's";
        String str1=str.substring(str.length()-12);
        System.out.println("Sliced string is: "+str1);
    }
}*/

//length method without using length method
/class Day5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(char c:str.toCharArray())
        {
            count++;
        }
        System.out.println("String length is: "+count);
        System.out.println("String is: "+str);
    }
}
//string concatenation => + operator or concat() method
/*class Day5
{
    public static void main(String[] args)          
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=str1+str2;
        System.out.println("Concatenated string is: "+str3);
    }
}*/

//charAt() method => returns the character at the specified index
/*class Day5
{
    public static void main(String[] args)      
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter the index: ");
        int index=sc.nextInt();
        char ch=str.charAt(index);
        System.out.println("Character at index "+index+" is: "+ch);
    }
}}*/

//indexOf() method => returns the index of the first occurrence of the specified character
/*class Day5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter the character: ");
        char ch=sc.next().charAt(0);
        int index=str.indexOf(ch);
        if(index==-1)
        {
            System.out.println("Character not found in the string");
        }
        else
        {
            System.out.println("Index of character "+ch+" is: "+index);
        }
    }
}}*/

//reverse a string
/*class Day5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {rev=rev+str.charAt(i);
        }
        System.out.println("Reversed string is: "+rev);
    }
}}*/

//palindrome string
/*class Day5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
}}}*/

//count the number of words in a string
/*class Day5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        String str=sc.nextLine();
        String[] words=str.split(" ");
        System.out.println("Number of words in the string is: "+words.length);  
    }
}}*/

//IF A STATEMENT WAS GIVEN WE NEED TO COUNT RH VOWELS,CONSONTES AND SPACES
class main
