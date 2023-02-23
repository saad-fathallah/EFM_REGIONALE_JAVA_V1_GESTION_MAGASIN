import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Magasin {

    // arryliste pour ajoute les articles du magasin
    ArrayList<Article> listeArticle = new ArrayList<>();

    // la methode ajouter() permettant d'ajouiter un article
    public void ajouter(Article a) throws Exception {
        if(listeArticle.contains(a)){
            throw new Exception(("this article already exists"));
        }else{
            listeArticle.add(a);
        }
    }

    // la methode idiceDe() permettant de retourner l'indice de l'article
    public int idiceDe(int code){
        int indice = -1;
        for (int i=0 ;i <listeArticle.size(); i++){
            if(listeArticle.get(i).getCode() == code){
                indice = i;
            }
        }
        return indice;
    }

    // la methode supprimer() permettant de supprimer l'article a partire son nom
    public boolean supprimer(int code){
        boolean isSupprimer = false;
        for (Article i : listeArticle){
            if(i.getCode() == code){
                listeArticle.remove(i) ;
                isSupprimer = true;
                break;
            }
        }
        return isSupprimer;
    }

    // la methode supprimer() permettant de supprimer l'article a partire le nom de l'objet de l'article
    public boolean supprimer(Article A){
        if(listeArticle.contains(A)){
            listeArticle.remove(A) ;
            return true;
        }else{
            return false;
        }
    }

    // la methode nobreArticleEnSolde() permettant de retourner le nombre des article de type ArticleEnSolde
    public int nobreArticleEnSolde(){
        int nobreArticleEnSolde = 0;
        for (Article i : listeArticle){
            if(i.getClass() == ArticleEnSolde.class){
                nobreArticleEnSolde ++ ;
            }
        }
        return nobreArticleEnSolde;
    }

    // la methode enregistrer() permettant de souvegarder les article dans le fichier chemin
    public void enregistrer(String chemin) throws IOException {
        File myfile = new File(chemin);
        FileWriter fileWriter = new FileWriter(myfile);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(listeArticle);
        printWriter.close();
    }

    // la methode supprimerFichier() permettant de ssupprimer le fichier chemin
    public void supprimerFichier(String chemin) throws IOException {
        File myfile = new File(chemin);
        myfile.delete();
    }

}
