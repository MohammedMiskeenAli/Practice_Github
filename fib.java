import java.util.Scanner;

class Fib 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter a number:");
	    int n=s.nextInt();
		System.out.print(fib(n)+" ");
	}
	public static int fib(int f)
	{
    if(f<=1)
		return f;
	else
		return fib(f-1)+fib(f-2);
	
	}


}
