import org.junit.Test;

import static org.junit.Assert.*;


public class JokenpoTest {

    Jokenpo rodada = new Jokenpo();

    private String resultado;

    @Test
    public void PedraPedra() {

        resultado = rodada.joga("pedra", "pedra");

        assertEquals(resultado, "empate");

    }


    @Test
    public void PedraTesoura() {

        resultado = rodada.joga("pedra", "tesoura");

        assertEquals(resultado, "pedra");

    }

    @Test
    public void TesouraTesoura() {

        resultado = rodada.joga("tesoura", "tesoura");

        assertEquals(resultado, "empate");

    }

    @Test
    public void TesouraPapel() {

        resultado = rodada.joga("tesoura", "papel");

        assertEquals(resultado, "tesoura");

    }

    @Test
    public void PapelPapel() {

        resultado = rodada.joga("papel", "papel");

        assertEquals(resultado, "empate");

    }

    @Test
    public void PapelPedra() {

        resultado = rodada.joga("papel", "pedra");

        assertEquals(resultado, "papel");

    }

}