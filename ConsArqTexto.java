import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class ConsArqTexto {
	
	public void ConsArqTexto() {
		
		System.out.println("************ Consulta Arquivos de Texto **********"+"\n");
		
		String mostra="";
		String nomeArq="C:\\Users\\willi\\Desktop\\Projeto  em JAVA";
		String linha = "";
		File arq = new File(nomeArq);
		
		if (arq.exists()) {
			
		    mostra=	"Tamanho do arquivo"+Long.toString(arq.length())+"\n";
		    
		try {
			FileReader reader = new FileReader(nomeArq);
			BufferedReader leitor = new BufferedReader(reader);
		    while (true) {
		    	linha=leitor.readLine();
		    if (linha==null)
		    	break;
		    mostra+=linha+"\n";	
		    }
		    }
		    catch(Exception erro) {}
		    System.out.println("conteudo existente");
		    JOptionPane.showMessageDialog(null, mostra,"Arquivo...",1);
		}
		else
			//System.out.println("Arquivo Inesistente");
		     JOptionPane.showMessageDialog(null, mostra,"Arquivo Inesistente",1);
	}
}