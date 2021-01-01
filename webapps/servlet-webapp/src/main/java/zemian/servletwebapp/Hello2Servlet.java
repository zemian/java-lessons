package zemian.servletwebapp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * A traditional Servlet without annotation. This must be mapped in web.xml.
 * NOTE You can not mix annotation mapping with web.xml. If you do, the latter will win and annotation is ignored.
 */
public class Hello2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("Hello2");
    }
}
