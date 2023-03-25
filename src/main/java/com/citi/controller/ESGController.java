package com.citi.controller;

import com.citi.mapper.ESGMapper;
import com.citi.pojo.ESG;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ESGController {
    @Autowired
    ESGMapper esgMapper;


    @GetMapping("/esg")
    public String getESGBycode(Model model,@RequestParam Integer code){
        List<ESG> esgs=esgMapper.getESGByCode(code);
        model.addAttribute("esgs",esgs);
        System.out.println(esgs);
        return "doc";
    }
}
