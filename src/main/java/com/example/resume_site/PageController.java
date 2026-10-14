package com.example.resume_site;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.resume_site.service.EducationService;
import com.example.resume_site.service.ProjectService;
import com.example.resume_site.service.SkillService;
import com.example.resume_site.service.WorkService;

@Controller
public class PageController {

    private final ProjectService projectService;
    private final WorkService workService;
    private final EducationService educationService;
    private final SkillService skillService;

    public PageController(ProjectService projectService, WorkService workService,
                          EducationService educationService, SkillService skillService) {
        this.projectService = projectService;
        this.workService = workService;
        this.educationService = educationService;
        this.skillService = skillService;
    }

    private void addProfile(Model model) {
        model.addAttribute("name", "宗恩");
        model.addAttribute("englishName", "Wayne Tsung-En Yang");
        model.addAttribute("school", "銘傳大學");
        model.addAttribute("intro", "一位熱愛程式設計的學生，對於軟體開發充滿熱情，喜歡學習新技術並應用於實際專案中。");
        model.addAttribute("github", "https://github.com/Mingri31264445");
        model.addAttribute("email", "tsun.an.yang@gmail.com");
    }

    @GetMapping("/")
    public String home(Model model) {
        addProfile(model);
        model.addAttribute("projects", projectService.findAll());
        model.addAttribute("jobs", workService.findAll());
        model.addAttribute("educations", educationService.findAll());
        model.addAttribute("skillGroups", skillService.groups());
        model.addAttribute("certificates", skillService.certificates());
        return "index";
    }
}