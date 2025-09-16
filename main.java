import java.util.Scanner;
class Paciente {
     String nome;
     double peso;
     double altura;

     Paciente(String nome, double peso, double altura) {
          this.nome = nome;
          this.peso = peso;
          this.altura = altura;
     }

     double calcularIMC() {
          return peso / (altura * altura);
     }

     String faixaIMC(double imc) {
          if (imc < 18.5) return "Abaixo do peso";
          else if (imc < 25.0) return "Peso normal";
          else if (imc < 30.0) return "Sobrepeso";
          else if (imc < 35.0) return "Obesidade grau I";
          else if (imc < 40.0) return "Obesidade grau II";
          else return "Obesidade grau III";
     }
}

public class main {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Nome do paciente: ");
          String nome = sc.nextLine();

          System.out.print("Peso (kg): ");
          double peso = sc.nextDouble();

          System.out.print("Altura (m): ");
          double altura = sc.nextDouble();

          Paciente paciente = new Paciente(nome, peso, altura);
          double imc = paciente.calcularIMC();
          String faixa = paciente.faixaIMC(imc);

          System.out.printf("Paciente: %s\nIMC: %.2f\nSituação: %s\n", nome, imc, faixa);

          // Extensão: Simulação de monitoramento de pacientes
          // Exemplo de lista de pacientes
          Paciente[] pacientes = {
                paciente,
                new Paciente("Ana", 68, 1.65),
                new Paciente("Carlos", 95, 1.80)
          };

          System.out.println("\nMonitoramento de pacientes:");
          for (Paciente p : pacientes) {
                double imcP = p.calcularIMC();
                String faixaP = p.faixaIMC(imcP);
                System.out.printf("Paciente: %s | IMC: %.2f | Situação: %s\n", p.nome, imcP, faixaP);
          }

          sc.close();
     }
}







