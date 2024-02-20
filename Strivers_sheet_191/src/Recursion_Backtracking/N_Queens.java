package Recursion_Backtracking;

public class N_Queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N_Queens n_Queens = new N_Queens();
		int n = 4;
		int[][] chess = new int[n][n];
		n_Queens.printnqueens(chess,0,"");

	}

	void printnqueens(int[][] chess, int row, String string) {
		// TODO Auto-generated method stub
		if(row == chess.length) {
			System.out.println(string);
			return;
		}
		
		
		for(int col  = 0;col < chess.length;col++) {
			if(ispossible(chess,row,col)==true) {
				chess[row][col]=1;
				printnqueens(chess, row+1, string + row+"-"+col+",");
				chess[row][col] = 0;
			}
		}
		
	}
	
	boolean ispossible(int[][] chess, int row,int col) {
		
		for(int i = row-1,j=col;i>=0;i--) {
			if(chess[i][j]== 1) {
				return false;
			}
			
		}
		for(int i = row -1,j = col -1;i>=0 && j >= 0;i--,j--) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		for(int i = row -1,j = col +1;i>=0 && j < chess.length;i--,j++) {
			if(chess[i][j]==1) {
				return false;
			}
		}
		return true;
	}

}
