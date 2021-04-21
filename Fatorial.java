public class Fatorial {
    public static void main(String[] args) {
        int num = 4;
        int fat = 1;
        System.out.print(num+"! ");
        for(int f = 1; f <= num; f++){
            fat *= f;
            System.out.print(" "+f);
        }
        System.out.println(" "+fat);
    }
}
