package Model;

import java.util.ArrayList;

public class JobDao implements Dao{

    private final String SQL_FINDALL = "SELECT * FROM JOBS WHERE 1=1";
    private IMotorSql motorSql;

    @Override
    public int add(Object bean) {
        return 0;
    }

    @Override
    public int delete(Object bean) {
        return 0;
    }

    @Override
    public int update(Object bean) {
        return 0;
    }

    @Override
    public ArrayList findAll(Object bean, IMotorSql motorSql) {
        return null;
    }
}
