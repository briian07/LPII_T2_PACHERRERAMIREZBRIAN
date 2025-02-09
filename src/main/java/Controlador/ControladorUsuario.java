package Controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DaoImp.ClassUsuariolmp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// Instanciar las clases necesarias
		ClassUsuariolmp crudImp = new ClassUsuariolmp();
		TblUsuariocl2 tblUsuario = new TblUsuariocl2();

		// Recuperar el listado de usuarios
		List<TblUsuariocl2> listadoUsuarios = crudImp.ListarUsuarios();
		request.setAttribute("listadoUsuarios", listadoUsuarios);

		// Obtener la acción desde el parámetro
		String accion = request.getParameter("accion");

		if (accion != null) {
			switch (accion) {
				case "Modificar":
					// Obtener el código del usuario
					int cod = Integer.parseInt(request.getParameter("cod"));
					tblUsuario.setIdusuariocl2(cod);
					// Buscar el usuario para modificar
					TblUsuariocl2 usuario = crudImp.BuscarUsuario(tblUsuario);

					// Enviar los valores del usuario a la vista
					request.setAttribute("codigo", usuario.getIdusuariocl2());
					request.setAttribute("usuario", usuario.getUsuariocl2());
					request.setAttribute("password", usuario.getPasswordcl2());

					// Redirigir a la vista de actualización
					request.getRequestDispatcher("/RegistroUsuario.jsp").forward(request, response);
					break;

				case "Registrar":
					// Redirigir a la vista de registro
					request.getRequestDispatcher("/RegistroUsuario.jsp").forward(request, response);
					break;

				case "Eliminar":
					// Obtener el código del usuario
					int codelim = Integer.parseInt(request.getParameter("cod"));
					tblUsuario.setIdusuariocl2(codelim);
					// Eliminar el usuario
					crudImp.EliminarUsuario(tblUsuario);

					// Actualizar el listado de usuarios
					List<TblUsuariocl2> listado = crudImp.ListarUsuarios();
					request.setAttribute("listadoUsuarios", listado);

					// Redirigir al menú principal
					request.getRequestDispatcher("/MenuPrincipalUsuario.jsp").forward(request, response);
					break;

				case "Listar":
					// Redirigir al menú principal
					request.getRequestDispatcher("/MenuPrincipalUsuario.jsp").forward(request, response);
					break;
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
	}

}
