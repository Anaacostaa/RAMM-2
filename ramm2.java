import java.util.Scanner;
public class ramm2{
public static void main(String[] args) {
    try {
 int num;
 Scanner sc = new Scanner (System.in);
 System.out.println("Digite um número: ");
 num = sc.nextInt();
 System.out.println("O número é: "+num);
 sc.close();
    } catch (Exception e) {
        int num2;
        Scanner cs = new Scanner (System.in);
        System.out.println("Inválido");
        System.out.println("Digite um número: ");
        num2 = cs.nextInt();
        System.out.println("O número é: "+num2);
    }
}  
}