package repository.respoitoryImpl;

import org.example.conexion.ConexionDB;
import org.example.domain.Docentes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RespositoryImpl {
    private Connection getConnection() throws SQLException {
        return ConexionDB.ConexionBD.getInstance();
    }
    private Docentes createDocente(ResultSet resultSet) throws
            SQLException {
        org.example.domain.Docentes docentes = new org.example.domain.Docentes();
        docentes.setId(resultSet.getLong("id"));
        docentes.setNombre(resultSet.getString("nombre"));
        docentes.setCorreo(resultSet.getString("correo"));

        return docentes;
}
    public List<Docentes> list() {
        List<Docentes> docentesList = new ArrayList<>();
        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * from docentes")) {
            while (resultSet.next()) {
                Docentes docentes = createDocente(resultSet);
                docentesList.add(docentes);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return docentesList;
    }
}

