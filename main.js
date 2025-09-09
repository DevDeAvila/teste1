// Arquivo: Main.java
public class Main {
    public static void main(String[] args) {
        // Criando algumas pessoas
        Pessoa p1 = new Pessoa("Ana", 25);
        Pessoa p2 = new Pessoa("Carlos", 30);

        // Exibindo informações
        System.out.println("=== Cadastro de Pessoas ===");
        p1.exibirInfo();
        p2.exibirInfo();
    }
}

// Classe Pessoa
class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " anos");
    }
}