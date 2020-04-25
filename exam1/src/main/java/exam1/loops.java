package exam1;

public class loops {
public static void main(String[] args) {
	int z=1;
	
	for (int i = 1; i < 6; i++) {	
		
		for (int j = 1; j <= i; j++) {
			System.out.print(z++ +" ");
		}
			System.out.println();
	}
	
	}
}
