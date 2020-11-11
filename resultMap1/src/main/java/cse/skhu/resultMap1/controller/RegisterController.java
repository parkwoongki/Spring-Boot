package cse.skhu.resultMap1.controller;

import cse.skhu.resultMap1.mapper.RegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("register")
public class RegisterController {
    @Autowired
    RegisterMapper registerMapper;

    @RequestMapping("list")
    public String list(Model model) {
        model.addAttribute("registers", registerMapper.findAll());
        return "register/list";
    }
}