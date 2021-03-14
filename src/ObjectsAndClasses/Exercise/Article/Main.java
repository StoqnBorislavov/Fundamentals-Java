package ObjectsAndClasses.Exercise.Article;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] input = sc.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }
        String sortingCommand = sc.nextLine();

        switch (sortingCommand) {
            case "title":
                listSortByTitle(articles);
                listPrint(articles);
                break;
            case "content":
                listSortByContent(articles);
                listPrint(articles);
                break;
            case "author":
                listSortByAuthor(articles);
                listPrint(articles);
                break;
        }

    }

    private static void listPrint(List<Article> articles) {
        for (Article article : articles) {
            System.out.println(article);

        }
    }

    private static void listSortByAuthor(List<Article> articles) {
        articles.sort(Comparator.comparing(e -> e.getAuthor()));
    }

    private static void listSortByContent(List<Article> articles) {
        articles.sort(Comparator.comparing(e -> e.getContent()));
    }

    private static void listSortByTitle(List<Article> articles) {
        articles.sort(Comparator.comparing(e -> e.getTitle()));
    }
}
