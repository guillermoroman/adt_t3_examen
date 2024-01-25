package Apellido1_Apellido2_Nombre.dao;

import Apellido1_Apellido2_Nombre.databaseConnection.DatabaseConnection;
import Apellido1_Apellido2_Nombre.model.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskDaoImpl implements TaskDao{


    @Override
    public int add(Task task) throws SQLException {
        int result =0;

    }

    @Override
    public Task getById(int id) throws SQLException {
        //código
    }

    @Override
    public List<Task> getAll() throws SQLException {
        //código
    }

    @Override
    public void delete(int id) throws SQLException {
        //código
    }
}
