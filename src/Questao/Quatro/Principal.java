package Questao.Quatro;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Principal {
/**
 * @author Raniere de Lima
 * @version 1.0.0
 * @date 18/10/2015
 * @param args
 * @throws IOException
 */
	public static void main(String[] args) throws IOException {
	/*
	 * Lendo o console do Java
	 */
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String s;
	/**
	 * Escrevendo no Console
	 */
	while((s=in.readLine()).length() !=0)
		System.out.println(s);
	}

}
