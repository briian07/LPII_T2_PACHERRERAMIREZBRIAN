package TestEntidades;
import java.util.List;
import DaoImp.ClassUsuariolmp;
import model.TblUsuariocl2;

public class TestEntidadesUsuario {
	  public static void main(String[] args) {
	        // Instanciar las clases necesarias
	        TblUsuariocl2 tblUsuario = new TblUsuariocl2();
	        ClassUsuariolmp crudImp = new ClassUsuariolmp();

	        // *** TESTEAR MÉTODO REGISTRAR ***
	      
//	        tblUsuario.setUsuariocl2("usuario_prueba");
//	        tblUsuario.setPasswordcl2("123456");
//	        crudImp.RegistrarUsuario(tblUsuario);
//	        

	        // *** TESTEAR MÉTODO ACTUALIZAR ***
	        
//	        tblUsuario.setIdusuariocl2(2); 
//	        tblUsuario.setUsuariocl2("usuario_examen");
//	        tblUsuario.setPasswordcl2("nueva_password");
//	        crudImp.ActualizarUsuario(tblUsuario);
//	        

	        // *** TESTEAR MÉTODO BUSCAR ***
	       
//	        tblUsuario.setIdusuariocl2(4); 
//	        TblUsuariocl2 usuarioEncontrado = crudImp.BuscarUsuario(tblUsuario);
//	        System.out.println("Código: " + usuarioEncontrado.getIdusuariocl2()
//	                + ", Usuario: " + usuarioEncontrado.getUsuariocl2()
//	                + ", Password: " + usuarioEncontrado.getPasswordcl2());
//	       

	        // *** TESTEAR MÉTODO LISTAR ***
	       
//	        List<TblUsuariocl2> listadoUsuarios = crudImp.ListarUsuarios();
//
//	        for (TblUsuariocl2 usuario : listadoUsuarios) {
//	            System.out.println("Código: " + usuario.getIdusuariocl2()
//	                    + ", Usuario: " + usuario.getUsuariocl2()
//	                    + ", Password: " + usuario.getPasswordcl2());
//	        }
//	        
	        // *** TESTEAR MÉTODO ELIMINAR ***
	        
//	        tblUsuario.setIdusuariocl2(1); 
//	        crudImp.EliminarUsuario(tblUsuario);
//	        System.out.println("Usuario eliminado correctamente.");
//	        
	  }
}
