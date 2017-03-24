package resource;

public enum ServletEnum {
    GUESS("/Guess"),
    ERRORHANDLER("/ErrorHandler");

    private String urlPattern;

    private ServletEnum(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

}
