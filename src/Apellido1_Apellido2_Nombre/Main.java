package Apellido1_Apellido2_Nombre;

import Apellido1_Apellido2_Nombre.dao.TaskDao;
import Apellido1_Apellido2_Nombre.dao.TaskDaoImpl;
import Apellido1_Apellido2_Nombre.databaseConnection.DatabaseConnection;
import Apellido1_Apellido2_Nombre.model.Task;
import Apellido1_Apellido2_Nombre.setup.TableCreator;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //DatabaseConnection.createNewDatabase("adt_t3_examen");
        //TableCreator.createTables();
        //TableCreator.seedTables();

        printAllTasks();
        //executeTransaction();

        //eraseTask(2);

        printTask(1);

    }

    public static void executeTransaction(){


        //Acciones a realizar dentro de la transacción:

        //Borrar la tarea con id=2
        //Crear una nueva tarea con el titulo "Tarea nueva",
        //el texto "Nueva descripción" y completed=true;



    }

    public static void printAllTasks() {
        System.out.println("Lista de tareas");
        System.out.println("===============");
        try{
            //código
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void eraseTask(int task_id){
        try {
            //código
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void printTask(int task_id){
        try {
            //código
            System.out.println("==================");
            System.out.println(task);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
