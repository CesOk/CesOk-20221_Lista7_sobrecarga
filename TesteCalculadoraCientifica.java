/*
4 Escreva uma classe de teste para testar todos os métodos da sua calculadora
científica
*/

public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica CalCien = new CalculadoraCientifica();

        CalCien.raiz(1);

        CalCien.raiz(3.4);

        CalCien.raiz("6");

        CalCien.potencia(2, 7);

        CalCien.potencia("6.7", "8.0");

        CalCien.potencia(12, 2.5);
    }
}
