package Wrappers;

public class Wrappers {
    public static void main(String[] args) {
        
        // Tipos primitivos
        int idade = 31;
        double preco = 12.45;
        char sexo = 'M';
        boolean casado = true;

        // classes Wrappers

        Integer wIdade = new Integer(31);
        Double wPreco = new Double("12.45");
        Character wSexo = new Character('F');

        Boolean wCasado = new Boolean("true");

        // conversão estáticas

        double d1 = Double.parseDouble("12.45");
        int int1 = Integer.parseInt("123");
        float float1 = Float.parseFloat("3.14F");





    }
}
