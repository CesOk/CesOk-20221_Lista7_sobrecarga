public class CalculadoraCientifica {

    //3.1.1 Lista de parâmetros com um inteiro
    public double raiz(int i1){        
        return Math.sqrt(i1);
    }

    //3.1.2 Lista de parâmetros com um double
    public double raiz(double d1){        
        return Math.sqrt(d1);
    }

    /*
    3.1.3 Lista de parâmetros com uma String 
    (internamente, ele converte a String para Double 
    com Double.parseDouble antes de fazer a operação).
    */
    public double raiz(String s1){
        return Math.sqrt(Double.parseDouble(s1));
    }

    /*
    3.2.1 Lista de parâmetros com dois bytes a e b. 
    Ele calcula e devolve a elevado a b.
    */
    public double potencia(byte a, byte b){
        return Math.pow(a, b);
    }

    /*3.2.2 Lista de parâmetros com duas Strings s1 e s2. 
    Ele converte ambas para double,
    calcula e devolve s1 elevado a s2.*/
    public double potencia(String s1, String s2){
        return Math.pow(Double.parseDouble(s1),Double.parseDouble(s2));
    }
    
    /*3.2.3 Lista de parâmetros com um inteiro a e um double b. 
    Ele calcula e devolve a elevado a b.*/
    public double potencia(int a, double b){
        return Math.pow(a, b);
    }
}
