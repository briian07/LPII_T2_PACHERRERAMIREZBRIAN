package Controlador;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ClassProveedorImp;
import model.TblProveedorcl2;

/**
 * Servlet implementation class ControladorProveedor
 */
public class ControladorProveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProveedor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Instanciar las clases necesarias
	    // Instanciar las clases necesarias
	    ClassProveedorImp crudImp = new ClassProveedorImp();
	    TblProveedorcl2 tblProveedor = new TblProveedorcl2();
	    // Recuperar el listado de proveedores
	    List<TblProveedorcl2> listadoProveedores = crudImp.ListarProveedorcl2();
	    request.setAttribute("listadoProveedores", listadoProveedores);

	    // Obtener la acción desde el parámetro
	    String accion = request.getParameter("accion");

	    if (accion != null) {
	        switch (accion) {
	            case "Modificar":
                    // Obtener el código del proveedor
                    int cod = Integer.parseInt(request.getParameter("cod"));
                    tblProveedor.setIdproveedorcl2(cod);
                    // Buscar el proveedor para modificar
                    TblProveedorcl2 proveedor = crudImp.BuscarProveedor(tblProveedor);

                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    // Enviar los valores del proveedor a la vista
                    request.setAttribute("codigo", proveedor.getIdproveedorcl2());
                    request.setAttribute("nombre", proveedor.getNomproveedorcl2());
                    request.setAttribute("razon_social", proveedor.getRsocialproveedorcl2());
                    request.setAttribute("ruc", proveedor.getRucproveedorcl2());
                    request.setAttribute("email", proveedor.getEmailproveedorcl2());
                    request.setAttribute("fecha", format.format(proveedor.getFeingproveedorcl2()));

                    // Redirigir a la vista de actualización
                    request.getRequestDispatcher("/RegistroProvedor.jsp").forward(request, response);
                    break;

	            case "Registrar":
                    // Redirigir a la vista de registro
                    request.getRequestDispatcher("/RegistroProvedor.jsp").forward(request, response);
                    break;

	            case "Eliminar":
                    // Obtener el código del proveedor
                    int codelim = Integer.parseInt(request.getParameter("cod"));
                    tblProveedor.setIdproveedorcl2(codelim);
                    // Eliminar el proveedor
                    crudImp.EliminarProveedor(tblProveedor);

                    // Actualizar el listado de proveedores
                    List<TblProveedorcl2> listado = crudImp.ListarProveedorcl2();
                    request.setAttribute("listadoProveedores", listado);

                    // Redirigir al menú principal
                    request.getRequestDispatcher("/RegistroProvedor.jsp").forward(request, response);
                    break;
	            case "Listar":
                    // Redirigir al menú principal
                    request.getRequestDispatcher("/RegistroProvedor.jsp").forward(request, response);
                    break;
            }
        }
    } // Fin del método doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
        // Recuperar datos del formulario
        String codigo = request.getParameter("codigo");
        String nombre = request.getParameter("nombre");
        String razonSocial = request.getParameter("razon_social");
        String ruc = request.getParameter("ruc");
        String email = request.getParameter("email");
        String fechaIngreso = request.getParameter("fecha_ingreso");

        // Instanciar las clases necesarias
        TblProveedorcl2 tblProveedor = new TblProveedorcl2();
        ClassProveedorImp crudImp = new ClassProveedorImp();

        // Asignar los valores
        tblProveedor.setNomproveedorcl2(nombre);
        tblProveedor.setRsocialproveedorcl2(razonSocial);
        tblProveedor.setRucproveedorcl2(ruc);
        tblProveedor.setEmailproveedorcl2(email);
        tblProveedor.setFeingproveedorcl2(java.sql.Date.valueOf(fechaIngreso));

        // Verificar si es un registro o una actualización
        if (codigo != null && !codigo.isEmpty()) {
            int cod = Integer.parseInt(codigo);
            tblProveedor.setIdproveedorcl2(cod);
            // Actualizar el proveedor
            crudImp.ActualizarProveedor(tblProveedor);
        } else {
            // Registrar un nuevo proveedor
            crudImp.RegistrarProveedor(tblProveedor);
        }

        // Actualizar el listado de proveedores
        List<TblProveedorcl2> listado = crudImp.ListarProveedorcl2();
        request.setAttribute("listadoProveedores", listado);

        // Redirigir al menú principal
        request.getRequestDispatcher("/RegistroProvedor.jsp").forward(request, response);
	}

}
