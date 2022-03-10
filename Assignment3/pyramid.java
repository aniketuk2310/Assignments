
/*														//pattern=>10---inverted full pyramid
class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int k=1;k<=i;k++)
				System.out.print(" ");
			for(int j=6;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
	//         * * * * * * * * *
    //          * * * * * * * *
    //           * * * * * * *
    //            * * * * * *
    //             * * * * *
    //              * * * *
    //               * * *
    //                * *
    //                 *
}
*/


/*														//pattern=>9---full pyramid
class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int k=6;k>=i;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
	//	          *
    //           * *
    //          * * *
    //         * * * *
    //        * * * * *
    //       * * * * * *

}
*/


/*														//pattern=>9---inverted half pyramid
class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
	//	* * * * *
	//	* * * *
	//	* * *
	//	* *
	//	*
}
*/


/*															//pattern=>8---half pyramid
class pyramid
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



/*															//pattern=>7
class pyramid
{
	public static void main(String args[])
	{
		for(int i=9;i>=1;i--)
		{
			
			for(int j=9;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
				System.out.print(i+" ");
			System.out.println();
		}
		
	}
	//                    9 9 9 9 9 9 9 9 9
    //                     8 8 8 8 8 8 8 8
    //                      7 7 7 7 7 7 7
    //                       6 6 6 6 6 6
    //                        5 5 5 5 5
    //                         4 4 4 4
    //                          3 3 3
    //                           2 2
    //                            1
}
*/



/*														//pattern=>6
class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int k=1;k<=i;k++)
				System.out.print(" ");
			for(int j=9;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
	//         * * * * * * * * *
    //          * * * * * * * *
    //           * * * * * * *
    //            * * * * * *
    //             * * * * *
    //              * * * *
    //               * * *
    //                * *
    //                 *
}
*/


/*												 	//pattern=>5
class pyramid
{
	public static void main(String args[])
	{
		
		for(int i=9;i>=1;i--)
		{
			for(int l=1;l<=i;l++)
				System.out.print("  ");
			for(int k=i;k<=9;k++)
				System.out.print(k+" ");
			for(int j=9-1;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}
	//                9
    //              8 9 8
    //            7 8 9 8 7
    //          6 7 8 9 8 7 6
    //        5 6 7 8 9 8 7 6 5
    //      4 5 6 7 8 9 8 7 6 5 4
    //    3 4 5 6 7 8 9 8 7 6 5 4 3
    //  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
    //1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
}
*/


/*															//pattern=>4
class pyramid
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=9;i++)
		{
			for(int k=9;k>=i;k--)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int l=i-1;l>=1;l--)
				System.out.print(l+" ");
			
			System.out.println();
		}
		
	}
	//			       1
    //               1 2 1
    //             1 2 3 2 1
    //           1 2 3 4 3 2 1
    //         1 2 3 4 5 4 3 2 1
    //       1 2 3 4 5 6 5 4 3 2 1
    //     1 2 3 4 5 6 7 6 5 4 3 2 1
    //   1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
    // 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
}
*/


/*															//pattern=>3		
class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			for(int k=9;k>=i;k--)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
	//	          *
    //           * *
    //          * * *
    //         * * * *
    //        * * * * *
    //       * * * * * *
    //      * * * * * * *
    //     * * * * * * * *
    //    * * * * * * * * *
}
*/


/*													//pattern=>2
class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			
			for(int j=9;j>=i;j--)
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
	//        1 2 3 4 5 6
	//       1 2 3 4 5 6 7
	//      1 2 3 4 5 6 7 8
	//     1 2 3 4 5 6 7 8 9
}
*/

/*															//pattern=>1
class pyramid
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			
			for(int j=9;j>=i;j--)
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
	//        6 6 6 6 6 6
	//       7 7 7 7 7 7 7
	//      8 8 8 8 8 8 8 8
	//     9 9 9 9 9 9 9 9 9
}
*/