public class Main {
    public static void main(String[] args) {
        Equipe equipe1 = new Equipe("Cruzeiro", 3, 1);
        Equipe equipe2 = new Equipe("Santos FC", 4, 0);
        Equipe equipe3 = new Equipe("Flamengo", 1, 3);

        System.out.println("A equipe " + equipe1.getNomeEquipe() + " obteve a pontuação " + equipe1.calculaPontuacao());
        System.out.println("A equipe " + equipe2.getNomeEquipe() + " obteve a pontuação " + equipe2.calculaPontuacao());
        System.out.println("A equipe " + equipe3.getNomeEquipe() + " obteve a pontuação " + equipe3.calculaPontuacao());

    }
}
