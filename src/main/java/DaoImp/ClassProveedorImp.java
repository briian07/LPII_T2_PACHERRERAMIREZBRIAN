package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProveedor;

import model.TblProveedorcl2;

public class ClassProveedorImp implements IProveedor {

	@Override
	public void RegistrarProveedor(TblProveedorcl2 tblProveedorcl2) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_PACHERRERAMIREZBRIAN");
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(tblProveedorcl2);
		//emitimos mensaje por pantalla....
		System.out.println("Proveedor registrado en BD correctamente!!!!!!!!");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion...
		em.close();
		
	}

	@Override
	public void ActualizarProveedor(TblProveedorcl2 tblProveedorcl2) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_PACHERRERAMIREZBRIAN");
		EntityManager em = emf.createEntityManager();

		// Iniciamos la transacción
		em.getTransaction().begin();

		// Actualizamos
		em.merge(tblProveedorcl2);

		// Emitimos mensaje por consola
		System.out.println("Datos actualizados correctamente");

		// Confirmamos
		em.getTransaction().commit();

		// Cerramos
		em.close();
	}

	@Override
	public void EliminarProveedor(TblProveedorcl2 tblProveedorcl2) {
		// TODO Auto-generated method stub
		 // Establecemos conexión con la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_PACHERRERAMIREZBRIAN");
        EntityManager em = emf.createEntityManager();

        // Iniciamos la transacción
        em.getTransaction().begin();

        // Recuperamos el proveedor para eliminar
        TblProveedorcl2 proveedor = em.find(TblProveedorcl2.class, tblProveedorcl2.getIdproveedorcl2());
        if (proveedor != null) {
            em.remove(proveedor);
            System.out.println("Proveedor eliminado correctamente");
        } else {
            System.out.println("El proveedor no existe en la base de datos");
        }

        // Confirmamos
        em.getTransaction().commit();

        // Cerramos
        em.close();
	}

	@Override
	public List<TblProveedorcl2> ListarProveedorcl2() {
		// TODO Auto-generated method stub
		//establecemos conexion con la unidad de persistencia...
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("LPII_CL2_PACHERRERAMIREZBRIAN");
		//gestionamos las entidades...
		EntityManager em=emf.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//recuperamos el listado de la base de datos..
		List<TblProveedorcl2> listadoproveedorcl2=em.createQuery("select p from TblProveedorcl2 p",TblProveedorcl2.class).getResultList();
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos el listado...
		return listadoproveedorcl2;
	}

	@Override
	public TblProveedorcl2 BuscarProveedor(TblProveedorcl2 tblProveedorcl2) {
        // Establecemos conexión con la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII_CL2_PACHERRERAMIREZBRIAN");
        EntityManager em = emf.createEntityManager();

        // Iniciamos la transacción
        em.getTransaction().begin();

        // Recuperamos el proveedor a buscar
        TblProveedorcl2 proveedor = em.find(TblProveedorcl2.class, tblProveedorcl2.getIdproveedorcl2());

        // Confirmamos la transacción
        em.getTransaction().commit();

        // Cerramos la transacción
        em.close();

        // Retornamos el proveedor encontrado
        return proveedor;
	}


	

}
