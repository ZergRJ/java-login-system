public class Usuario {
    private int id;
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(int id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public void imprimirResumo() {
        System.out.println("-------------------------");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("-------------------------");
        System.out.println();
    }

    public String toFile() {
        return this.nome + ";" + this.senha;
    }

    public int getId() { return id;}

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public boolean setNome(String novoNome) {
        if (novoNome != null && !novoNome.isBlank()) {
            this.nome = novoNome;
            return true;
        } else {
            return false;
        }
    }
}
