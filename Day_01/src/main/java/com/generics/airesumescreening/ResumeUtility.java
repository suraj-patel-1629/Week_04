package com.generics.airesumescreening;

import com.generics.airesumescreening.JobRole;

import java.util.List;

// Utility Class to Process Resumes Using Wildcards
class ResumeUtility {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayResume();
        }
    }
}
