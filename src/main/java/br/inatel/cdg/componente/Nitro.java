package br.inatel.cdg.componente;

public class Nitro implements Componente{
    public int aumentoVelocidadePorSegundo;

    public Nitro(int aumentoVelocidadePorSegundo) {
        this.aumentoVelocidadePorSegundo = aumentoVelocidadePorSegundo;
    }

    @Override
    public String toString() {
        return "Nitro{" +
                "aumentoVelocidadePorSegundo=" + aumentoVelocidadePorSegundo +
                '}';
    }
}
