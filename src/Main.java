public class Main {
    public static void main(String[] args) throws Exception {
        Article a1 = new Article(1,7000);
        Article a2 = new Article(2,5000);

        ArticleEnSolde as1 = new ArticleEnSolde(4,5000,30);
        ArticleEnSolde as2 = new ArticleEnSolde(3,8600,35);

        Magasin m = new Magasin();

        m.ajouter(a1);
        m.ajouter(a2);
        m.ajouter(as1);
        m.ajouter(as2);

        m.ajouter(as1);
    }
}