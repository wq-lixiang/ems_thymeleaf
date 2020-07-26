package world.lixiang.service;

import world.lixiang.entity.Emp;

import java.util.List;

public interface EmpService {

    List<Emp> findAll();

    void save(Emp emp);

    void deleteEmp(String id);

    Emp findById(String id);

    void updataEmp(Emp emp);
}
