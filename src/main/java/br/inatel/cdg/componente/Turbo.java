package br.inatel.cdg.componente;

public class Turbo implements Componente {
    public int aumentoVelocidadePorSegundo;

    public Turbo(int aumentoVelocidadePorSegundo) {
        this.aumentoVelocidadePorSegundo = aumentoVelocidadePorSegundo;
    }

    @Override
    public String toString() {
        return "Turbo{" +
                "aumentoVelocidadePorSegundo=" + aumentoVelocidadePorSegundo +
                '}';
    }
}
