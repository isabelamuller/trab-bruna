public class Equipe {
    private String nomeEquipe;
    private int vitoria;
    private int empate;

    public Equipe(String nomeEquipe, int vitoria, int empate) {
        this.nomeEquipe = nomeEquipe;
        this.vitoria = vitoria;
        this.empate = empate;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public int getVitoria() {
        return vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public int calculaPontuacao() {
        return (3 * vitoria) + (1 * empate);
    }
}
