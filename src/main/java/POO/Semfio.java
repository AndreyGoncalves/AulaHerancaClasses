package POO;

public class Semfio extends Telefone{
    private float frequencia, distancia;
    private int canais;
    public Semfio(int codigo, String numSerie, String modelo, float peso, Dimensao dim, int canal, float freq, float dist) {
        super(codigo, numSerie, modelo, peso, dim);
        this.frequencia = freq;
        this.distancia = dist;
        this.canais = canal;
    }

    @Override
    public String toString() {
        return "Semfio{" +
                "frequencia=" + frequencia +
                ", distancia=" + distancia +
                ", canais=" + canais +
                '}';
    }

}
