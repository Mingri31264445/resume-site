package com.example.resume_site.model;
import java.util.List;

public record Education(
        String level,            // 大學 / 高中職
        String school,           // 學校
        String dept,             // 科系
        String status,           // 在學 / 畢業
        String period,           // 期間
        List<String> highlights  // 補充說明，沒有就 List.of()
) {}