package ScottCrawford;

public class Sequence{
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("Enter something buddy");
			System.exit(1);
		} 
		else {
			int value = Integer.parseInt(args[0]);
			int tri=0;
			for(int i=value;i>0;i--){
				tri+=i;
			}
			lazy = ((value*value) + value + 2)/2;
			System.out.println("Tri("+value+") = "+tri);
			System.out.println("Lazy("+value+") = "+lazy);
			System.exit(0);
		}
	}
}