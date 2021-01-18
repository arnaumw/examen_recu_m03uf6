/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf6;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import examenuf6.Alumnos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Calendar;
import java.util.GregorianCalendar;



/**
 *
 * Int, nom: varchar, descripcio: varchar, data: Date, system: boolean
 * 
 * damm03uf6final
 * 
 * Retorna true si es crea l'event correctament
 * boolean create(Event event) throws Exception;
 * 
 * List<Event> readAll() throws Exception;
 * 
 * Retorna true si s'actualitza l'event correctament
 * boolean update(Event event) throws Exception;
 * 
 * Retorna true si s'elimina l'event correctament
 * boolean delete(Event event) throws Exception
 * 
 * 
 */
public class ExamenUf6 implements EventDao {
//public class ExamenUf6 {

    static ExamenUf6 a = new ExamenUf6();
    
    static ArrayList<Alumnos> ListaAlumnos = new ArrayList();
    static Alumnos a1;
    
    
    public static void main(String[] args) throws Exception {
        
        Connection c1 = ConexionBD();
        
//        a1 = new Alumnos(3, "Maluma", "es demasiado simpatico", new java.sql.Date(2000 - 07 - 17), true);
//        Boolean create = a.create(a1);

        //Boolean create = a.create("pep", "es profe");

//        a1 = new Alumnos(3, "Maluma", "es demasiado simpatico", new java.sql.Date(2000 - 07 - 17), false);
//        Boolean update = a.update(a1);

          //Alumnos find = a.find(2);
          
//        a1 = new Alumnos(3, "Maluma", "es demasiado simpatico", new java.sql.Date(2000 - 07 - 17), false);
//        Boolean delete = a.delete(a1);

          //Boolean delete = a.delete(3);

//        ListaAlumnos = a.readAll();
//        for (Iterator it = ListaAlumnos.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//        }

//          ListaAlumnos = a.readAllSystemEvents();
//          
//            for (Iterator it = ListaAlumnos.iterator(); it.hasNext();) {
//                System.out.println(it.next());
//            }
        
    }
    
    private static Connection ConexionBD() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3307/damm03uf6final";
        String username = "root";
        String password = "";

        Connection con = DriverManager.getConnection(url, username, password);

        if (con != null) {
            System.out.println("Conexión correctamente realizada!");
        } else {
            System.out.println("Conexión fallida...");
        }

        return con;
    }
    
