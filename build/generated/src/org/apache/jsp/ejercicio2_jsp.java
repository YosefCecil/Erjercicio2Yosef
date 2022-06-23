package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Alumnos.alumnos;

public final class ejercicio2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    alumnos informacion[] = new alumnos[10];

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    informacion[0] = new alumnos("57211000117", "Yosef", "Flores Martinez", 8, 9, 10);
    informacion[1] = new alumnos("57211000135", "Roberto Leonel", "Salgado De La Sancha", 8, 8, 9);
    informacion[2] = new alumnos("57211000112", "Amado", "Perez Cochine", 9, 10, 10);
    informacion[3] = new alumnos("57211000123", "Yonathan Uriel", "Pastrana Tepectzin", 10, 10, 9);
    informacion[4] = new alumnos("57211000118", "Daniel", "Chino Bello", 8, 8, 9);
    informacion[5] = new alumnos("57211000145", "Luis Gustavo", "Tacuba Bonifacio", 9, 8, 9);
    informacion[6] = new alumnos("57211000160", "Victor Manuel", "Bautista Nievez", 9, 8, 8);
    informacion[7] = new alumnos("57211000139", "Susano Eduardo", "Moras Gatica", 9, 10, 8);
    informacion[8] = new alumnos("57211000110", "Veronica", "Marin Jorge", 9, 8, 9);
    informacion[9] = new alumnos("57211000109", "Kevin Ulises", "Garcia Camacho", 9, 9, 9);

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tabla De Calificaciones Alumnos UT</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <nav class=\"navbar navbar-dark bg-dark\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Unidad Academica De la Region Norte de Guerrero</a>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <table class=\"table table-striped\" id=\"tabla\">\n");
      out.write("                <tbody>\n");
      out.write("                <table class=\"table table-hover table-dark\">\n");
      out.write("                    <thead>\n");
      out.write("                        \n");
      out.write("                            <th scope=\"col\">Matricula</th>\n");
      out.write("                            <th scope=\"col\">Nombre</th>\n");
      out.write("                            <th scope=\"col\">DDI</th>\n");
      out.write("                            <th scope=\"col\">DWI</th>\n");
      out.write("                            <th scope=\"col\">ECBD</th>\n");
      out.write("                            <th scope=\"col\">PROMEDIO</th>\n");
      out.write("                       \n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            for (int i = 0; i < informacion.length; i++) {
                                out.println(""
                                        + "<tbody>"
                                        + "<tr>"
                                        + "<td class= 'text-center'>" + informacion[i].getMatricula() + "</td>"
                                        + "<td>" + informacion[i].getNombre() + " " + informacion[i].getApellidos() + "</td>"
                                        + "<td class= 'text-center'>" + informacion[i].getDDI() + "</td>"
                                        + "<td class= 'text-center'>" + informacion[i].getDWI() + "</td>"
                                        + "<td class= 'text-center'>" + informacion[i].getECBD() + "</td>"
                                        + "<td class= 'text-center'>" + informacion[i].Promedio(informacion[i].getDDI(), informacion[i].getDWI(), informacion[i].getECBD()) + "</td>"
                                        + "</tr>"
                                        + "</tbody>"
                                );
                            }
                        
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js\" integrity=\"sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
