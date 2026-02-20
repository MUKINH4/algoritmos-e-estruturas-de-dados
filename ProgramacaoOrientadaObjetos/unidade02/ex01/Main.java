package unidade02.ex01;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic", 2022, 4, "Gasolina");
        Moto moto = new Moto("CB 500", 2021, 500, true);

        carro.acelerar();
        carro.detalhesCarro();
        System.out.println("---------------------");
        moto.acelerar();
        moto.detalhesMoto();

    }
}
