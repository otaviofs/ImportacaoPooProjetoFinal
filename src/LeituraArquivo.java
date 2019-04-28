import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraArquivo {

    private String nomeArquivo;
    
public BufferedReader abrirArquivo(String arquivo) throws FileNotFoundException {
	File file = new File(arquivo);
            setNomeArquivo(file.getName());
	FileReader fr = new FileReader(file);
	BufferedReader br = new BufferedReader(fr);
	return br;
}

public List<String> lerArquivo(String arquivo) throws FileNotFoundException,IOException {
            this.nomeArquivo=arquivo;
            
	BufferedReader br = abrirArquivo(arquivo);
	List<String> lista = new ArrayList<>();
	while (br.ready()) {
		lista.add(br.readLine());
	}
	return lista;
}
    
    private void setNomeArquivo(String nome){
        this.nomeArquivo=nome;
    }
public String getNomeArquivo1(){
         String[] str= nomeArquivo.split("_");
         return "Processadora"+str[0].toString();
    }
}
