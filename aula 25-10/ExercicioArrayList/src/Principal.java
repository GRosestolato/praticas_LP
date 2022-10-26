public class Principal {
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        c1.nome = "Palio";
        c1.cor = "cinza";

        Carro c2 = new Carro();
        c2.nome = "Gol";
        c2.cor = "Cinza";

        Agencia ag = new Agencia();
        ag.nome = "Agência Torresmo";
        ag.adicionarCarro(c1);
        ag.adicionarCarro(c2);

        int qtdCarros = ag.getQuantidadeCarros();


        System.out.println("A lisa de carros da agência: " + ag.nome + " possui "  + qtdCarros + " Carros ");
    }
}
