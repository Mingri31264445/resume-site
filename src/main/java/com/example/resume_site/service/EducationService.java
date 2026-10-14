package com.example.resume_site.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.resume_site.model.Education;

@Service
public class EducationService {

    private final List<Education> list = List.of(
        new Education("大學", "銘傳大學", "資訊管理學系", "在學", "112/09 ~ 116/06",
            List.of(
                "畢業專題：Face AI解鎖臉的智慧地圖:結合深度學習、影像辨識、皮膚病變之系統開發",
                "相關修課：程式設計、資料結構、資料庫管理、Web程式設計、系統分析與設計、計算機概論、電腦網路導論"
            )),
        new Education("高中職", "湖口高中", "普通科", "畢業", "109/09 ~ 112/06",
            List.of())
    );

    public List<Education> findAll() { return list; }
}