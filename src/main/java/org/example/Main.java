package org.example;

import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad";
        String user = "root";
        String password = "";
        try (Connection conn = DriverManager.getConnection(url, user,
                password);
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM docentes");
        ) {
            System.out.println("docentes: ");
            while (resultSet.next()) {

                System.out.print("id: "+resultSet.getInt("id"));
                System.out.print("\n");
                System.out.print(resultSet.getString("nombre"));
                System.out.print("\n");
                System.out.print(resultSet.getString("correo"));
                System.out.print("\n");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}