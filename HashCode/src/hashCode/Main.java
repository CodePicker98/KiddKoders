package hashCode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayBooksScore = new ArrayList<>();
		Object matriz[][];
		ArrayList<Library> libraries = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("files/a_example.txt"));
			String line;
			int contLines = 0;
			
			while((line = br.readLine()) != null) {
				if (contLines == 0) {
					matriz = new Object[tokenize(line).get(1)][tokenize(line).get(2)];
				}
				if (contLines == 1) {
					arrayBooksScore = tokenize(line);
				}
				if(contLines%2 == 0 && contLines > 0) {
					String booksLine = br.readLine();
					libraries.add(new Library(tokenize(line).get(1), tokenize(line).get(2), tokenize(booksLine)));
					contLines++;
				}
				contLines++;
			}
			/*Iterator<Integer> it = arrayBooksScore.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}*/
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static ArrayList<Integer> tokenize(String line) {
		StringTokenizer st = new StringTokenizer(line, " ");
		ArrayList<Integer> tokens = new ArrayList<>();
		while (st.hasMoreTokens()) {
			tokens.add(Integer.parseInt(st.nextToken()));
		}
		return tokens;
	}
	
	private static int countScore(Object[][] matriz, ArrayList<Integer> arrayBooksScore) {
		int result = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				String campo = String.valueOf(matriz[i][j]);
				StringTokenizer st = new StringTokenizer(campo,",");
				while(st.hasMoreTokens()) {
					result += arrayBooksScore.get(Integer.parseInt(st.nextToken()));
				}
				
			}
			
		}
		
		return result;
	}
}
