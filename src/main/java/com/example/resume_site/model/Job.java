package com.example.resume_site.model;

import java.util.List;

public record Job(
        String company,            // 公司名稱
        String role,               // 職稱
        String period,             // 期間
        List<String> duties,       // 工作內容（一條一條列）
        List<ProjectImage> photos  // 照片，沒有就給 List.of()
) {}