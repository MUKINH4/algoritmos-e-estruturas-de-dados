package Unidade01;
public class Livro {
    // Crie uma classe Livro com atributos como título, autor, número de páginas e método para exibir detalhes do livro.

    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDetalhes() {
        System.out.printf("Título: %s\nAutor(a): %s \n%d páginas", titulo, autor, numeroPaginas);
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter", "J. K. Rowling", 200);
        livro.mostrarDetalhes();
    }
}
