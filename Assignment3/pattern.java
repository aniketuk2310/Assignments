import java.util.Scanner;

															//pattern=>18
class pattern
{
	public static void main(String args[])
	{
		
		
		for(int i=1;i<=5;i++)
		{
			char ch = (int)65;
			for(int k=1;k>=i;k--)
				System.out.print("");
			for(int j=5;j>=i;j--)
			{
				System.out.print(ch+" ");
				ch++;
				
			}
			
			System.out.println();
		}
		
	}
	//	A B C D E
	//	A B C D
	//	A B C
	//	A B
	//	A
}




/*														//pattern=>17
class pattern
{
	public static void main(String args[])
	{
		int count = 1;
		for(int i=1;i<=5;i++)
		{
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
	}
	//    	1
	//		2 3
	//		4 5 6
	//		7 8 9 10
	//		11 12 13 14 15
}
*/



/*														//pattern=>16
class pattern
{
	public static void main(String args[])
	{
		
		for(int i=5;i>=1;i--)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
	//    	5
	//		5 4
	//		5 4 3
	//		5 4 3 2
	//		5 4 3 2 1
}
*/


/*														//pattern=>15
class pattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("");
			}
			for(int k=5;k>=i;k--)
				System.out.print(k+" ");
			System.out.println();
		}
		
	}
	//             5 4 3 2 1 
	//             5 4 3 2
	//             5 4 3
	//             5 4 
	//             5
}
*/


/*													 //pattern=>14
class pattern
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}
	//             1 2 3 4 5
	//             1 2 3 4
	//             1 2 3
	//             1 2 
	//             1
}
*/



/*													 	//pattern=>13
class pattern
{
	public static void main(String args[])
	{
		for(char ch=65;ch<=69;ch++)
		{
			//char ch = (int)65;
			for(int k=69;k>=ch;k--)
				System.out.print(" ");
			for(int j=65;j<=ch;j++)
			{
				System.out.print(ch+" ");
				
			}
			
			System.out.println();
		}
		
	}
	//             A
	//            B B
	//           C C C
	//          D D D D
	//         E E E E E
}
*/



/*														//pattern=>12
class pattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
				System.out.print(i+" ");
			System.out.println();
		}
		
	}
	//             1
	//            2 2
	//           3 3 3
	//          4 4 4 4
	//         5 5 5 5 5
}
*/


/*															//pattern=>11
class pattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	//             *
	//            ***
	//           *****
	//          *******
	//         *********
}
*/


/*															//pattern=>10
class pattern
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			
			for(int k=1;k<=i;k++)
				System.out.print(" ");
			for(int j=i;j<=5;j++)
			{
				System.out.print(" "+((char)(j+64)));
			}	
			
			
			System.out.println();
		}
		
	}
	//             E
	//            D E
	//           C D E
	//          B C D E
	//         A B C D E
}
*/



/*														//pattern=>9
class pattern
{
	public static void main(String args[])
	{
		
		
		for(int i=1;i<=5;i++)
		{
			char ch = (int)65;
			for(int k=5;k>=i;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(ch+" ");
				ch++;
			}
			
			System.out.println();
		}
		
	}
	//	    A
	//	   A B
	//	  A B C
	//	 A B C D
	//	A B C D E
}
*/


/*														//pattern=>8
class pattern
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
				System.out.print(k+" ");
			System.out.println();
		}
		
	}
	//             5
	//            4 5
	//           3 4 5
	//          2 3 4 5
	//         1 2 3 4 5 
}
*/



/*													//pattern=>7
class pattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
				System.out.print(k+" ");
			System.out.println();
		}
		
	}
	//             1
	//            1 2
	//           1 2 3
	//          1 2 3 4
	//         1 2 3 4 5
}
*/


/*												//pattern=>6
class pattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	//            *
	//          * *
	//        * * *
	//      * * * *
	//    * * * * *
}
*/


/*													//pattern=>5
class pattern
{
	public static void main(String args[])
	{
		
		char ch = (int)65;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(ch);
				
			}
			System.out.println();
			ch++;
		}
		
	}
	//	A
	//	BB
	//	CCC
	//	DDDD
	//	EEEEE
}
*/


/*														//pattern=>4
class pattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	//	1
	//	2 2
	//	3 3 3
	//	4 4 4 4
	//	5 5 5 5 5
}
*/



/*														//pattern=>3
class pattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
	//	*
	//	* *
	//	* * *
	//	* * * *
	//	* * * * *
}
*/


/*													//pattern=>2
class pattern
{
	public static void main(String args[])
	{
		
		
		for(int i=1;i<=5;i++)
		{
			char ch = (int)65;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(" "+ch);
				ch++;
			}
			System.out.println();
		}
		
	}
	//	A
	//	A B
	//	A B C
	//	A B C D
	//	A B C D E
}
*/


/*													//pattern=>1
class pattern
{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	//	1
	//	1 2
	//	1 2 3
	//	1 2 3 4
}
*/