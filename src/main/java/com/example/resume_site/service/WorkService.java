package com.example.resume_site.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.resume_site.model.Job;
import com.example.resume_site.model.ProjectImage;

@Service
public class WorkService {

    private final List<Job> jobs = List.of(
        // 最近這段：有 2 張照片（排最前面）
        new Job(
            "公司名稱 A",
            "職稱",
            "2025.07 ~ 至今",
            List.of(
                "做了什麼事情 1",
                "做了什麼事情 2",
                "做了什麼事情 3"
            ),
            List.of(
                new ProjectImage("/images/work/1.jpg", "照片說明 1"),
                new ProjectImage("/images/work/2.jpg", "照片說明 2")
            )
        ),
        // 較早的兩段：沒有照片，photos 給 List.of()
        new Job("公司名稱 B", "職稱", "2024.01 ~ 2024.12",
                List.of("做了什麼事情 1", "做了什麼事情 2"),
                List.of()),
        new Job("公司名稱 C", "職稱", "2023.06 ~ 2023.12",
                List.of("做了什麼事情 1", "做了什麼事情 2"),
                List.of())
    );

    public List<Job> findAll() {
        return jobs;
    }
}