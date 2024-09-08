package controller;

import br.edu.fateczl.pilhaint.Pilha;

/*4. Implementar um novo projeto Java com base biblioteca PilhaInt que permita a conversão de
decimais para binários, a qual se dá dividindo, sucessivamente, o valor de entrada por 2 e
concatenando os restos da divisão do úl�mo para o primeiro.
O projeto deve ter uma classe ConverteController no package controller, que inicialize uma pilha
de inteiros e com um método decToBin(int decimal): String, que, recebendo um número decimal
e realizando as operações, irá inserindo os restos das divisões na pilha. Ao término do
empilhamento, deverá ser feita a operação de desempilhar, concatenando cada número
desempilhado (Convertendo para String) com o próximo, até a pilha esvaziar.
Deve-se ter também uma classe Principal no package view que permita ao usuário inserir um
número decimal limitado a 1000.*/

public class ConverteController {

	public ConverteController() {
		super();
	}
	
	public String decToBin(int decimal)
	{
		Pilha p = new Pilha();
		
		while(decimal>0)
		{
			p.push(decimal);
			decimal=decimal/2;
		}
		String binario="";
		while(!p.isEmpty())
		{		
		try{
		int num=(p.pop()%2);
		binario+= Integer.toString(num);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
		return binario;
		
		}	
		
	}
	

