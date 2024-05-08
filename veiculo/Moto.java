package veiculo;

public class Moto implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Acelerar a moto");
    }

    @Override
    public void frear() {
        System.out.println("Frear a moto");
    }
    
}
