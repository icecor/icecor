import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class finalbug {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://tw.op.gg/champion/statistics").get();
            System.out.println(doc.title());
            System.out.println("上路T1角:");

            for (int a = 1; a <= 5; a++) {
                String top = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-TOP > tr:nth-child(" + a + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a > div.champion-index-table__name").text();
                System.out.println("排名" + a + ":" + top);
            }
            System.out.println("打野T1角");
            for (int b = 1; b <= 5; b++) {
                String jg = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-JUNGLE > tr:nth-child(" + b + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a > div.champion-index-table__name").text();
                System.out.println("排名" + b + ":" + jg);
            }
            System.out.println("中路T1角");
            for (int c = 1; c <= 5; c++) {
                String mid = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-MID > tr:nth-child(" + c + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a > div.champion-index-table__name").text();
                System.out.println("排名 " + c + ":" + mid);
            }
            System.out.println("下路T1角");
            for (int d = 1; d <= 2; d++) {
                String ad = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-ADC > tr:nth-child(" + d + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a > div.champion-index-table__name").text();
                System.out.println("排名" + d + ":" + ad);
            }
            System.out.println("輔助T1角");
            for (int e = 1; e <= 4; e++) {
                String sup = doc.select("body > div.l-wrap.l-wrap--champion > div.l-container > div.l-champion-index > div.l-champion-index-content > div.l-champion-index-content--side > div > div.champion-index-trend-content > div > div.tabItem.champion-trend.champion-trend-tier > div > table > tbody.tabItem.champion-trend-tier-SUPPORT > tr:nth-child(" + e + ") > td.champion-index-table__cell.champion-index-table__cell--champion > a > div.champion-index-table__name").text();
                System.out.println("排名" + e + ":" + sup);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}