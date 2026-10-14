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
            "結合面診影像辨識與 BFS、經絡儀之整合式健康分析平台（畢業專題）",
            "大四",
            """
            整合 YOLOv11 影像辨識與兩種非侵入式的模組分析平台。系統結合 BFS 生物反饋測試與經絡儀檢測，自動解析 PDF 並擷取關鍵數值，提供多次檢測的趨勢比較，最後產出中西醫結合的綜合健康報告。
            在畢業專題中，我主要負責系統後端開發，以及 BFS 與經絡儀兩個模組的整合。我撰寫了 PDF 自動解析程式，擷取報告中的關鍵數值並存入資料庫，並將分析結果與多次檢測的趨勢比較圖表整合到前端頁面，讓使用者能直觀地掌握健康變化。
            """,
            "整合協調、前端開發、後端開發",
            List.of("YOLOv11", "Python", "Django", "SQLite", "HTML", "CSS", "JavaScript"),
            "",   // 還沒有公開的 repo 就先留空字串
            List.of(
                new ProjectImage("/images/projects/facial-diagnosis/1.jpg", "首頁畫面"),
                new ProjectImage("/images/projects/facial-diagnosis/2.jpg", "BFS 分析結果頁"),
                new ProjectImage("/images/projects/facial-diagnosis/3.jpg", "經絡儀分析結果頁")
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