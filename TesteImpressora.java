/*
2 Escreva uma classe de teste que chama cada um dos métodos que você escreveu no
exercício 1.
*/

public class TesteImpressora {
    public static void main(String[] args) {
        Impressora imp = new Impressora();

        imp.exibir(1); 

        imp.exibir(1,5);

        imp.exibir(1,"Oi");

        imp.exibir("Oi",1);

        imp.exibir("Boas-Vindas","Tudo bem?","Estude!");

        imp.exibir(1, 8, "Ola mundo");
    }
}
