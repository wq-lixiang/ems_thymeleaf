package world.lixiang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import world.lixiang.dao.EmpDao;
import world.lixiang.entity.Emp;
import world.lixiang.service.EmpService;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
public class EmpServiceImpl implements EmpService {

    @Resource
    EmpDao empDao;

    @Override
    public List<Emp> findAll() {
        return empDao.findAll();
    }

    @Override
    public void save(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
         empDao.save(emp);
    }

    @Override
    public void deleteEmp(String id) {
        empDao.deleteEmp(id);
    }

    @Override
    public Emp findById(String id) {
        return  empDao.findById(id);
    }

    @Override
    public void updataEmp(Emp emp) {
        empDao.updateEmp(emp);
    }


}
