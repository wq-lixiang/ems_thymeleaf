package world.lixiang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import world.lixiang.entity.User;
import world.lixiang.service.UserService;
import world.lixiang.utils.ValidateImageCodeUtils;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/code")
    public void getImage(HttpSession session , HttpServletResponse response) throws IOException {
        //生成验证码
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        session.setAttribute("code", securityCode);
        //相应图片
        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(image,"png", outputStream);
    }

    @PostMapping("/register")
    public String register(User user ,HttpSession session , String code){

        String code2 =  (String)session.getAttribute("code");
        if(code2.equalsIgnoreCase(code)){
            userService.regirest(user);
            return "redirect:/index";
        }
        return "redirect:/ToRegist";
    }

    @PostMapping("/login")
    public String login(String username , String password , HttpSession session){
        User user  =  userService.login(username,password);
        session.setAttribute("user" , user);
        if(user != null){
            return "redirect:/emp/findAll";
        }

        return "redirect:/index";

    }
}
