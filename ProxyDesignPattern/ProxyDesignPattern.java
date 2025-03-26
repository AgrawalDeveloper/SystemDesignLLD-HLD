package ProxyDesignPattern;

public class ProxyDesignPattern {
    public static void main(String str[])  {

        EmployeeDaoProxy employeeDaoProxy=new EmployeeDaoProxy();
        try {
            employeeDaoProxy.create("USER",new EmployeeDaoImpl());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            employeeDaoProxy.create("ADMIN",new EmployeeDaoImpl());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            employeeDaoProxy.delete("ADMIN",1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            employeeDaoProxy.get("USER",1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
