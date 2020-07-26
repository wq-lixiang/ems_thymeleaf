package world.lixiang.dao;

import world.lixiang.entity.Emp;

import java.util.List;

public interface EmpDao {

    List<Emp> findAll();

    void save(Emp emp);

    void deleteEmp(String id);

    Emp findById(String id);

    void updateEmp(Emp emp);

}
