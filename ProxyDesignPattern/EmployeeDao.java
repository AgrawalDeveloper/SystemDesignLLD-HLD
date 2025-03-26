package ProxyDesignPattern;

public interface EmployeeDao {

    public void create(String user,EmployeeDao obj) throws Exception;
    public void delete(String user,int EmployeeId) throws Exception;
    public void get(String user,int EmployeeId) throws Exception;
}
