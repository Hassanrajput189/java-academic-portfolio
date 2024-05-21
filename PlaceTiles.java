public class PlaceTiles{
	public static int placeTiles(int n ,int m){
		if(n==m){
			return 2;
		}
		if(n<m){
			return 1;
		}
		
		//vertically
		int vertically = placeTiles(n-m,m);	
		
		//horizontally
		int horizontally = placeTiles(n-1,m); 
		
		return vertically+horizontally;
	}
	public static void main(String[] args) {
		System.out.println(placeTiles(3,3));
	}
}