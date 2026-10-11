package com.example.resume_site.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.resume_site.model.Project;

@Service
public class ProjectService {

    private final List<Project> projects = List.of(
            new Project(
                    "facial-diagnosis",
                    "臉部診斷健康分析系統（畢業專題）",
                    "整合中醫面相、YOLOv8 影像辨識與健康問卷的健康分析平台。",
                    "專案管理、整合協調、演算法研究、文件撰寫（四人團隊）",
                    List.of("YOLOv8", "Django", "React", "Azure SQL"),
                    ""),
            new Project(
                    "shopping-cart",
                    "Angular 購物車前端專案",
                    "以 Angular 21 開發的購物車前端，串接 Azure 上的 REST API。",
                    "獨立開發（課程期末專案）",
                    List.of("Angular", "TypeScript", "Signals", "GitHub Actions"),
                    "")
    );

    public List<Project> findAll() {
        return projects;
    }
}