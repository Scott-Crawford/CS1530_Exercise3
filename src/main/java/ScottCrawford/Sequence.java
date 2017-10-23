package ScottCrawford;

public class Sequence{
	public static int Tri(int value){
		int tri=0;
		for(int i=value;i>0;i--){
			tri+=i;
		}
		return tri;
	}
	public static int Lazy(int value){
		return ((value*value) + value + 2)/2;
	}
	
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Enter something buddy");
			System.exit(1);
		} 
		else {
			int value = Integer.parseInt(args[0]);
			int tri=Tri(value);
			int lazy=Lazy(value);
			System.out.println("Tri("+value+") = "+tri);
			System.out.println("Lazy("+value+") = "+lazy);
			System.exit(0);
		}
	}
}