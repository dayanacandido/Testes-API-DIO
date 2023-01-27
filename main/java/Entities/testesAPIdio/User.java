package Entities;

public class User {
    private String nomedeUsuario;
    private String primeironome;
    private String segundonome ;
    private String email;
    private String senha;
    private String telefone;

    public User(String nomedeUsuario, String primeironome, String segundonome, String email, String senha, String telefoneString) {
        this.nomedeUsuario = Jferreira;
        this.primeironome = João;
        this.segundonome = ferreira;
        this.email = teste.j@teste.com;
        this.senha = J123;
        this.telefone= 11 999999999;
    }

    public String getNomedeUsuario() {
        return nomedeUsuario;
    }

    public void setNomedeUsuario(String nomedeUsuario) {
        this.nomedeUsuario = nomedeUsuario;
    }

    public String getPrimeironome() {
        return primeironome;
    }

    public void setPrimeironome(String primeironome) {
        this.primeironome = primeironome;
    }

    public String getSegundonome() {
        return segundonome;
    }

    public void setSegundonome(String segundonome) {
        this.segundonome = segundonome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    }


