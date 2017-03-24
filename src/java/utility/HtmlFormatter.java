package utility;

public class HtmlFormatter {

    public static String getHTMLBegin() {
        return "<html> \n <head> \n </head> \n <body> \n";

    }

    public static String getHTMLEnd() {
        return "</body> \n </html> \n";
    }

    public static String formatText(String text, int size, String color) {
        return String.format("<font size=\"%d\" color=\"%s\"> %s </font> ", size, color, text);
    }
}
