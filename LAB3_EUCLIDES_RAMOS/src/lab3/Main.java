package lab3;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Main {
	// permite cadastro de contato
	// permite visualização de contato
	// contato: nome, sobrenome e telefone
	// listar contatos: nome completo e posição na lista
	// ver detalhes do contato, a partir da posição do contato na lista
	// limite de 100 contatos
	
	// *** exibir menu ***
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Opcoes.opcoesPossiveis();
		char opcao = entrada.next().charAt(0);
		
		while (opcao != 'S') {
			if (opcao == 'C') {
				System.out.print("Posição: ");
				int posicao = entrada.nextInt();
				System.out.print("Nome: ");
				String nome = entrada.next();
				System.out.print("Sobrenome: ");
				String sobrenome = entrada.next();
				System.out.print("Telefone");
				String telefone = entrada.next();
				Contato contato = new Contato(nome, sobrenome, telefone);
				agenda.cadastrarContato(posicao, contato);
			} else if (opcao == 'L') {
				Agenda.listarContato();
			} else if (opcao == 'E') {
				System.out.print("Contato> ");
				int posicao = entrada.nextInt();
				agenda.exibirContato(posicao);
			} else {
				System.out.println("OPÇÃO INVÁLIDA!");
			}
			Opcoes.opcoesPossiveis();
			opcao = entrada.next().charAt(0);
		}
		System.exit(0);
	}

}
