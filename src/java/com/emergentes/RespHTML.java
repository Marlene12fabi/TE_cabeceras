@WebServlet(name = "RespHTML", urlPatterns = {"/RespHTML"})
public class RespHTML extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResresponse)
            throws ServletException, IOException {
        response.setContetType("text/HTML");
        PrintWrite out=response.getWriter();
        try{
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Respuesta HTML</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>HTML generado desde un Servlet </h1>");
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
       
        }
    }
}
