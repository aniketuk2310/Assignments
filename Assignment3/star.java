




/*														//pattern=>14
class star
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			
			for(int j=5-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	//             *********
    //              *******
	//               *****
    //                ***
	//                 *
	//                ***
	//               *****
	//              *******
	//             *********
}
*/



/*															//pattern=>13
class star
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int i=2;i<=5;i++)
		{
			
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//           *****
	//            ****
	//             ***
	//              **
	//               *
	//              **
	//             ***
	//            ****
	//           *****
}
*/


/*														//pattern=>12
class star
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//	*****
	//	****
	//	***
	//	**
	//	*
	//	*
	//	**
	//	***
	//	****
	//	*****
}
*/


/*														//pattern=>11
class star
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
				System.out.print(" ");
			for (int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	//  *****
    //   *****
    //    *****
    //     *****
    //      *****
}
*/



/*														//pattern=>10
class star
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for (int j=5;j>=i;j--)
				System.out.print(" ");
			for (int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	//          *****
    //         *****
    //        *****
    //       *****
    //      *****
}
*/



/*															//pattern=>9
class star
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5-1;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5-1;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	//           *
	//          **
	//         ***
	//        ****
	//       *****
	//        ****
	//         ***
	//          **
	//           *
}
*/



/*															//pattern=>8	
class star
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5-1;i++)
		{
			for(int j=5-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//	*
	//	**
	//	***
	//	****
	//	*****
	//	****
	//	***
	//	**
	//	*
}
*/


/*													//pattern=>7
class star
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
		for(int i=5-1;i>=1;i--)
		{
			
			for(int j=5-1;j>=i;j--)
			{
				
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//             *
	//            ***
	//           *****
	//          *******
	//         *********
    //          *******
	//           *****
    //            ***
	//             *
}
*/



/*														//pattern=>6
class star
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			
			for(int j=5-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	//             *********
    //              *******
	//               *****
    //                ***
	//                 *
}
*/



/*														//pattern=>5	
class star
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



/*														//pattern=>4
class star
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
	//           *****
	//            ****
	//             ***
	//              **
	//               *
}
*/



/*															//pattern=>3
class star
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//	*****
	//	****
	//	***
	//	**
	//	*
}
*/


/*															//pattern=>2
class star
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//           *
	//          **
	//         ***
	//        ****
	//       *****
}
*/



/*														//pattern=>1
class star
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//	*
	//	**
	//	***
	//	****
	//	*****
}
*/