//    private static void rellenaLista(Connection c1) throws Exception {
//        
//        Statement statement = c1.createStatement();
//        String consulta = "select * FROM alumnos";
//
//        ResultSet r1 = statement.executeQuery(consulta);
//
//        //return r1;
//        
//        while (r1.next()) {
//
//            int idAlumno = r1.getInt("idAlumno");
//            String nombreAlumno = r1.getString("nombreAlumno");
//            String descripAlumno = r1.getString("descripAlumno");
//            Date nacimientoAlumno = r1.getDate("nacimientoAlumno");
//            boolean matriculaAlumno = r1.getBoolean("matriculaAlumno");        
//
//            a1 = new Alumnos(idAlumno, nombreAlumno, descripAlumno, nacimientoAlumno, matriculaAlumno);
//            ListaAlumnos.add(a1);
//        }
//    }
//
//    private static void readAll(ArrayList<Alumnos> ListaAlumnos) {
//        
//        for (int i = 0; i < ListaAlumnos.size(); i++) {
//            
//            System.out.println(ListaAlumnos.get(i));
//            
//        }
//    }
//    
//    private static boolean Create(Alumnos alum1, Connection c1) throws Exception {
//        
//        
//        String consulta = "INSERT INTO alumnos(idAlumno, nombreAlumno, descripAlumno, nacimientoAlumno, matriculaAlumno) "
//                + "VALUES (" + alum1.getIdAlumno() + ", " + "'" + alum1.getNombreAlumno() + "', '" + alum1.getDescripAlumno() + "', '" + alum1.getNacimientoAlumno() + "', " + alum1.isMatriculaAlumno() + ");";
//        
//        System.out.println(consulta);
//        
//        Statement statement = c1.createStatement();
//        
//        int result = statement.executeUpdate(consulta);
//        System.out.println("Numero de lineas afectadas: " + result);
//        
//        if(result > 0){
//            return true;
//        } else {
//            return false;
//        }
//        
//    }
//    
//    private static boolean Update(Alumnos alum1, Connection c1) throws Exception {
//        
//        String consulta = "UPDATE alumnos SET idAlumno=" + alum1.getIdAlumno() + ", nombreAlumno= '" + alum1.getNombreAlumno() + "', descripAlumno='"  
//                + alum1.getDescripAlumno() + "', nacimientoAlumno='" + alum1.getNacimientoAlumno() + "', matriculaAlumno=" + alum1.isMatriculaAlumno() + " WHERE idAlumno=" + alum1.getIdAlumno() + ";";
//        
//        System.out.println(consulta);
//        
//        Statement statement = c1.createStatement();
//        
//        int result = statement.executeUpdate(consulta);
//        System.out.println("Numero de lineas afectadas: " + result);
//        
//        if(result > 0){
//            return true;
//        } else {
//            return false;
//        }
//        
//    }
//   
//    private static boolean Delete(Alumnos alum1, Connection c1) throws Exception {
//        
//        String consulta = "DELETE FROM alumnos WHERE idAlumno=" + alum1.getIdAlumno() + ";";
//        
//        Statement statement = c1.createStatement();
//        
//        int result = statement.executeUpdate(consulta);
//        System.out.println("Numero de lineas afectadas: " + result);
//        
//        if(result > 0){
//            return true;
//        } else {
//            return false;
//        }
//        
//    }

    @Override
    public boolean create(Alumnos alum1) throws Exception {
        
        Connection c1 = ConexionBD();
        
        
        String consulta = "INSERT INTO alumnos(idAlumno, nombreAlumno, descripAlumno, nacimientoAlumno, matriculaAlumno) "
                + "VALUES (" + alum1.getIdAlumno() + ", " + "'" + alum1.getNombreAlumno() + "', '" + alum1.getDescripAlumno() + "', '" + alum1.getNacimientoAlumno() + "', " + alum1.isMatriculaAlumno() + ");";
        
        //System.out.println(consulta);
        
        Statement statement = c1.createStatement();
        
        int result = statement.executeUpdate(consulta);
        System.out.println("Numero de lineas afectadas: " + result);
        
        if(result > 0){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean create(String nom, String descripcio) throws Exception {
        Connection c1 = ConexionBD();
        
       Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR); 
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        //System.out.println(año + "-" + mes + "-" + dia);
        
        ListaAlumnos = a.readAll();
        int id = (ListaAlumnos.size() + 1);
            
        
        String consulta = "INSERT INTO alumnos(idAlumno, nombreAlumno, descripAlumno, nacimientoAlumno, matriculaAlumno) "
                + "VALUES (" + id + ", " + "'" + nom + "', '" + descripcio + "', '" + año + "-" + mes + "-" + dia + "', false);";
        
        //System.out.println(consulta);
        
        Statement statement = c1.createStatement();
        
        int result = statement.executeUpdate(consulta);
        System.out.println("Numero de lineas afectadas: " + result);
        
        if(result > 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ArrayList<Alumnos> readAll() throws Exception {
        
        Connection c1 = ConexionBD();
        
        Statement statement = c1.createStatement();
        String consulta = "select * FROM alumnos";

        ResultSet r1 = statement.executeQuery(consulta);

        //return r1;
        
        while (r1.next()) {

            int idAlumno = r1.getInt("idAlumno");
            String nombreAlumno = r1.getString("nombreAlumno");
            String descripAlumno = r1.getString("descripAlumno");
            Date nacimientoAlumno = r1.getDate("nacimientoAlumno");
            boolean matriculaAlumno = r1.getBoolean("matriculaAlumno");        

            a1 = new Alumnos(idAlumno, nombreAlumno, descripAlumno, nacimientoAlumno, matriculaAlumno);
            ListaAlumnos.add(a1);
        }
        return ListaAlumnos;
    }

    @Override
    public boolean update(Alumnos alum1) throws Exception {
        Connection c1 = ConexionBD();
        
        String consulta = "UPDATE alumnos SET idAlumno=" + alum1.getIdAlumno() + ", nombreAlumno= '" + alum1.getNombreAlumno() + "', descripAlumno='"  
                + alum1.getDescripAlumno() + "', nacimientoAlumno='" + alum1.getNacimientoAlumno() + "', matriculaAlumno=" + alum1.isMatriculaAlumno() + " WHERE idAlumno=" + alum1.getIdAlumno() + ";";
        
        System.out.println(consulta);
        
        Statement statement = c1.createStatement();
        
        int result = statement.executeUpdate(consulta);
        System.out.println("Numero de lineas afectadas: " + result);
        
        if(result > 0){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public Alumnos find(int id) throws Exception {
        
        Connection c1 = ConexionBD();
        
        Statement statement = c1.createStatement();
        String consulta = "select * FROM alumnos WHERE idAlumno = " + id;

        ResultSet r1 = statement.executeQuery(consulta);

        
        while (r1.next()) {

            int idAlumno = r1.getInt("idAlumno");
            String nombreAlumno = r1.getString("nombreAlumno");
            String descripAlumno = r1.getString("descripAlumno");
            Date nacimientoAlumno = r1.getDate("nacimientoAlumno");
            boolean matriculaAlumno = r1.getBoolean("matriculaAlumno");        

            a1 = new Alumnos(idAlumno, nombreAlumno, descripAlumno, nacimientoAlumno, matriculaAlumno);
            ListaAlumnos.add(a1);
        }
        
        for (int i = 0; i < ListaAlumnos.size(); i++) {
            
            //System.out.println(ListaAlumnos.get(i));
            if(ListaAlumnos.get(i).getIdAlumno() == id){
                System.out.println(ListaAlumnos.get(i));
            }
            
        }
        return null;
    }

    @Override
    public boolean delete(Alumnos alum1) throws Exception {
        
        Connection c1 = ConexionBD();
        
        String consulta = "DELETE FROM alumnos WHERE idAlumno=" + alum1.getIdAlumno() + ";";
        
        Statement statement = c1.createStatement();
        
        int result = statement.executeUpdate(consulta);
        System.out.println("Numero de lineas afectadas: " + result);
        
        if(result > 0){
            return true;
        } else {
            return false;
        }
        
    }

  

    @Override
    public boolean delete(int id) throws Exception {
        
        Connection c1 = ConexionBD();
        
        String consulta = "DELETE FROM alumnos WHERE idAlumno=" + id + ";";
        
        Statement statement = c1.createStatement();
        
        int result = statement.executeUpdate(consulta);
        System.out.println("Numero de lineas afectadas: " + result);
        
        if(result > 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ArrayList<Alumnos> readAllSystemEvents() throws Exception {
        Connection c1 = ConexionBD();
        
        Statement statement = c1.createStatement();
        String consulta = "select * FROM alumnos WHERE matriculaAlumno = true";

        ResultSet r1 = statement.executeQuery(consulta);

        //return r1;
        
        while (r1.next()) {

            int idAlumno = r1.getInt("idAlumno");
            String nombreAlumno = r1.getString("nombreAlumno");
            String descripAlumno = r1.getString("descripAlumno");
            Date nacimientoAlumno = r1.getDate("nacimientoAlumno");
            boolean matriculaAlumno = r1.getBoolean("matriculaAlumno");        

            a1 = new Alumnos(idAlumno, nombreAlumno, descripAlumno, nacimientoAlumno, matriculaAlumno);
            ListaAlumnos.add(a1);
        }
        return ListaAlumnos;
    }
}


