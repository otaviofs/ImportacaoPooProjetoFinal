
public class ProcessadoraInjetora {
	
    public static ProcessadorLinha getProcessadorLinha(String nomeArquivo) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        return (ProcessadorLinha) Class.forName(nomeArquivo).newInstance();
    }
}
