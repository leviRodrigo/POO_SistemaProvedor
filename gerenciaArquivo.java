import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.List;


public class gerenciaArquivo {
	private String nomeArquivo= "teste.txt";
	
	
	
	public void salvarArquivo(List<Clientes> conteudo) throws IOException{
		FileWriter fw = new FileWriter(nomeArquivo);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Clientes g: conteudo){
			bw.write(g.toString());
			bw.newLine();
		}
		bw.close();
		
	}
	public List<String> recuperarArquivo(String nomeArquivo){
		return null;
	}
}
