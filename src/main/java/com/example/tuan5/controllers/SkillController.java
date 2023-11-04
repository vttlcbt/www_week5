package com.example.tuan5.controllers;

import com.example.tuan5.backend.models.Skill;
import com.example.tuan5.backend.services.SkillServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller()
@RequestMapping("/skills")

public class SkillController {
    @Autowired
    private SkillServices skillServices;

    @GetMapping
    public String showSkillList(Model model) {

        model.addAttribute("skills", skillServices.findAll());
        return "skills/skills";
    }

    @GetMapping("/show-add-form")
    public ModelAndView showAddSkillForm() {
        ModelAndView modelAndView = new ModelAndView("skills/add");
        modelAndView.addObject("skill", new Skill());
        return modelAndView;
    }


    @PostMapping("/addSkill")
    public String addSkill(@ModelAttribute("skill") Skill skill) {
        skillServices.save(skill);
        return "redirect:/skills";
    }
}
