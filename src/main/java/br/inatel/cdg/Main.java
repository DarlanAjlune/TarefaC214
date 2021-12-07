package br.inatel.cdg;

import br.inatel.cdg.componente.Motor;
import br.inatel.cdg.componente.Nitro;
import br.inatel.cdg.componente.Turbo;
import br.inatel.cdg.conexao.Conexao;
import br.inatel.cdg.veiculo.Veiculo;

public class Main {
    public static void main(String[] args) {

        Conexao c = new Conexao();
        Motor motor1 = new Motor(15);
        Turbo turbo1 = new Turbo(50);
        Nitro nitro1 = new Nitro(15);
        Nitro nitro2 = new Nitro(35);

        Veiculo v1 = new Veiculo("Camaro", "Preto", 35);

        System.out.println("Mostrando veiculo sem upgrade:" + v1.toString());
        v1.upgrade(motor1);
        v1.upgrade(turbo1);
        System.out.println("Veiculo depois do upgrade: "+ v1.toString());

        System.out.println("Verificando se o veiculo consegue ganhar a corrida(SIM/TRUE e NAO/FALSE): " + v1.corridaOnePlayer(141,4));

        Veiculo v2 = new Veiculo("Porshe", "Vermelho", 50);
        System.out.println("Mostrando veiculo sem upgrade:" + v2.toString());
        v2.upgrade(nitro1);
        v2.upgrade(nitro2);
        System.out.println("Veiculo depois do upgrade: "+ v2.toString());
        System.out.println("Verificando qual veiculo vence: " + Veiculo.corridaTwoPlayer(v1, v2, c));
    }
}
