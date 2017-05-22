/**
 * Created by aludmila on 5/19/17.
 */
public class Jokenpo {


    public String joga(String jogador1, String jogador2) {

        String resultado = "";

        if (jogador1.equals(jogador2)){
            resultado = "empate";
        }
        if (jogador1.equals("pedra") && jogador2.equals("tesoura")){
            resultado = "pedra";
        }
        if (jogador1.equals("tesoura") && jogador2.equals("papel")){
            resultado = "tesoura";
        }
        if (jogador1.equals("papel") && jogador2.equals("pedra")){
            resultado = "papel";
        }
        return resultado;
    }
}
