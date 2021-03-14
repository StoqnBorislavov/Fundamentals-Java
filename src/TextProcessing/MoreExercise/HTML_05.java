package TextProcessing.MoreExercise;

import java.util.*;

public class HTML_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> htmlMap = new LinkedHashMap<>();
        htmlMap.put("<h1>", new ArrayList<>());
        htmlMap.put("<article>", new ArrayList<>());
        htmlMap.put("<div>", new ArrayList<>());
        String title = sc.nextLine();
        htmlMap.get("<h1>").add(title);
        String article = sc.nextLine();
        htmlMap.get("<article>").add(article);
        String content = sc.nextLine();
        while (!content.equals("end of comments")) {
            htmlMap.get("<div>").add(content);
            content = sc.nextLine();
        }
        System.out.println("<h1>");
        System.out.println(htmlMap.get("<h1>").get(0));
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.println(htmlMap.get("<article>").get(0));
        System.out.println("</article>");
        htmlMap.get("<div>").stream()
                .forEach(e -> {
                    System.out.println("<div>");
                    System.out.println(e);
                    System.out.println("</div>");
                });
    }
}
