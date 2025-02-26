package re_coding6;

public class Matrix_Last_Cell {
	public static void Matrix(int m, int n, int row , int col , String Path) {
		if(row==m-1 && col==n-1) {
			System.out.print(Path+"  ");
			return ;
		}if(row>m || col>n) {
			return ;
		}
		Matrix(m,n,row,col+1,Path+"H");
		Matrix(m,n,row+1,col,Path+"V");
	}
	public static void MatrixPath(int m, int n, int row , int col , String Path) {
		if(row==m && col==n) {
			System.out.print(Path+"  ");
			return ;
		}if(row>m || col>n) {
			return ;
		}
		MatrixPath(m,n,row,col+1,Path+"H");
		MatrixPath(m,n,row+1,col,Path+"V");
	}

	public static void main(String[] args) {
		int m =3;int n =3;
		Matrix(m,n,0,0,"");
		System.out.println();
		MatrixPath(m-1,n-1,0,0,"");
	}

}
