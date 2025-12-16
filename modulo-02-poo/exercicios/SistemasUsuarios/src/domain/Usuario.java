package domain;

public abstract class Usuario {

    private String nome;
    private String email;
    private String senha;
    private final boolean isAdministrador;

    public Usuario(String nome, String email, String senha, boolean isAdministrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdministrador = isAdministrador;
    }

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public final String login(String email, String senha){
        if(this.email.equalsIgnoreCase(email) && this.senha.equals(senha)){
            return  this.nome+": Login efetuado com sucesso!";
        }
        else{
           return "Email ou senha invalido!";
        }
    }

    public final String logoff(){
        return "Logoff efetuado com sucesso!";
    }

    public final void alterarDados(String novoNome, String novoEmail){
        setNome(novoNome);
        setEmail(novoEmail);
    }

    public final void alterarSenha(String novaSenha){
        setSenha(novaSenha);
    }


}
