package resource;

public enum ViewEnum {
    START("/view/StartView.jsp"),
    RESULT("/WEB-INF/result/ResultView.jsp"),
    ERROR("/WEB-INF/error/errorView.jsp"),
    EXCEPTION("/WEB-INF/error/exceptionView.jsp"),
    FORM_GO_HOME("/WEB-INF/includes/Home.jsp");
    
    
    private String view;

    private ViewEnum(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }
    
    
}
