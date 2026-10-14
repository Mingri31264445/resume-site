package com.example.resume_site.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.resume_site.model.Certificate;
import com.example.resume_site.model.Skill;
import com.example.resume_site.model.SkillGroup;

@Service
public class SkillService {

    private final List<SkillGroup> groups = List.of(
        new SkillGroup("後端", List.of(
            new Skill("Java", ""),
            new Skill("Django", ""),
            new Skill("ASP.NET Core MVC", "")
        )),
        new SkillGroup("資料庫", List.of(
            new Skill("SQL Server", "")
        )),
        new SkillGroup("前端", List.of(
            new Skill("HTML / CSS / JavaScript", "")
        )),
        new SkillGroup("AI / 其他語言", List.of(
            new Skill("Python", "")
        )),
        new SkillGroup("工具", List.of(
            new Skill("Git / GitHub", "")
        ))
    );

    // 發證單位與取得年月請你自己確認、修改
    private final List<Certificate> certs = List.of(
        new Certificate("Information Technology Specialist：Java", "Certiport", "2024/12"),
        new Certificate("Information Technology Specialist：Python", "Certiport", "2025/05"),
        new Certificate("iPAS 資訊安全工程師（初級）", "經濟部產業發展署", "2025/11"),
        new Certificate("鼎新 ERP 軟體應用師", "鼎新電腦", "2026/06")
    );

    public List<SkillGroup> groups() { return groups; }
    public List<Certificate> certificates() { return certs; }
}