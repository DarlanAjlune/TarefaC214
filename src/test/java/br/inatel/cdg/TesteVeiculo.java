package br.inatel.cdg;

import br.inatel.cdg.componente.Motor;
import br.inatel.cdg.veiculo.Veiculo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteVeiculo {

    public Veiculo v1;

    @Before
    public void setUp(){
        v1 = new Veiculo("Opala" ,"Preto", 35);
    }

    @Test
    public void testeUpdateVeiculo(){
        Assert.assertEquals(35, this.v1.velocidadePorSegundo);
        Motor padrao = new Motor(15);
        v1.upgrade(padrao);
        Assert.assertEquals(50, this.v1.velocidadePorSegundo);
    }

    @Test
    public void testeCorridaOnePlayerGanha(){
        Assert.assertTrue(this.v1.corridaOnePlayer(60, 2));
    }

    @Test
    public void testeCorridaOnePlayerPerde(){
        Assert.assertFalse(this.v1.corridaOnePlayer(75, 2));
    }

}
