package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class TestController {

    @RequestMapping("/viewtest")
    public ModelAndView viewTest() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        mv.addObject("name", "TestName");
        return mv;
    }

    @RequestMapping("/rest1")
    @ResponseBody
    public String rest1() {
        return "RestTest1\nHello World!!!!";
    }

    @RequestMapping("/rest2")
    @ResponseBody
    public ArrayList rest2() {
        ArrayList<CustomClass> list = new ArrayList<>();
        list.add(new CustomClass(1,"object1 str1", 1.1, "object1 str2"));
        list.add(new CustomClass(2,"object2 str1", 2.2, "object2 str2"));
        list.add(new CustomClass(3,"object3 str1", 3.3, "object3 str2"));
        return list;
    }
}
