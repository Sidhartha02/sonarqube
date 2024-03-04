package sm.com.sm;
import java.util.Scanner;
public class App 
{
	public static void primeNo(int num)
	{
		int count=0;
		System.out.println("Number is "+num);
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			count++;
		}
		if(count==2)
			System.out.println(num+"It is a prime no.");
		else {
			System.out.println("not a prime number");
		}
		
		String s=new App().StPali();
		System.out.println(s);
		new App().SPali();
		
	}
	public static String StPali()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String name=sc.next();String temp="";
		for(int i=name.length()-1;i>=0;i--)
		{
			temp=temp+name.charAt(i);
		}
		return temp;
	}
	public static void SPali()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String name=sc.next();String temp="";
		for(int i=name.length()-1;i>=0;i--)
		{
			char ch=name.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
	}
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int num=sc.nextInt();
        primeNo(num);
        
    }
}
