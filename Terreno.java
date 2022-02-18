package calcTerreno;

public class Terreno {

    private float comprimento;
    private float largura;

    public void setComprimento(float c) {
        comprimento = c;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setLargura(float l) {
        largura = l;
    }

    public float getLargura() {
        return largura;
    }

    public float calculaQtdeArame() {
        return 2 * comprimento + 2 * largura;
    }
}
