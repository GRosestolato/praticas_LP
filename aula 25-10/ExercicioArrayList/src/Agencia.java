import java.util.ArrayList;
import java.util.List;

public class Agencia {
    
    String nome;
    List <Carro> listaCarros = new ArrayList<Carro>();

    public void adicionarCarro(Carro carro){
        listaCarros.add(carro);
    }

    public int getQuantidadeCarros(){
        return listaCarros.size();
    }

    

}
