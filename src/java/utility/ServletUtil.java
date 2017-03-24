/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import resource.ServletResourceEnum;
import resource.ViewResourceEnum;

/**
 *
 * @author Juergen
 */
public class ServletUtil
{

    public static void forward(String uri, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher(uri).forward(request, response);
    }

    public static boolean isEmpty(String value)
    {
        return (value == null || value.isEmpty());
    }

    public static String checkRequestCommando(HttpServletRequest request, String... names)
    {
        for (String name : names)
        {
            String value = request.getParameter(name);
            //Wenn ein Wet (Value) für den Parameter (key) vorhanden ist, dann ist dieser Button (Form-Submit) gedrückt worden
            if (!isEmpty(value))
            {
                return name.toUpperCase();
            }
        }
        return "EMPTY";

    }

    public static void forwardError(HttpServletRequest request, HttpServletResponse response, String msg) throws Exception
    {
        int mode = 1;
        switch (mode)
        {
            case 0:
                String errorUri = ViewResourceEnum.ERROR.getView() + "?message=" + msg;
                forward(errorUri, request, response);
                break;
            case 1:
                String servlet = ServletResourceEnum.ERRORHANDLER.getUrlPattern();
                forward(servlet, request, response);
                break;
            case 2:
                throw new IllegalArgumentException("Illegal Argument");
        }
    }
}
