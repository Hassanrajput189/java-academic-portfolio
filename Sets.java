import java.util.ArrayList;
public class Sets{
	public static void findSubsets(int n,ArrayList<Integer> subset){
		if(n==0){
			for(int i =0;i<subset.size();i++){
				System.out.print(subset.get(i) + " ");
			}System.out.println();
			return;
		}
		//add hoga
		subset.add(n);
		findSubsets(n-1,subset);
		
		//add nahi hoga
		subset.remove(subset.size()-1);
		findSubsets(n-1,subset);
	}
	public static void main(String[] args) {
		int n = 3;
		ArrayList <Integer> subset = new ArrayList<>();
		findSubsets(n,subset);
	}
}