package repository.respoitoryImpl;

import org.example.conexion.ConexionDB;
import org.example.domain.models.Estudiante;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class impl {
    private Connection getConnection() throws SQLException {
        return ConexionDB.ConexionBD.getInstance();
    }
    private Estudiante createProduct(ResultSet resultSet) throws
            SQLException {
        Estudiante estudiante = new Estudiante();
        estudiante.setId(resultSet.getLong("id"));
        estudiante.setNombre(resultSet.getString("nombre"));
        return estudiante;
}
    public List<Estudiante> list() {
        List<Estudiante> estudianteList = new ArrayList<>();
        try (Statement statement = getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * from estudiante")) {
            while (resultSet.next()) {
                Estudiante estudiante = createProduct(resultSet);
                estudianteList.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudianteList;
    }
}

