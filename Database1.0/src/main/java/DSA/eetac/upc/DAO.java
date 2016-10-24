package DSA.eetac.upc;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Jonatan on 10/10/2016.
 */
public abstract class DAO {

    public String getUpper(String m){
        String result = Character.toUpperCase(m.charAt(0))+m.substring(1);
        return "get".concat(result);
    }

    public void insert (){

        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO ").append(this.getClass().getSimpleName());
        System.out.println(sb.toString());

        Field [] fields = this.getClass().getFields();

        sb.append(" (");
        int i=0;
        for(Field f:fields){
            System.out.println(f.getName());
            sb.append(f.getName());
            i++;
            if (i!=fields.length)
                sb.append(",");
        }

        sb.append(") VALUES (");
        i=0;
        for(Field f:fields){
            i++;
            sb.append("?");
            if (i!=fields.length)
                sb.append(",");
        }
        System.out.println();
        for(Field f:fields){
            try {
                Method m = this.getClass().getMethod(getUpper(f.getName()), null);
                String res = (String)m.invoke(this, null).toString();
                System.out.println("SetObject("+ f.getName()+": "+res +")");
            }catch (NoSuchMethodException e) {
                e.printStackTrace();
            }catch (InvocationTargetException e){
                e.printStackTrace();
            }catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        sb.append(")");

        System.out.println("QUERY: "+ sb.toString());
    }
    public void select(int pk){
        StringBuffer sb = new StringBuffer();
        sb.append("QUERY: SELECT * FROM ").append(this.getClass().getSimpleName()).append(" WHERE ID = ").append(pk);
        System.out.println(sb.toString());
    }
    public void update (){

    }
    public void delete (){

    }
}
