package com.kyle.MVCDemo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest request, HttpSession session){
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int result = num1 + num2;

        session.setAttribute("result", result);
        session.setAttribute("numOne", num1);
        session.setAttribute("numTwo", num2);
        return "result.jsp";
    }
}
