package errorhandler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import resource.ViewResourceEnum;
import utility.ServletUtil;

@WebServlet(name = "ErrorHandlerServlet", urlPatterns = {"/ErrorHandler"})
public class ErrorHandlerServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        // Analyze the servlet exception
        Throwable throwable = (Throwable) request.getAttribute
                                    ("javax.servlet.error.exception");
        Integer statusCode = (Integer) request.getAttribute 
                                        ("javax.servlet.error.status_code");

        String errorMsg = (String) request.getAttribute
                                        ("javax.servlet.error.message");

        String requestUri = (String) request.getAttribute
                                        ("javax.servlet.error.request_uri");
        if (requestUri == null) {
            requestUri = "Unknown";
        }
       
        String paramUriPath = ViewResourceEnum.ERROR.getView() + 
                "?message="+errorMsg;  
        
        if (throwable == null && statusCode == null) {
            paramUriPath = ViewResourceEnum.ERROR.getView() + 
                "?message="+errorMsg;             
         // error handling
        } else if (throwable != null && statusCode != null)
        {
            paramUriPath = ViewResourceEnum.EXCEPTION.getView() + 
                "?message="+errorMsg+";status="+statusCode;             
        } else if (statusCode != null) {
            paramUriPath = ViewResourceEnum.ERROR.getView() + 
                "?message="+errorMsg+";status="+statusCode;        
        } else {
            paramUriPath = ViewResourceEnum.EXCEPTION.getView() + 
                "?message="+errorMsg+";status="+statusCode;        
        }
        
        ServletUtil.forward(paramUriPath, request, response);        
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}