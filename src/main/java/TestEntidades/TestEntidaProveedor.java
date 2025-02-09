package TestEntidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import DaoImp.ClassProveedorImp; 
import model.TblProveedorcl2;

public class TestEntidaProveedor {

    public static void main(String[] args) {
        // Instanciar las clases necesarias
        TblProveedorcl2 tblProveedor = new TblProveedorcl2();
        ClassProveedorImp crudImp = new ClassProveedorImp(); 

        // *** TESTEAR M�TODO REGISTRAR ***
//        tblProveedor.setNomproveedorcl2("Distribuidor Lima");
//        tblProveedor.setRucproveedorcl2("20123456789");
//        tblProveedor.setRsocialproveedorcl2("Distribuidor Lima SAC");
//        tblProveedor.setEmailproveedorcl2("contacto@lima.com");
//        tblProveedor.setFeingproveedorcl2(new Date());
//        crudImp.RegistrarProveedor(tblProveedor);

        // *** TESTEAR M�TODO ACTUALIZAR ***
//        tblProveedor.setIdproveedorcl2(3); 
//        tblProveedor.setNomproveedorcl2("Distribuidor trujillo");
//        tblProveedor.setRucproveedorcl2("20678901234");
//        tblProveedor.setRsocialproveedorcl2("Distribuidor trujillo SAC");
//        tblProveedor.setEmailproveedorcl2("contacto@trujillo.com");
//        tblProveedor.setFeingproveedorcl2(new Date());
//        crudImp.ActualizarProveedor(tblProveedor);

        // *** TESTEAR M�TODO BUSCAR ***
//        tblProveedor.setIdproveedorcl2(3); 
//        TblProveedorcl2 proveedorEncontrado = crudImp.BuscarProveedor(tblProveedor);
//        System.out.println("C�digo: " + proveedorEncontrado.getIdproveedorcl2()
//                + ", Nombre: " + proveedorEncontrado.getNomproveedorcl2()
//                + ", RUC: " + proveedorEncontrado.getRucproveedorcl2()
//                + ", Raz�n Social: " + proveedorEncontrado.getRsocialproveedorcl2()
//                + ", Email: " + proveedorEncontrado.getEmailproveedorcl2()
//                + ", Fecha Ingreso: " + proveedorEncontrado.getFeingproveedorcl2());

        
        // *** TESTEAR M�TODO LISTAR ***
//        List<TblProveedorcl2> listadoProveedores = crudImp.ListarProveedorcl2(); 
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//
//        for (TblProveedorcl2 proveedor : listadoProveedores) {
//            System.out.println("C�digo: " + proveedor.getIdproveedorcl2()
//                    + ", Nombre: " + proveedor.getNomproveedorcl2()
//                    + ", RUC: " + proveedor.getRucproveedorcl2()
//                    + ", Raz�n Social: " + proveedor.getRsocialproveedorcl2()
//                    + ", Email: " + proveedor.getEmailproveedorcl2()
//                    + ", Fecha Ingreso: " + format.format(proveedor.getFeingproveedorcl2()));
//        }
//        
//        
    }
    }


