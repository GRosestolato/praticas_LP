public class Principal {
    public static void main(String[] args) {
        
        Fruta f1 = new Fruta();
        f1.nome = "uva";
        f1.valor = 4.50;

        Fruta f2 = new Fruta();
        f2.nome = "melancia";
        f2.valor = 0.99;

        Fruta f3 = new Fruta();
        f3.nome = "banana";
        f3.valor = 6.55;

        Sacolao sc = new Sacolao();
        sc.nome = "Sacolao VerdeGreen";
        sc.adicionarFruta(f1);
        sc.adicionarFruta(f2);
        sc.adicionarFruta(f3);
        

        int qtdFruta = sc.getQuantidadeFrutas();

        System.out.println(" A lista de frutas: " + sc.nome + "  possui: " +  qtdFruta + "Fruta: ");
        System.out.println("Preço Total: " + sc.total());


    }
    
}
