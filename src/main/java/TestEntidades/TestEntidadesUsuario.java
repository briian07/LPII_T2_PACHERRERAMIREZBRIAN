package TestEntidades;
import java.util.List;
import DaoImp.ClassUsuariolmp;
import model.TblUsuariocl2;

public class TestEntidadesUsuario {
	  public static void main(String[] args) {
	        // Instanciar las clases necesarias
	        TblUsuariocl2 tblUsuario = new TblUsuariocl2();
	        ClassUsuariolmp crudImp = new ClassUsuariolmp();

	        // *** TESTEAR M�TODO REGISTRAR ***
	      
//	        tblUsuario.setUsuariocl2("usuario_prueba");
//	        tblUsuario.setPasswordcl2("123456");
//	        crudImp.RegistrarUsuario(tblUsuario);
//	        

	        // *** TESTEAR M�TODO ACTUALIZAR ***
	        
//	        tblUsuario.setIdusuariocl2(2); 
//	        tblUsuario.setUsuariocl2("usuario_examen");
//	        tblUsuario.setPasswordcl2("nueva_password");
//	        crudImp.ActualizarUsuario(tblUsuario);
//	        

	        // *** TESTEAR M�TODO BUSCAR ***
	       
//	        tblUsuario.setIdusuariocl2(4); 
//	        TblUsuariocl2 usuarioEncontrado = crudImp.BuscarUsuario(tblUsuario);
//	        System.out.println("C�digo: " + usuarioEncontrado.getIdusuariocl2()
//	                + ", Usuario: " + usuarioEncontrado.getUsuariocl2()
//	                + ", Password: " + usuarioEncontrado.getPasswordcl2());
//	       

	        // *** TESTEAR M�TODO LISTAR ***
	       
//	        List<TblUsuariocl2> listadoUsuarios = crudImp.ListarUsuarios();
//
//	        for (TblUsuariocl2 usuario : listadoUsuarios) {
//	            System.out.println("C�digo: " + usuario.getIdusuariocl2()
//	                    + ", Usuario: " + usuario.getUsuariocl2()
//	                    + ", Password: " + usuario.getPasswordcl2());
//	        }
//	        
	        // *** TESTEAR M�TODO ELIMINAR ***
	        
//	        tblUsuario.setIdusuariocl2(1); 
//	        crudImp.EliminarUsuario(tblUsuario);
//	        System.out.println("Usuario eliminado correctamente.");
//	        
	  }
}
