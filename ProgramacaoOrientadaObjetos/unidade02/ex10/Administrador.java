package unidade02.ex10;

public class Administrador implements Autenticavel {
    private String senhaAdmin;

    public Administrador(String senhaAdmin) {
        this.senhaAdmin = senhaAdmin;
    }

    @Override
    public boolean autenticar(String senhaDigitada) {
        return senhaAdmin.equals(senhaDigitada);
    }
}
