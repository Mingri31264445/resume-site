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
            "https://github.com/Mingri31264445/health-analysis-system.git",
            List.of(
                new ProjectImage("/images/projects/facial-diagnosis/1.jpg", "首頁畫面"),
                new ProjectImage("/images/projects/facial-diagnosis/2.jpg", "BFS 原始報告"),
                new ProjectImage("/images/projects/facial-diagnosis/3.jpg", "BFS 分析結果頁"),
                new ProjectImage("/images/projects/facial-diagnosis/4.jpg", "經絡儀原始報告"),
                new ProjectImage("/images/projects/facial-diagnosis/5.jpg", "經絡儀分析結果頁")
            )
        ),
        new Project(
            "app-shopping-cart",
            "Android 購物車 App 介面開發",
            "大二",
            """
            以 Android Studio 開發的購物車 App 介面，包含商品列表、商品篩選、購物車頁面等功能。
            透過這個專案，我學習了 Android 開發的基本流程，UI 設計，以及如何使用 Java 進行程式邏輯的實作。這個專案讓我對移動應用程式開發有了更深入的了解，並且提升了我的程式設計能力。     
            """,
            "獨立開發",
            List.of("Android", "Java"),
            "https://github.com/Mingri31264445/AppFunalQuiz_12131361.git",
            List.of(
                new ProjectImage("/images/projects/app-shopping-cart/1.jpg", "商品列表"),
                new ProjectImage("/images/projects/app-shopping-cart/2.jpg", "商品篩選"),
                new ProjectImage("/images/projects/app-shopping-cart/3.jpg", "購物車頁面")
            )
        ),
        new Project(
            "shopping-cart",
            "ASP.NET core MVC 購物商城前端專案",
            "大二",
            """
            以 ASP.NET core MVC 開發的購物商城前端專案，包含商品列表、商品詳情、購物車頁面等功能。
            透過這個專案，我學習了 ASP.NET core MVC 的基本架構，前端頁面設計，以及如何使用 C# 進行程式邏輯的實作。這個專案讓我對 Web 開發有了更深入的了解，並且提升了我的程式設計能力。
            """,
            "獨立開發",
            List.of("ASP.NET", "C#"),
            "https://github.com/Mingri31264445/WebFinalExam.git",
            List.of(
                new ProjectImage("/images/projects/shopping-cart/1.jpg", "商城主頁面"),
                new ProjectImage("/images/projects/shopping-cart/2.jpg", "商品詳情頁面"),
                new ProjectImage("/images/projects/shopping-cart/3.jpg", "購物車頁面")
            )
        )
    );

    public List<Project> findAll() {
        return projects;
    }
}