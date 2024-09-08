package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

/*4. Implementar um novo projeto Java com base biblioteca PilhaInt que permita a conversão de
decimais para binários, a qual se dá dividindo, sucessivamente, o valor de entrada por 2 e
concatenando os restos da divisão do úl�mo para o primeiro.
O projeto deve ter uma classe ConverteController no package controller, que inicialize uma pilha
de inteiros e com um método decToBin(int decimal): String, que, recebendo um número decimal
e realizando as operações, irá inserindo os restos das divisões na pilha. Ao término do
empilhamento, deverá ser feita a operação de desempilhar, concatenando cada número
desempilhado (Convertendo para String) com o próximo, até a pilha esvaziar.
Deve-se ter também uma classe Principal no package view que permita ao usuário inserir um
número decimal limitado a 1000.
*/
public class Principal {

	public static void main(String[] args) {

		ConverteController c = new ConverteController();
		
		int x =Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 1000 e receba sua conversão em binário"));
		
		if(x>1000 || x<0)
		{	
		while(x>1000 || x<0)
		{
		System.err.println("Valor Inválido");	
		x =Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 1000 e receba sua conversão em binário"));
		}
		}
		JOptionPane.showMessageDialog(null,c.decToBin(x));

	}

}
