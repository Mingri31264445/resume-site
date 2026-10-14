package com.example.resume_site.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.resume_site.model.Project;
import com.example.resume_site.model.ProjectImage;

@Service
public class ProjectService {

    private final List<Project> projects = List.of(
        new Project(
            "facial-diagnosis",
            "臉部診斷健康分析系統（畢業專題）",
            "大四",
            "整合 YOLOv8 影像辨識與健康問卷的分析平台。",
            "專案管理、整合協調、演算法研究、文件撰寫",
            List.of("YOLOv8", "Python"),
            "",   // 還沒有公開的 repo 就先留空字串
            List.of(
                new ProjectImage("/images/projects/facial-diagnosis/1.jpg", "首頁畫面（測試資料）"),
                new ProjectImage("/images/projects/facial-diagnosis/2.jpg", "分析結果頁（測試資料）"),
                new ProjectImage("/images/projects/facial-diagnosis/3.jpg", "系統架構圖")
            )
        ),
        new Project(
            "shopping-cart",
            "Angular 購物車前端專案",
            "大三",
            "以 Angular 開發的購物車前端，串接 REST API。",
            "獨立開發",
            List.of("Angular", "TypeScript"),
            "",
            List.of(
                new ProjectImage("/images/projects/shopping-cart/1.jpg", "商品列表"),
                new ProjectImage("/images/projects/shopping-cart/2.jpg", "購物車頁面")
            )
        )
    );

    public List<Project> findAll() {
        return projects;
    }
}