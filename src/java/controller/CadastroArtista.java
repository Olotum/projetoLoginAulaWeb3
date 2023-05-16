package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import model.Artista;
import model.ArtistaDAO;

@WebServlet(name = "CadastroArtista", urlPatterns = {"/CadastroArtista"})
public class CadastroArtista extends HttpServlet {

    private String artista;
    private int genero;
    private String nacionalidade;
    private int solo;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //Recebendo os valores do formulario de cadastro
        this.artista = request.getParameter("artista");
        this.genero = Integer.parseInt(request.getParameter("genero"));
        this.nacionalidade = request.getParameter("nacionalidade");
        if (request.getParameter("solo") != null) {
            this.solo = 1;
        } else {
            this.solo = 0;
        }

        //criando objeto da classe artista para salvar no BD
        Artista artista = new Artista(
                this.artista,
                this.genero,
                this.nacionalidade,
                this.solo
        );
        //Instanciar a classe DAO para usar o método de inserção enviado o objeto criado acima
        try {
            ArtistaDAO adao = new ArtistaDAO();
            adao.insertArtista(artista);
            response.sendRedirect("lista.jsp");

        } catch (ClassNotFoundException | SQLException erro) {

            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet CadastroArtista</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Ocorreu algum erro " + erro + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        }
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
