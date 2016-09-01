
package monopoly.structure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Lecturecsv {
	
	public static void main(String[] args) throws Exception {
		
		lectureCSV();
	}
		
	public static String lectureCSV() throws IOException{ 
			
			String resultat = "";
		
			BufferedReader br = new BufferedReader(new FileReader("/home/infoetu/hourdeaa/git/MonopolyAGILE/res/plateauinit.csv"));
			String ligne = null;
			while ((ligne = br.readLine()) != null) {
				// Retourner la ligne dans un tableau
				String[] data = ligne.split(",");

				// Afficher le contenu du tableau
				for (String val : data) {
					resultat =resultat +"\n"+ val;
				}
				
			}
			
		
		br.close();
		System.out.println(resultat);
	return resultat;
	
}
}