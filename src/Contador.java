
import java.util.Random;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        Integer parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        Integer parametroDois = sc.nextInt();
        
        ContadorController cont = new ContadorController();
        
        try {
            cont.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}