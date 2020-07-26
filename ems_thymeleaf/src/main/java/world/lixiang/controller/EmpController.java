package world.lixiang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import world.lixiang.entity.Emp;
import world.lixiang.service.EmpService;

import javax.jws.WebParam;

@Controller
@RequestMapping("emp")
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/findAll")
    public String findAll(Model model){
        model.addAttribute("emps",empService.findAll());
        return "/ems/emplist";
    }

    @PostMapping("save")
    public String save(Emp emp){
        empService.save(emp);
        return "redirect:/emp/findAll";
    }

    @GetMapping("/delete")
    public String deleteEmp(String id){
        empService.deleteEmp(id);
        return "redirect:/emp/findAll";
    }

    @GetMapping("/find")
    public String findById(String id , Model model){
        Emp emp =  empService.findById(id);
        model.addAttribute("emp",emp);
        return "/ems/updateEmp";
    }

    @PostMapping("/update")
    public String updateEmp(Emp emp){
        empService.updataEmp(emp);
        return "redirect:/emp/findAll";
    }

}
