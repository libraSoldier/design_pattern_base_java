package com.keeplearng.design.pattern.structural_jiegouxing.flyweight_xiangyuan;

/**
 * Created by liangyu
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(reportContent);
    }
    private String title = "部门经理";
    private String department;
    private String reportContent;

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Manager(String department) {
        this.department = department;
    }


}
