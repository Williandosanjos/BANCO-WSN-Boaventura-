import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GravArqTexto {
	
	public void GravArqTexto() throws IOException {
		
		String[] ArquivoTexto = {"Agencia","Conta","Nome","E-mail","Telefone","Saldo" };
		
		FileWriter arquivo = new FileWriter("C:\\Users\\willi\\Desktop\\Projeto  em JAVA");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		gravarArquivo.printf("Cadastro de Cliente");
		gravarArquivo.printf("Dados dos Cliente");
		
		for (int contador=0; contador<4; contador++) {
			gravarArquivo.printf(ArquivoTexto[contador]);
		}
		arquivo.close();
		System.out.println("O arquivo está sendo gravado na unidade \"C:\\\\Users\\\\willi\\\\Desktop\\\\Projeto  em JAVA\"");
		
	}
}	