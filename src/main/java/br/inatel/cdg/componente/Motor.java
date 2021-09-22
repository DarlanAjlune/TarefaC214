package br.inatel.cdg.componente;

public class Motor implements Componente {
    public int aumentoVelocidadePorSegundo;

    public Motor(int aumentoVelocidadePorSegundo) {
        this.aumentoVelocidadePorSegundo = aumentoVelocidadePorSegundo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "aumentoVelocidadePorSegundo=" + aumentoVelocidadePorSegundo +
                '}';
    }
}
