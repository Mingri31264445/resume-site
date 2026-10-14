package com.example.resume_site.model;

import java.util.List;

public record Project(
        String id,
        String title,
        String period,
        String summary,
        String role,
        List<String> tech,
        String repoUrl,
        List<ProjectImage> images
) {
}