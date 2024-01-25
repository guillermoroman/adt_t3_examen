package Apellido1_Apellido2_Nombre.setup;


import Apellido1_Apellido2_Nombre.dao.TaskDao;
import Apellido1_Apellido2_Nombre.dao.TaskDaoImpl;
import Apellido1_Apellido2_Nombre.databaseConnection.DatabaseConnection;
import Apellido1_Apellido2_Nombre.model.Task;

import java.sql.*;

public class TableCreator {

    public static void createTables(){
        String sqlVehicles = """
            CREATE TABLE tasks (
            id INTEGER NOT NULL AUTO_INCREMENT,
            title CHAR(20),
            text TEXT,
            completed BOOLEAN,
            PRIMARY KEY (id))
            """;

        try (Connection c = DatabaseConnection.getConnection();
             Statement stmt = c.createStatement()) {

            stmt.execute(sqlVehicles);
            System.out.println("Tabla 'tasks' creada");

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void seedTables(){

        TaskDao tdi = new TaskDaoImpl();
        Task task1 = new Task("Task 1", "Descripción de la tarea 1", true);
        Task task2 = new Task("Task 2", "Descripción de la tarea 2", false);
        Task task3 = new Task("Task 3", "Descripción de la tarea 3", false);

        try {
            tdi.add(task1);
            tdi.add(task2);
            tdi.add(task3);

        } catch (SQLException e){
            System.err.println("Error al poblar la tabla");
            e.printStackTrace();
        }
    }
}
