package Interfaces;
import java.util.List;

import model.TblUsuariocl2;
public interface IUsusario {
    // M�todo para registrar un nuevo usuario
    void RegistrarUsuario(TblUsuariocl2 tblUsuariocl2);
    // M�todo para actualizar los datos de un usuario existente
    void ActualizarUsuario(TblUsuariocl2 tblUsuariocl2);
    // M�todo para eliminar un usuario
    void EliminarUsuario(TblUsuariocl2 tblUsuariocl2);
    // M�todo para listar todos los usuarios
    List<TblUsuariocl2> ListarUsuarios();
    // M�todo para buscar un usuario espec�fico por su ID
    TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblUsuariocl2);
		
}
