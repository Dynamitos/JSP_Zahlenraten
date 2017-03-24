package resource;

public enum ViewResourceEnum {
    START("/view/helloWorldStartView.jsp"),
    RESULT("/WEB-INF/result/helloWorldView.jsp"),
    ERROR("/WEB-INF/error/errorView.jsp"),
    EXCEPTION("/WEB-INF/error/exceptionView.jsp"),
    FORM_GO_HOME("/WEB-INF/includes/formGoHome.jsp");
    
    
    private String view;

    private ViewResourceEnum(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }
    
    
}
