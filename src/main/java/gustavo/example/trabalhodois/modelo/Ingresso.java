package gustavo.example.trabalhodois.modelo;


public class Ingresso {
    private String nomeFilm;
    private String horario;
    private double preco;

    public String getNomeFilm() {
        return nomeFilm;
    }

    public String getHorario() {
        return horario;
    }

    public double getPreco() {
        return preco;
    }

    public void setNomeFilm(String nomeFilm) {
        this.nomeFilm = nomeFilm;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
