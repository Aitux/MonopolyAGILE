package monopoly.structure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Lecturecsv {	

	
//	public static void main(String[] args){
//		try {
//			System.out.println(lectureCSV().toString());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	private static ArrayList<String []> dataCases = new ArrayList<String[]>();
	
	public static ArrayList<String []> lectureCSV() throws IOException {

		String resultat = "";
		InputStream is = Lecturecsv.class.getClassLoader().getResourceAsStream("plateauinit.csv");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
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