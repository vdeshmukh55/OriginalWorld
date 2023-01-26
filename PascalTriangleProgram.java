package LogicalPrograms;

import java.util.Scanner;

public class PascalTriangleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Rows");
		int row= sc.nextInt();
		int i,j,space,num;
		
		for(i=0;i<row;i++)
		{
			for(space=row;space>i;space--)
			{
				System.out.print(" ");
			}
			num=1;
			for(j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			System.out.println("\n");
		}
		System.out.println("Done");

	}

}
