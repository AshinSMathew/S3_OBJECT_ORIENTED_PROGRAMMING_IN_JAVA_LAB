import java.util.*;
public class multi{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the numbers of rows in MATRIX 1 ");
		int row1=scan.nextInt();
		System.out.print("Enter the numbers of columns in MATRIX 1 ");
		int col1=scan.nextInt();
		System.out.print("Enter the numbers of rows in MATRIX 2 ");
		int row2=scan.nextInt();
		System.out.print("Enter the numbers of columns in MATRIX 2 ");
		int col2=scan.nextInt();
		int [][] A= new int[row1][col1];
		int [][] B= new int[row2][col2];
		int [][] C= new int[row1][col2];
		if (row2==col1){
			System.out.println();
			System.out.println("MATRIX 1");
			for(int i=0;i<row1;i++){
				for (int j=0;j<col1;j++){
					System.out.print("Enter element ["+ (i+1)+"]["+(j+1)+"]");
					A[i][j]=scan.nextInt();
				}
			}
			for(int i=0;i<row1;i++){
				for (int j=0;j<col1;j++){
					System.out.print(A[i][j]+"  ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("MATRIX 2");
			for(int i=0;i<row2;i++){
				for (int j=0;j<col2;j++){
					System.out.print("Enter element ["+ (i+1)+"]["+(j+1)+"]");
					B[i][j]=scan.nextInt();
				}
			}
			for(int i=0;i<row2;i++){
				for (int j=0;j<col2;j++){
					System.out.print(B[i][j]+"  ");
				}
				System.out.println();
			}
		
			for(int i=0;i<row1;i++){
				for (int j=0;j<col2;j++){
					for(int k=0;k<col1;k++){
						C[i][j]+=A[i][k]*B[k][j];
					}
				}
			}
			System.out.println();
			System.out.println("RESULTANT MATRIX");
			for(int i=0;i<row1;i++){
				for (int j=0;j<col2;j++){
					System.out.print(C[i][j]+"  ");
				}
				System.out.println();
			}
		}else{
			System.out.println("INVALID MATIX");
		}
	}
}
