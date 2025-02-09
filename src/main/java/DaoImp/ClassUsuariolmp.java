package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsusario;
import model.TblUsuariocl2;

public class ClassUsuariolmp implements IUsusario {

	@Override
	public void RegistrarUsuario(TblUsuariocl2 tblUsuariocl2) {
		// TODO Auto-generated method stub
        // Establecemos conexión con la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_PACHERRERAMIREZBRIAN");
        EntityManager em = emf.createEntityManager();

        // Iniciamos la transacción
        em.getTransaction().begin();

        // Registramos el usuario
        em.persist(tblUsuariocl2);

        // Mensaje de confirmación
        System.out.println("Usuario registrado correctamente en la base de datos");

        // Confirmamos
        em.getTransaction().commit();

        // Cerramos la transacción
        em.close();
	}

	@Override
	public void ActualizarUsuario(TblUsuariocl2 tblUsuariocl2) {
		// TODO Auto-generated method stub
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_PACHERRERAMIREZBRIAN");
        EntityManager em = emf.createEntityManager();

        // Iniciamos la transacción
        em.getTransaction().begin();

        // Actualizamos los datos del usuario
        em.merge(tblUsuariocl2);

        // Mensaje de confirmación
        System.out.println("Datos del usuario actualizados correctamente");

        // Confirmamos
        em.getTransaction().commit();

        // Cerramos la transacción
        em.close();
	}

	@Override
	public void EliminarUsuario(TblUsuariocl2 tblUsuariocl2) {
		// TODO Auto-generated method stub
        // Establecemos conexión con la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_PACHERRERAMIREZBRIAN");
        EntityManager em = emf.createEntityManager();

        // Iniciamos la transacción
        em.getTransaction().begin();

        // Recuperamos el usuario para eliminar
        TblUsuariocl2 usuario = em.find(TblUsuariocl2.class, tblUsuariocl2.getIdusuariocl2());
        if (usuario != null) {
            em.remove(usuario);
            System.out.println("Usuario eliminado correctamente de la base de datos");
        } else {
            System.out.println("El usuario no existe en la base de datos");
        }

        // Confirmamos
        em.getTransaction().commit();

        // Cerramos la transacción
        em.close();
	}

	@Override
	public List<TblUsuariocl2> ListarUsuarios() {
		// TODO Auto-generated method stub
		  // Establecemos conexión con la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_PACHERRERAMIREZBRIAN");
        EntityManager em = emf.createEntityManager();

        // Iniciamos la transacción
        em.getTransaction().begin();

        // Recuperamos el listado de usuarios
        List<TblUsuariocl2> listadoUsuarios = em.createQuery("SELECT u FROM TblUsuariocl2 u", TblUsuariocl2.class).getResultList();

        // Confirmamos
        em.getTransaction().commit();

        // Cerramos la transacción
        em.close();

        // Retornamos el listado
        return listadoUsuarios;
	}

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblUsuariocl2) {
		// TODO Auto-generated method stub
		  // Establecemos conexión con la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_PACHERRERAMIREZBRIAN");
        EntityManager em = emf.createEntityManager();

        // Iniciamos la transacción
        em.getTransaction().begin();

        // Recuperamos el usuario a buscar
        TblUsuariocl2 usuario = em.find(TblUsuariocl2.class, tblUsuariocl2.getIdusuariocl2());

        // Confirmamos
        em.getTransaction().commit();

        // Cerramos la transacción
        em.close();

        // Retornamos el usuario encontrado
        return usuario;
	}

}
