package lab3;

import java.util.Arrays;

public class Agenda {

	private Contato[] contatos = new Contato[100];
	
	public void cadastrarContato(int posicao, Contato contato) {
		contatos[posicao] = contato;
		
		
	}

	public static void listarContato() {
		// TODO Auto-generated method stub
		
	}

	public String exibirContato(int posicao) {
		for (int i = 0; i <= posicao; i++) {
			if (i == posicao) {
				
				return contatos[i];
			}
		}
		
	}

}
