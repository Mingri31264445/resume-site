package com.example.resume_site.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.resume_site.model.Job;
import com.example.resume_site.model.ProjectImage;

@Service
public class WorkService {

    private final List<Job> jobs = List.of(
        new Job(
            "明光義塾",
            "行政老師",
            "2024.12 ~ 至今",
            List.of(
                "管理學生資料，協助老師安排每日課程",
                "幫助學生解決學習上的問題，提供學習建議",
                "協助老師準備教學材料，確保課程順利進行",
                "與家長保持良好溝通，回報學生學習進度與表現"
            ),
            List.of(
                new ProjectImage("/images/work/1.jpg", "上課示意圖"),
                new ProjectImage("/images/work/2.jpg", "中秋禮盒")
            )
        ),
        new Job("台灣中油", "加油員", "2023.03 ~ 2024.11",
                List.of("負責加油站油品販售", "協助顧客解決加油或會員相關問題"),
                List.of())
    );

    public List<Job> findAll() {
        return jobs;
    }
}