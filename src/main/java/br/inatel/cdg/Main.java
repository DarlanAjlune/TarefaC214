package br.inatel.cdg;

import br.inatel.cdg.componente.Motor;
import br.inatel.cdg.conexao.Conexao;
import br.inatel.cdg.veiculo.Veiculo;

public class Main {
    public static void main(String[] args) {

        Motor padrao = new Motor(15);
        Conexao c = new Conexao();
        Veiculo v1 = new Veiculo("Camaro", "Preto", 35);

        System.out.println(v1.toString());
        v1.upgrade(padrao);
        System.out.println(v1.toString());

        System.out.println(v1.corridaOnePlayer(141,4));

        Veiculo v2 = new Veiculo("Porshe", "Vermelho", 50);

        System.out.println(Veiculo.corridaTwoPlayer(v1, v2, c));
    }
}
