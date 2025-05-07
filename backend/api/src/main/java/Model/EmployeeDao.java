package Model;

import java.util.ArrayList;

public class EmployeeDao implements Dao{

    private final String SQL_FINDALL = "SELECT * FROM EMPLOYEES WHERE 1=1";
    private IMotorSql motorSql;

    @Override
    public int add(Object bean) {
        return 0;
    }

    @Override
    public int delete(Integer e) {
        return 0;
    }

    @Override
    public int update(Object bean) {
        return 0;
    }

    @Override
    public ArrayList findAll(Object bean) {
        return null;
    }
}
