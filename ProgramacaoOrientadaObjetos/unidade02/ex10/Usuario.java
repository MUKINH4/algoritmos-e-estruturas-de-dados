package unidade02.ex10;

public class Usuario implements Autenticavel {
    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senhaDigitada) {
        return senha.equals(senhaDigitada);
    }
}
