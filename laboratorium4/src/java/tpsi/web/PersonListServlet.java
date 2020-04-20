
package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PersonListServlet", urlPatterns = {"/personList"})
public class PersonListServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         List<Person> person = new ArrayList<>();
         person.add(new Person("Adam", "Kowalski", "ak@zut.pl"));
         person.add(new Person("Kuba", "Okroj", "ko@zut.pl"));
         person.add(new Person("Maciek", "Szwarc", "ms@zut.pl"));
         person.add(new Person("Bartek", "Guderski", "bg@zut.pl"));
         person.add(new Person("Piotrek", "Stobba", "ps@zut.pl"));
         request.setAttribute("person", person);
         request.getRequestDispatcher("personList.jsp").forward(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
