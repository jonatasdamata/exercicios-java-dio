package pessoa;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //Obs.: Usar o Construtor apenas quando fou usar atributos principais/relevantes.
    // Exemplo: O que precisa para criar um objeto aluno? o seu nome e sua matrícula.
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String newEndereco) {
        endereco = newEndereco;
    }
}
