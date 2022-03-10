import java.util.Scanner;
													//Q25===>octal to decimal

class Assignment2
{
	public static void main(String args[])
	{
		System.out.println(Integer.parseInt("10",8));		//8
	}
}	
	
	

/*													//Q24===>binary to octal
class Assignment2
{
	public static void main(String args[])
	{
		String binaryString = "111";
		int decimal = Integer.parseInt(binaryString,2);		//binary to decimal
		String oct = Integer.toOctalString(decimal);			//decimal to octal
		
		System.out.println(oct);					//7
	}
}
*/


/*													//Q23===>binary to hexadecimal
class Assignment2
{
	public static void main(String args[])
	{
		String hexa = Integer.toHexString(1101);
		
		System.out.println(hexa);					//44d
	}
}
*/

/*														//Q22===>binary to decimal
class Assignment2
{
	public static void main(String args[])
	{
		String binaryString = "100";
		int decimal=Integer.parseInt(binaryString,2);
		System.out.println(decimal);					//4
	}
}
*/


/*														//Q21===>decimal to octal
class Assignment2
{
	public static void main(String args[])
	{
		System.out.println(Integer.toOctalString(15));	//17
	}
}
*/


/*														//Q20===>decimal to hexadecimal
class Assignment2
{
	public static void main(String args[])
	{
		System.out.println(Integer.toHexString(15));	//f
	}
}
*/


/*														//Q19===>decimal to binary
class Assignment2
{
	public static void main(String args[])
	{
		System.out.println(Integer.toBinaryString(5));	//101
	}
}
*/	
	

/*														//Q18
class Assignment2
{
	public static String mul(String s1,String s2)
	{
		int a = Integer.parseInt(s1,2);
		int b = Integer.parseInt(s2,2);
		int m = a*b;
		return Integer.toBinaryString(m);
	}
	
	public static void main(String args[])
	{
		//String s1 = (int)10;
		//String s2 = (int)11;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first binary number = ");	//10
		String s1= sc.nextLine();
		System.out.println("Enter the second binary number = ");	//11
		String s2= sc.nextLine();
		
		String multi = mul(s1,s2);
		System.out.println("Multiplication : "+multi);		//Multiplication : 110
	}
}
*/


/*													//Q17
class Assignment2
{
	public static String add(String s1,String s2)
	{
		int a = Integer.parseInt(s1,2);
		int b = Integer.parseInt(s2,2);
		int sum = a+b;
		return Integer.toBinaryString(sum);
	}
	
	public static void main(String args[])
	{
		//String s1 = (int)10;
		//String s2 = (int)11;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first binary number = ");	//10
		String s1= sc.nextLine();
		System.out.println("Enter the second binary number = ");	//11
		String s2= sc.nextLine();
		
		String addition = add(s1,s2);
		System.out.println("Addition : "+addition);				//101
	}
}
*/


/*												//Q16
class Assignment2
{
	public static void main(String args[])
	{
		System.out.println(" +\"\"\"\"\"+ " );
		System.out.println("[| o o |]");
		System.out.println(" |  ^  |");
		System.out.println(" | '-' |");
		System.out.println(" +-----+");
	}
}
*/


/*													//Q15
class Assignment2
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping Value of a = "+a);	//After Swapping Value of a = 20
		System.out.println("After Swapping Value of b = "+b);	//After Swapping Value of b = 10
	}
}
*/


/*													//Q14
class Assignment2
{
	public static void main(String args[])
	{
		System.out.println("* * * * * * ============================");
		System.out.println(" * * * * *  ============================");
		System.out.println("* * * * * * ============================");
		System.out.println(" * * * * *  ============================");
		System.out.println("* * * * * * ============================");
		System.out.println(" * * * * *  ============================");
		System.out.println("* * * * * * ============================");
		System.out.println(" * * * * *  ============================");
		System.out.println("* * * * * * ============================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
		System.out.println("========================================");
	}
}
*/



