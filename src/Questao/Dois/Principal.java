package Questao.Dois;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
	public static void main(String[] args) throws IOException {
		/**
		 * @author Raniere de Lima
		 * @version 1.0
		 * @date 18/10/2015 
		 * Cria a conexao com o Arquivo
		 */

		File escrita = new File("licenca.txt");
		FileWriter fas = null;
		/**
		 * Verifica se o Arquivo Existe
		 */
		if (escrita.exists())
			System.out.println("Arquivo existente");
		else
			System.out.println("Arquivo não existe");
			escrita.createNewFile();
		fas = new FileWriter(escrita);

		/**
		 * Escreve no arquivo
		 */
		fas.write("LICN889930");
		/**
		 * fecha o FileWrite
		 */
		fas.close();

	}

}