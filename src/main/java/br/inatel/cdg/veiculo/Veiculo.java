package br.inatel.cdg.veiculo;

import br.inatel.cdg.componente.Componente;
import br.inatel.cdg.componente.Motor;
import br.inatel.cdg.conexao.Conexao;

import java.util.ArrayList;

public class Veiculo {
    public String nome;
    public String cor;
    public int velocidadePorSegundo;
    public ArrayList<Componente> componentes = new ArrayList<Componente>();

    public Veiculo(String nome, String cor, int velocidadePorSegundo) {
        this.nome = nome;
        this.cor = cor;
        this.velocidadePorSegundo = velocidadePorSegundo;

    }

    public void upgrade(Componente componente){
        this.componentes.add(componente);

        if(componente instanceof Motor){
            this.velocidadePorSegundo += ((Motor) componente).aumentoVelocidadePorSegundo;
        }

    }

    public boolean corridaOnePlayer(int velocidadeParaGanhar, int duracaoCorrida){
        return velocidadeParaGanhar <= this.velocidadePorSegundo*duracaoCorrida;
    }

    public static String corridaTwoPlayer(Veiculo v1, Veiculo v2, Conexao c){

        ArrayList<Veiculo> v = new ArrayList<>();
        v.add(v1);
        v.add(v2);
        if(c.verificaConexaoServidor(v))
            return (v1.velocidadePorSegundo != v2.velocidadePorSegundo) ? (v1.velocidadePorSegundo > v2.velocidadePorSegundo) ? "v1" : "v2" : "Empate";
        else
            return "Competidores Off-line";
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidadePorSegundo=" + velocidadePorSegundo +
                ", componentes=" + componentes +
                '}';
    }
}
