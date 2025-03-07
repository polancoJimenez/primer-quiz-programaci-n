import java.util.Scanner;

public class EjercicioQuiz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingresa el numero: ");
        byte n = scanner.nextByte();
        for(byte aumento1 = 1;aumento1 <= n;aumento1++){
            for(byte aumento2 = 1; aumento2 <= n;aumento2++){
                System.out.print(aumento2);

            }
            System.out.println(" ");
        }
        scanner.close();
    }
}
