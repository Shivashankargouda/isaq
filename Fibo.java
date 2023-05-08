import java.util.Scanner;
class Fibo
{
	public static void main(String s[])
	{
		int n, a=0,b=0,c=1;
		Scanner S=new Scanner (System.in);
		System.out.println("enter a value of n:");
		
		n=S.nextInt();
		System.out.println("Fibonic Services:");
		for(int i=1; i<=n; i++)
	{
		a=b;
		b=c;
		c=a+b;
		System.out.println(a +"  ");
	}
	}
}