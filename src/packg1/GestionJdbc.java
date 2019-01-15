package packg1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import testLecko.Jdbc;

public class GestionJdbc extends HttpServlet {
    public static final String MESSAGES = "messages";
    public static final String VUE = "/Community.jsp";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        Jdbc test = new Jdbc();
        List<String> messages = test.executerTests( request );

        request.setAttribute( MESSAGES, messages );

        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
}
