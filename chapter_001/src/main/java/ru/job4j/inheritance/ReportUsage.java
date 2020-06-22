package ru.job4j.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
        HtmlReport htmlReport = new HtmlReport();
        String htmlText = htmlReport.generate("Report's name", "Report's body");
        System.out.println(htmlText);
        JsonReport jsonReport = new JsonReport();
        String jsonText = jsonReport.generate("Report's", "Report's");
        System.out.println(jsonText);
    }
}
