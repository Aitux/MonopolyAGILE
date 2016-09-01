package monopoly.structure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lecturecsv {

	private static ArrayList<String []> dataCases = new ArrayList<String[]>();
	
	public static ArrayList<String []> lectureCSV() throws IOException {

		String resultat = "";
		
		BufferedReader br = new BufferedReader(new FileReader(
				"/home/kwin/Monopoly/MonopolyAGILE/res/plateauinit.csv"));
		String ligne = null;
		while ((ligne = br.readLine()) != null) {
			// Retourner la ligne dans un tableau
			String[] data = ligne.split(";");
			
			dataCases.add(data);
			
			// Afficher le contenu du tableau
			/*for (String val : data) {
				resultat = resultat + "\n" + val;
			}*/
		}
		br.close();
		//System.out.println(resultat);
		return dataCases;
	}
}