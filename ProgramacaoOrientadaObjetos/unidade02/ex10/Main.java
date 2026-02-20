package unidade02.ex10;

public class Main {
    public static void main(String[] args) {
        Autenticavel usuario = new Usuario("senha123");
        Autenticavel admin = new Administrador("admin123");

        System.out.println("Autenticação do usuário: " + usuario.autenticar("senha123"));
        System.out.println("Autenticação do administrador: " + admin.autenticar("admin123"));
    }
}
