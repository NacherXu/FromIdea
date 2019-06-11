package cc.itcast.controller;

import cc.itcast.domain.Items;
import cc.itcast.service.LoginService;
import cc.itcast.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemsConcroller {
    @Autowired
    private LoginServiceImpl loginService;
@RequestMapping("find")
    public ModelAndView find (Integer id){
    ModelAndView mv = new ModelAndView();
    Items one = loginService.findOne(id);
    mv.addObject("Items",one);
    mv.setViewName("success");
    return mv;
    }
}
