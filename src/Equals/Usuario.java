package Equals;

public class Usuario {
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario usuario = (Usuario) obj;

            boolean verificaNome = usuario.nome.equals(this.nome);
            boolean verificaEmail = usuario.email.equals(this.email);
            return verificaNome && verificaEmail;
        }

        return false;
    }



}
