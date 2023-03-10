import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArticleEnSolde extends Article{

    int remise;

    // constractor
    ArticleEnSolde(int code, double prix,int remise) throws Exception {
        super(code, prix);
        if(remise>=0 && remise<=90){
            this.remise = remise;
        }else{
            throw new Exception("la remise est invalide");
        }
    }


    // getter and setter
    public int getRemise() {
        return remise;
    }

    public void setRemise(int remise) throws Exception {
        if(remise>=0 && remise<=90){
            this.remise = remise;
        }else{
            throw new Exception("la remise est invalide");
        }
    }

    // redefinition de la methode prixArticle
    @Override
    public double prixArticle() {
        return (getPrix()*remise)/100;
    }

    // methode toString
    @Override
    public String toString() {
        return super.toString() + "; remise = " + remise ;
    }
}
