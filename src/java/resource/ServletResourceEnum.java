package resource;

public enum ServletResourceEnum {
    HELLOWORLD("/HelloWorld"),
    ERRORHANDLER("/ErrorHandler");

    private String urlPattern;

    private ServletResourceEnum(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

}
