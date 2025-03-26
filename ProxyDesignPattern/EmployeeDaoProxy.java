package ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao {
    private EmployeeDao employeeDaoImpl ;

    EmployeeDaoProxy()
    {
        this.employeeDaoImpl=new EmployeeDaoImpl();
    }
    @Override
    public void create(String user, EmployeeDao obj) throws Exception{
        if(user.equals("ADMIN"))
        {
            employeeDaoImpl.create(user,obj);
            return;
        }


        throw new Exception("User not allowed to create employee");
    }

    @Override
    public void delete(String user, int EmployeeId) throws Exception{
        if(user.equals("ADMIN"))
        {
            employeeDaoImpl.delete(user,EmployeeId);
            return;
        }

        throw new Exception("User not allowed to delete employee");
    }

    @Override
    public void get(String user, int EmployeeId) throws Exception{
        if(user.equals("ADMIN") || user.equals("USER"))
        {
            employeeDaoImpl.get(user,EmployeeId);
            return;
        }
        throw new Exception("User not allowed to get employee");
    }
}
