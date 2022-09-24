package servicios;


import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DaoPerson {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    private final String GET_PERSONS = "SELECT * FROM CURP WHERE curp=?";
    private final String INSERT_PERSON = "INSERT INTO CURP (nombre, primer_Apellido,segundo_Apellido,sexo,estado_nacimiento,fecha_Nacimiento,curp)" +
            "VALUES (?, ?, ?, ?, ?, ?, ?)";


    public BeanPerson findPerson (String curp){
        try{
            conn = new MySQLConnection().connect();
            String query = GET_PERSONS;
            pstm = conn.prepareStatement(query);
            pstm.setString(1, curp);
            rs = pstm.executeQuery();
            while (rs.next()){
                BeanPerson person = new BeanPerson();
                person.setNombre(rs.getString("nombre"));
                person.setPrimer_Apellido(rs.getString("primer_Apellido"));
                person.setSegundo_Apellido(rs.getString("segundo_Apellido"));
                person.setSexo(rs.getString("sexo"));
                person.setEstado_Nacimiento(rs.getString("estado_nacimiento"));
                person.setFecha_Nacimiento(rs.getString("fecha_Nacimiento"));
                person.setCurp(rs.getString("curp"));
                return person;
            }
        }catch (SQLException e){
            Logger.getLogger(DaoPerson.class.getName())
                    .log(Level.SEVERE, "Error en findPerson -> ", e);
        }finally {
            closeConnections();
        }
        return null;
    }



    public boolean savePerson(BeanPerson person){
        try {
            conn = new MySQLConnection().connect();
            String query = INSERT_PERSON;
            pstm = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, person.getNombre());
            pstm.setString(2, person.getPrimer_Apellido());
            pstm.setString(3, person.getSegundo_Apellido());
            pstm.setString(4, person.getSexo());
            pstm.setString(5, person.getEstado_Nacimiento());
            pstm.setString(6, person.getFecha_Nacimiento());
            pstm.setString(7, person.getCurp());

            return pstm.executeUpdate()==1;

        }catch (SQLException e){
            Logger.getLogger(DaoPerson.class.getName())
                    .log(Level.SEVERE, "Error savePerson -> ", e);
            return false;
        } finally {
            closeConnections();
        }
    }

    public void closeConnections(){
        try{
            if (conn!= null){
                conn.close();
            }
            if (pstm!= null){
                pstm.close();
            }
            if (rs!= null){
                rs.close();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }



}
