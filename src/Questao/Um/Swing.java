package Questao.Um;
import java.util.Random;

import javax.swing.JOptionPane;

public class Swing {
/**
 * @author Raniere de Lima
 * @version 1.0.0
 * @date 18/10/2015
 * @param Inicio do codigo
 */
	public static void main(String[] args) {
		/**
		 *  resposta � a respota do jogo
		 * x e i, s�o para a resposta do jogador e contagem das jogadas dele
		 */
		Random random = new Random();
		int resposta=random.nextInt(51);
		int imaior,imenor,x, i=1;
		
		JOptionPane.showMessageDialog(null,"Bem Vindo ao Jogo de Advinha��o, nesse jogo mas tentar acerta um valor entre 1 a 50 ");
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero entre 1 a 50"));
	
			while (x != resposta){
				
					for (imaior=0;x<resposta;imaior++){
					JOptionPane.showMessageDialog(null,"Quase l�, por�m o numero correto � maior que "+x);
					x = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero entre 1 a 50"));
				}
				for (imenor=0; x>resposta; imenor++){
					JOptionPane.showMessageDialog(null,"Quase l�, por�m o numero correto � menor que "+x);
					x = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero entre 1 a 50"));
				}
				i=imaior+imenor;
			}
			JOptionPane.showMessageDialog(null,"Parab�ns voc� acertou. E voc� acertou na "+ i++ +"� Tentativa");
		}
	
	}