<<<<<<< HEAD
package affichage;

public class Affichage {

	public static void main(String args[]) {
		for (int j = 0; j < 10; j++) {
			if (j == 0 || j == 9)
				for (int i = 0; i < 10; i++) {
					System.out.print(" * ");
				}
			else
				for (int i =0 ; i<10;i++) {
					if(i==0 || i==9)
						System.out.print(" * ");
					else
						System.out.print("   ");
				}
			System.out.println();
		}
		
	}
	
	

}
=======
package affichage;

public class Affichage {

	public static void main(String args[]) {
		for (int j = 0; j < 10; j++) {
			if (j == 0 || j == 9)
				for (int i = 0; i < 10; i++) {
					System.out.print(" * ");
				}
			else
				for (int i =0 ; i<10;i++) {
					if(i==0 || i==9)
						System.out.print(" * ");
					else
						System.out.print("   ");
				}
			System.out.println();
		}
		
	}
	
	

}
>>>>>>> 3c735e2fe0c28ac47720a7cd050ca81560d33c3e
