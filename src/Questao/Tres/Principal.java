package Questao.Tres;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Principal {
/**
 * @author Raniere de Lima
 * @version 1.0.0
 * @date 18/10/2015
 * @param args
 * @throws IOException Caso seja lançado alguma exceção, FileNotFoundException
 */
	public static void main(String[] args) throws IOException {
	/**
	 * Leitura do arquivo que vai ser compactado
	 */
		
		BufferedReader in = new BufferedReader(new FileReader("relatorio.txt"));
		/**
		 * Saída do arquivo
		 */
		BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("relatorio.gz")));
		
		int c;
		/**
		 * Copiador de byte a byte do arquivo.
		 */
		while((c=in.read()) !=-1)
			out.write(c);
		in.close();
		out.close();
	}

}
