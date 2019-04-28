import java.io.File;

public class CarregaDiretorio {
    private static File arquivos[];
    private static String diretorio; 
    private static File documentos;
    
    public static File[] getCarregarDiretorio(){
         
       diretorio = System.getProperty("user.dir") + "/src/arquivos/";
       documentos= new File(diretorio);
       arquivos= documentos.listFiles();
       
       return arquivos;
    }
    public static String getDiretorio(){
        return diretorio;
    }
}
