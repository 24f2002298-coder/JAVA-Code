import java.lang.reflect.*;
import java.util.*;

class ClassStats{
    public static int getPubContCount(String cname){
        try{
            Class c = Class.forName(cname);
            Constructor[] constructors = c.getConstructors(); 
            return constructors.length;
        }
        catch(Exception e){
            return -1;
        }
    }

    public static int getAllContCount(String cname){
        try{
            Class c = Class.forName(cname);
            Constructor[] constructors = c.getDeclaredConstructors(); 
            return constructors.length;
        }
        catch(Exception e){
            return -1;
        }
    }

    public static int getPubMethodCount(String cname){
        try{
            Class c = Class.forName(cname);
            Method[] methods = c.getMethods();
            return methods.length;
        }
        catch(Exception e){
            return -1;
        }
    }
    public static int getAllMethodCount(String cname){
        try{
            Class c = Class.forName(cname);
            Method[] methods = c.getDeclaredMethods();
            return methods.length;
        }
        catch(Exception e){
            return -1;
        }
    }

    public static int getPubFieldCount(String cname){
        try{
            Class c = Class.forName(cname);
            Field[] fields = c.getFields(); 
            return fields.length;
        }
        catch(Exception e){
            return -1;
        }
    }

    public static int getAllFieldCount(String cname){
        try{
            Class c = Class.forName(cname);
            Field[] fields = c.getDeclaredFields(); 
            return fields.length;
        }
        catch(Exception e){
            return -1;
        }
    }
}
class getAllFieldCounts{
    public static void main(String[] args) {
        String cname;
        Scanner sc = new Scanner(System.in);
        cname = sc.nextLine();
        System.out.println("Constructor: " + 
                        ClassStats.getPubContCount(cname) + ", " + 
                        ClassStats.getAllContCount(cname));
        System.out.println("Fields: " + 
                        ClassStats.getPubFieldCount(cname) + ", " +
                        ClassStats.getAllFieldCount(cname));
        System.out.println("Methods: " + 
                        ClassStats.getPubMethodCount(cname) + ", " +
                        ClassStats.getAllMethodCount(cname));
    }
}