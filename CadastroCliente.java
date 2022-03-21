import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {

	public static void main(String[] args) throws IOException {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList <CadastroCliente> CadastroCliente= new ArrayList();
		
		boolean rodando = true;
		
		while(rodando) {
			
	
		System.out.println();
		System.out.println("*********** Banco WSN Boaventura ***********"+"\n"+"\n");
		
		
		System.out.println("Escolha uma Opção"+"\n");
		System.out.println("1º Cadastro de Cliente");
		System.out.println("2º Lista Clientes");
		System.out.println("3º Gravar em arquivo texto");
		System.out.println("4º Consultar arquivo texto");
		System.out.println("5º Atualizar Cliete");
		System.out.println("6º Excluir Cliente");
		System.out.println("7º Sair");
		
		String opcao = teclado.nextLine();
		
		switch (opcao) {
		
		case "1" :{
			
			System.out.println("**********Cadastro de Cliente**********"+"\n");
			System.out.println("Agência");
			String agencia = teclado.nextLine();
			System.out.println("Conta");
			String conta = teclado.nextLine();
			System.out.println("Nome");
			String nome = teclado.nextLine();
			System.out.println("E-mail");
			String email = teclado.nextLine();
			System.out.println("Telefone");
			String telefone = teclado.nextLine();
			System.out.println("Saldo");
			String saldo = teclado.nextLine();
			
			CadastroCliente u = new CadastroCliente();
			u.atribuirAgencia(agencia);
			u.atribuirConta(conta);
			u.atribuirNome(nome);
			u.atribuirEmail(email);
			u.atribuirTelefone(telefone);
			u.atribuirSaldo(saldo);
			
			
			CadastroCliente.add(u);
			
			break;
		}
		case "2" :{
			
			System.out.println("*******Lista Clientes*********"+"\n\n");
			
			for(int i=0; i<CadastroCliente.size(); i++) {
				
				CadastroCliente uTemp = CadastroCliente.get(i);
				
				System.out.println("Usuario "+(i+1));
				System.out.println("\tAgência: "+CadastroCliente.get(i).pegarAgencia());
				System.out.println("\tConta: "+CadastroCliente.get(i).pegarConta());
				System.out.println("\tNome: "+CadastroCliente.get(i).pegarNome());
				System.out.println("\tE-mail:"+CadastroCliente.get(i).pegarEmail());
				System.out.println("\tTelefone: "+CadastroCliente.get(i).pegarTelefone());
				System.out.println("\tSaldo: "+CadastroCliente.get(i).pegarSaldo());
				
			}
			
			
			break;
		}
		case "3" :{
			
			GravArqTexto texto1 = new GravArqTexto();
			texto1.GravArqTexto();
			
			break;
		}
		case "4" :{
			
			ConsArqTexto texto2 = new ConsArqTexto();
			texto2.ConsArqTexto();
			
			break;
		}
		case "5" :{
			
			System.out.println("********Atualizar Cliente********"+"\n");
			
			for(int i = 0; i<CadastroCliente.size();i++) {
				
				CadastroCliente utemp =CadastroCliente.get(i);
				System.out.println("[" + "] " + utemp.pegarConta());
				
				System.out.println("Digite o cliente que deseja atualizar:");
				int cliente = teclado.nextInt();
				teclado.nextLine();
				
				
				System.out.println("Digite a Ag�ncia");
				String novaAgencia = teclado.nextLine();
				System.out.println("Digite a Conta");
				String novaConta = teclado.nextLine();
				System.out.println("Digite o Nome");
				String novaNome = teclado.nextLine();
				System.out.println("Digite o E-mail");
				String novaEmail = teclado.nextLine();
				System.out.println("Digite o Telefone");
				String novaTelefone = teclado.nextLine();
				System.out.println("Digite o Saldo");
				String novaSaldo = teclado.nextLine();
				
				CadastroCliente u = CadastroCliente.get(cliente);
				u.setAgencia(novaAgencia);
				u.setConta(novaConta);
				u.setNome(novaNome);
				u.setEmail(novaEmail);
				u.setTelefone(novaTelefone);
				u.setSaldo(novaSaldo);
				
			}
			
			
			break;
		}
		case "6" :{
			
			System.out.println("********Excluir Cliente********"+"\n");
			
			for(int i = 0; i<CadastroCliente.size();i++) {
				
				CadastroCliente utemp =CadastroCliente.get(i);
				System.out.println("[" + "] " + utemp.pegarConta());
				}	

			System.out.println("Digite o cliente que deseja atualizar:");
			int cliente = teclado.nextInt();
			teclado.nextLine();
			
			CadastroCliente.remove(cliente);
			
			break;
		}
		case "7" :{
			
			rodando = false;
			
			break;
		}
			
		
		}
		}
		}

	private void setAgencia(String novaAgencia) {
		// TODO Auto-generated method stub
		
	}

	private void setSaldo(String novaSaldo) {
		// TODO Auto-generated method stub
		
	}

	private void setTelefone(String novaTelefone) {
		// TODO Auto-generated method stub
		
	}

	private void setNome(String novaNome) {
		// TODO Auto-generated method stub
		
	}

	private void setConta(String novaConta) {
		// TODO Auto-generated method stub
		
	}

	private void setEmail(String novaAgencia) {
		// TODO Auto-generated method stub
		
	}

	private String pegarSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	private String pegarTelefone() {
		// TODO Auto-generated method stub
		return null;
	}

	private String pegarEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	private String pegarNome() {
		// TODO Auto-generated method stub
		return null;
	}

	private String pegarConta() {
		// TODO Auto-generated method stub
		return null;
	}

	private String pegarAgencia() {
		// TODO Auto-generated method stub
		return null;
	}

	private void atribuirSaldo(String saldo) {
		// TODO Auto-generated method stub
		
	}

	private void atribuirTelefone(String telefone) {
		// TODO Auto-generated method stub
		
	}

	private void atribuirEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	private void atribuirNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	private void atribuirConta(String conta) {
		// TODO Auto-generated method stub
		
	}

	private void atribuirAgencia(String agencia) {
		// TODO Auto-generated method stub
		
	}
}