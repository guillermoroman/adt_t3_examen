package Apellido1_Apellido2_Nombre.dao;

import Apellido1_Apellido2_Nombre.model.Task;

import java.sql.SQLException;
import java.util.List;

public interface TaskDao {

    int add(Task task) throws SQLException;
    Task getById (int id) throws SQLException;
    List<Task> getAll() throws SQLException;
    void delete(int id) throws SQLException;
}
