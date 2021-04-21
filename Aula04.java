public class Aula04 {
    public static void main(String[] args) {
        System.out.println("Hello new test.");
        int myAge = 24;
        int dogAge = 14 + 1;
        double weigh2 = 64.5; //Ponto flutuante, float do python.

        System.out.println("I'm "+ myAge + " years old.");
        System.out.println("My dog is "+dogAge+" years old.");
        System.out.println("I weigh "+weigh2+"kg.");

        double divisao = 5 / 2.0;
        System.out.println(divisao);

        double salary = 1234.60;
        int value = (int) salary; //Desta forma ele aceita um valor double em um inteiro, mas perde os números depois da vírgula.
        System.out.println(value);
    }
}
