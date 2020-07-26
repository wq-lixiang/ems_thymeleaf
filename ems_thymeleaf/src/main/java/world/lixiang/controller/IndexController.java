package world.lixiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String toIndex(){
        return "ems/login";
    }

    @RequestMapping("/ToRegist")
    public String toRegist(){
        return "ems/regist";
    }

    @RequestMapping("/ToSave")
    public String toSave(){
        return "ems/addEmp";
    }
}
