import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        System.out.printf("Paciente: %s\nIMC: %.2f - %s\n", nome, imc, classificacao);
        scanner.close();
    }
}
