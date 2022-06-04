package info.thecodinglive.basic;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "initServlet", urlPatterns = {"/init"},
        initParams = {@WebInitParam(name = "siteName", value = "jpub")}
)
public class InitServlet extends HttpServlet{
    private String myParam = "";

    public void init(ServletConfig servletConfig) throws ServletException{
        System.out.println("init call");
        this.myParam = servletConfig.getInitParameter("siteName");
        System.out.println("입력받은 사이트 명은" + myParam + "입니다.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("hello");
    }
}
