package demo2;

import java.util.ArrayList;

public class News {
    private String title;
    private String content;

    News(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        News news1 = new News("新闻一: 从金山WPS窥探国内软件的付费意愿");
        News news2 = new News("新闻二: Java干货技术分享：SpringBoot多模块开发");
        News news3 = new News("新闻三: 晚点独家 | 阿里菜鸟收网快递体系：从永久免费到每单收取1分钱");

        ArrayList<News> newsArrayList = new ArrayList<News>();
        newsArrayList.add(news1);
        newsArrayList.add(news2);
        newsArrayList.add(news3);

        for (News news : newsArrayList) {
            System.out.println(getString(news.toString()));
        }
    }

    private static String getString(String str) {
        if (str.length() > 31) {
            return str.substring(0, 31) + "......]";
        } else {
            return str;
        }
    }

    @Override
    public String toString() {
        return "News[" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ']';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
