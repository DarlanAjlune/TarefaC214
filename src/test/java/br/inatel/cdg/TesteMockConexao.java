package br.inatel.cdg;

import br.inatel.cdg.conexao.Conexao;
import br.inatel.cdg.veiculo.Veiculo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class TesteMockConexao {

    @Mock
    public Conexao c = new Conexao();

    public Veiculo v1 = new Veiculo("Opala", "Preto", 20);
    public Veiculo v2 = new Veiculo("Opala", "Rosa", 20);

    @Test
    public void testeConexaoVeiculos(){
        ArrayList<Veiculo> v = new ArrayList<>();

        Veiculo.corridaTwoPlayer(v1, v2, c);

        v.add(v1);
        v.add(v2);
        Mockito.verify(c).verificaConexaoServidor(v);
    }
}
