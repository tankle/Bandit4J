import java.util.ArrayList;
import java.util.List;

/**
 * Created by IDEA
 * User: hztancong
 * Date: 2017/9/29
 * Time: 15:59
 */
public class Main {
    public static void main(String[] args) {
        BanditAlgorithm alg = new LinUCB(0.1);

        List<Article> articleList = new ArrayList<>();
        Article article;

        article = new Article("1 1:1.4 2:2 3:1.4 4:1.1 5:1");
        articleList.add(article);
        article = new Article("2 1:12 2:0.8 3:1.4 4:0 5:0.1");
        articleList.add(article);
        article = new Article("3 1:0 2:1 3:1.4 4:9 5:0.6");
        articleList.add(article);
        article = new Article("4 1:1 2:2 3:1.4 4:3 5:0.451");
        articleList.add(article);


        Article a = alg.chooseArm(null, articleList);
        System.out.println(a);
        alg.updateReward(null, article, 10);
        a = alg.chooseArm(null, articleList);
        System.out.println(a);
    }
}
