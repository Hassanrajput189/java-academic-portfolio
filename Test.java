// class Youtube{
// 	String title;
// 	String name;
// 	long viws;
// 	float likes;
// 	String upload_date;
// 	String duration;
// 	String comments[];
// 	Youtube(){
// 		title = "my video";
// 		name = "Hassan";
// 		viwes = 1000000000;
// 		likes = 1.5f;
// 		upload_date = "7/8/2023";
// 		duration = "1 min";

// 	}
// 	public void play(){
// 		System.out.println("Play game");
// 	}
// 	public void forware_10(){
// 		System.out.println("forwared 10 times");
// 	}
// 	public void add_comments(String s){
// 		System.out.println(s);
// 	}
// 	public void remove_video(){
// 		System.out.println("video is removed");
// 	}
// }
	class Calculator{
		int a;
		int b;
		Calculator(){
			a = 3;
			b = 2;
		}
		public int add(){
			return a+b;
		}
		public int sub(){
			return a-b;
		}
		public int mul(){
			return a*b;
		}
		public int div(){
			return a/b;
		}
		public int power(){
			int total = 1;
			for(int i =0;i < b;i++){
				total *=a;
			}
			return total;
		}
	}
public class Test{
	public static void main(String args[]){
		Youtube vid1 = new Youtube();
		Youtube vid2 = new Youtube();
		Calculator cal= new Calculator();
		System.out.println(cal.power());
	}
}