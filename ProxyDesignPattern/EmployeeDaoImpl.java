package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String user, EmployeeDao obj) {
        System.out.println("Employee created");
    }

    @Override
    public void delete(String user, int EmployeeId) {
        System.out.println("Employee deleted");
    }

    @Override
    public void get(String user, int EmployeeId) {
        System.out.println("Employee fetched");
    }
}
