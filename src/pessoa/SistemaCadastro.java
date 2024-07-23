package pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João Silva", "058.845.965-32");

        pessoa.setEndereco("Rua das Marias.");

        System.out.println(pessoa.getNome() + "/" + pessoa.getCpf());
    }
}
