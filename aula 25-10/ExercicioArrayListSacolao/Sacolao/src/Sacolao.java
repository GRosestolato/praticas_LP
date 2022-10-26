import java.util.ArrayList;
import java.util.List;

public class Sacolao {
 
    String nome;
    List <Fruta> listaFrutas = new ArrayList<Fruta>();

    public void adicionarFruta (Fruta fruta){
        listaFrutas.add(fruta);
    }

    public int getQuantidadeFrutas(){
    return listaFrutas.size();
    }

    public double total(){

        double vtotal = 0;

        for(Fruta fruta : listaFrutas){
             vtotal += fruta.getValor();
        }
        return vtotal;
    }
   }
 
