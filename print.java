public class print{
	print(){
		System.out.println("print");
	}
	public static void main(String[] args) {
		print3 p = new print3();
	}
}
class print2 extends print{
	print2(){
		super();
	}
}
class print3 extends print2{
	print3(){
		super();
	}
}