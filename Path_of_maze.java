import java.util.Scanner;
public class Path_of_maze{
	public static int calPath(int i ,int j,int n ,int m){
		if(i==n-1&&j==m-1){
			return 1;
		}
		if(i==n||j==m){
			return 0;
		}
		int downPath = calPath(i+1,j,n,m);
		int rightPath = calPath(i,j+1,n,m);
		return downPath+rightPath;
	} 
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		Path_of_maze pom = new Path_of_maze();
		System.out.println("Enter the no of Rows");
		int n = sc.nextInt();
		System.out.println("Enter the no of Columns");
		int m = sc.nextInt();
		System.out.println(pom.calPath(0,0,n,m));
	}
}