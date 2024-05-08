package veiculo;

public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerar o carro");
    }

    @Override
    public void frear() {
        System.out.println("Frear o carro");
    }
    
}
