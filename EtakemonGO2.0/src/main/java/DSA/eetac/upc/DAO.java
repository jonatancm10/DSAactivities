package DSA.eetac.upc;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.Properties;
/**
 * Created by Jonatan on 10/10/2016.
 */
public abstract class DAO {

    public static Connection getConnection() {
        Connection con=null;
        try
        {
            String host = "localhost";
            int port = 3306;
            String database = "dao";
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
            Properties info = new Properties();
            info.setProperty("user", "root");
            info.setProperty("password", "root");
            info.setProperty("useSSL", "false");
            info.setProperty("serverTimezone", "UTC");
            con = DriverManager.getConnection(url, info);
            System.out.println("Connexion created.\n");
        }
        catch (Exception e)
        {e.printStackTrace();}

        return con;
    }
    public String getValors (Field f) {
        String res=null;
        try {
            Method m = this.getClass().getMethod(getUpper(f.getName()), null);
            res = m.invoke(this, null).toString();
        }
        catch (NoSuchMethodException e1) {
            e1.printStackTrace();
        }
        catch (IllegalAccessException e1) {
            e1.printStackTrace();
        }
        catch (InvocationTargetException e1) {
            e1.printStackTrace();
        }
        return res;
    }
    public void insertarElementos (PreparedStatement preparedStatement) throws NoSuchMethodException, SQLException, InvocationTargetException, IllegalAccessException {
        int i = 1;
        Field[] fields = this.getClass().getFields();

        for (Field f : fields) {
            String res = getValors(f);
            preparedStatement.setObject(i, res);
            i++;
        }
    }
    public String getUpper(String m) {
        String result = Character.toUpperCase(m.charAt(0)) + m.substring(1);
        return "get".concat(result);
    }

    public void insert() {

        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO ").append(this.getClass().getSimpleName());
        System.out.println(sb.toString());

        Field[] fields = this.getClass().getFields();

        sb.append(" (");
        int i = 0;
        for (Field f : fields) {
            System.out.println(f.getName());
            sb.append(f.getName());
            i++;
            if (i != fields.length)
                sb.append(",");
        }

        sb.append(") VALUES (");
        i = 0;
        for (Field f : fields) {
            i++;
            sb.append("?");
            if (i != fields.length)
                sb.append(",");
        }
        System.out.println();
        for (Field f : fields) {
            try {
                Method m = this.getClass().getMethod(getUpper(f.getName()), null);
                String res = (String) m.invoke(this, null).toString();
                System.out.println("SetObject(" + f.getName() + ": " + res + ")");
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        sb.append(")");

        System.out.println("QUERY: " + sb.toString());

    }

    public void select(int pk) {
        StringBuffer sb = new StringBuffer();
        sb.append("QUERY: SELECT * FROM ").append(this.getClass().getSimpleName()).append(" WHERE ID = ").append(pk);
        System.out.println(sb.toString());
    }

    public void update() {
        StringBuffer sb = new StringBuffer();
        sb.append("QUERY: UPDATE * FROM ").append(this.getClass().getSimpleName());
        //sb.append("QUERY: UPDATE * FROM ").append(this.getClass().getSimpleName()).append(" WHERE ID = ").append();
        System.out.println(sb.toString());
    }

    public void delete() {

    }
}
