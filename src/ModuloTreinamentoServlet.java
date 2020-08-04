

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.rdevs.model.Modulo;
import br.com.redevs.dao.ConnectorMySqlDAO;
import br.com.redevs.dao.ModuloDAO;
import br.com.redevs.services.ModuloService;

/**
 * Servlet implementation class ModuloServlet
 */
@WebServlet("/modulos")
public class ModuloTreinamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModuloService moduloService = new ModuloService();
		List<Modulo> listaModulo = moduloService.listar();
		request.setAttribute("modulos", listaModulo);
		RequestDispatcher rd = request.getRequestDispatcher("/consultar-modulos.jsp");
		rd.forward(request, response);
	}
}
