package kr.ac.jejunu.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Slf4j
public class HelloServlet extends GenericServlet {

    @Override
    public void destroy(){
        log.info("********************* servlet destroy **********************");
    }

    @Override
    public void init(){
        log.info("********************* servlet init *************************");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        log.info("********************* servlet service **********************");
        res.getWriter().println("<h1>Hello, World!</h1>");

    }
}