/*													//Q13
class Assignment2
{
	public static void main(String args[])
	{
		float width = 5.6f;
		float height = 8.5f;
		float area = width*height;
		double peri =2 * (5.6+8.5);
		System.out.println("Area is 5.6 * 8.5 = "+area);					//Area is 5.6 * 8.5 = 47.6
		System.out.println("Perimeter is 2 * (5.6 + 8.5) = "+peri);		//Perimeter is 2 * (5.6 + 8.5) = 28.2
	}
}
*/


/*													//Q12
class Assignment2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2=sc.nextInt();
		System.out.println("Enter the third number : ");
		int num3=sc.nextInt();
		int avg=(num1+num2+num3)/3;
		System.out.println("Average = "+avg);
	}
}
*/


/*													//Q11
class Assignment2
{
	public static void main(String args[])
	{
		double radius = 7.5;
		final float pi = 3.1415f;
		double perimeter = 2 * pi * radius;
		double area = pi * radius * radius;
		System.out.println("Perimeter = "+perimeter);	//Perimeter = 47.12249994277954
		System.out.println("Area = "+area);				//Area = 176.70937478542328
	}
}
*/


/*													//Q10
class Assignment2
{
	public static void main(String args[])
	{
		double exp = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println("Answer of given expression = "+exp);		//Answer of given expression = 2.9760461760461765
	}
}
*/


/*													//Q9
class Assignment2
{
	public static void main(String args[])
	{
		double ans=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println("Answer : "+ans);					//Answer : 2.138888888888889
	}
}
*/


/*													//Q8
class Assignment2
{
	public static void main(String args[])
	{
		System.out.println("   j    a  v     v   a");
		System.out.println("   j   a a  v   v   a a");
		System.out.println("j  j  aaaaa  v v   aaaaa");
		System.out.println(" jj  a     a  v   a     a");
	}
}
*/


/*													//Q7
class Assignment2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		for(int i=0;i<10;i++)
		{
			//num=num*i;
			System.out.println(num+" x "+(i+1)+" = "+(num*(i+1)));
		}
	}
}
*/


/*													//Q6
class Assignment2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1=sc.nextInt();
		System.out.println("Enter the first number : ");
		int num2=sc.nextInt();
		int add = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		int div = num1/num2;
		int mod = num1%num2;
		System.out.println("125+24 = "+add);		//125+24 = 149
		System.out.println("125-24 = "+sub);		//125-24 = 101
		System.out.println("125*24 = "+mul);		//125*24 = 3000
		System.out.println("125/24 = "+div);		//125/24 = 5
		System.out.println("125%24 = "+mod);		//125%24 = 5
	}
}
*/



/*														//Q5
class Assignment2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1=sc.nextInt();
		System.out.println("Enter the first number : ");
		int num2=sc.nextInt();
		int sum = num1*num2;
		System.out.println("Multiplication : "+sum);		//Multiplication : 125
	}
}
*/


/*														//Q4
class Assignment2
{
	public static void main(String args[])
	{
		int a=-5 + 8 * 6;
		int b=(55+9) % 9;
		int c=20 + -3*5 / 8;
		int d=5 + 15 / 3 * 2 - 8 % 3;
		System.out.println("\n"+a+"\n"+b+"\n"+c+"\n"+d);
		//43
		//1
		//19
		//13
	}
}
*/


/*														//Q3
class Assignment2
{
	public static void main(String args[])
	{
		int num1=50;
		int num2=3;
		int ans = num1/num2;
		System.out.println("Answer : "+ans);		//110
	}
}
*/


/*														//Q2
class Assignment2
{
	public static void main(String args[])
	{
		int num1=74;
		int num2=36;
		int sum = num1+num2;
		System.out.println("Addition : "+sum);		//110
	}
}
*/


/*														//Q1
class Assignment2
{
	public static void main(String args[])
	{
		System.out.println("Hello"+"\nAniket_Kale");
		//Hello
		//Aniket_Kale
	}
}
*/