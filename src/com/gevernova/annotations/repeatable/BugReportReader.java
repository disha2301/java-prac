package com.gevernova.annotations.repeatable;

import java.lang.reflect.Method;

public class BugReportReader {
    public static void main(String[] args) {
        Class<IssueTracker> clazz = IssueTracker.class;

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(BugReport.class) || method.isAnnotationPresent(BugReports.class)) {
                BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);
                System.out.println("Method: " + method.getName());

                for (BugReport bug : bugReports) {
                    System.out.println("  - Description: " + bug.description());
                    System.out.println("    Reported By: " + bug.reportedBy());
                    System.out.println("    Severity: " + bug.severity());
                }
                System.out.println();
            }
        }
    }
}
