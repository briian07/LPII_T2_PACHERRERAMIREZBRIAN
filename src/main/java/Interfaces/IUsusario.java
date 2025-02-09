package Interfaces;
import java.util.List;

import model.TblUsuariocl2;
public interface IUsusario {
    // Método para registrar un nuevo usuario
    void RegistrarUsuario(TblUsuariocl2 tblUsuariocl2);
    // Método para actualizar los datos de un usuario existente
    void ActualizarUsuario(TblUsuariocl2 tblUsuariocl2);
    // Método para eliminar un usuario
    void EliminarUsuario(TblUsuariocl2 tblUsuariocl2);
    // Método para listar todos los usuarios
    List<TblUsuariocl2> ListarUsuarios();
    // Método para buscar un usuario específico por su ID
    TblUsuariocl2 BuscarUsuario(TblUsuariocl2 tblUsuariocl2);
		
}
