package com.example.resume_site;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.resume_site.service.ProjectService;

@Controller
public class PageController {

    private final ProjectService projectService;

    public PageController(ProjectService projectService) {
        this.projectService = projectService;
    }

    // 首頁跟個人頁都要用到基本資料，抽成一個方法，避免寫兩次
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
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        addProfile(model);
        return "about";
    }
}