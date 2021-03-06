package com.tt.teach.pojo;

import java.io.Serializable;
/**
 * @作者:chaixue
 * @时间:2018/12/19 14:32
 * @描述:实体类Subject——》对应数据库科目表
 */
public class Subject implements Serializable {
    private Integer subjectNo;
    private Integer classHour;
    private Integer gradeID;
    private String subjectName;

    public Integer getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(Integer subjectNo) {
        this.subjectNo = subjectNo;
    }

    public Integer getClassHour() {
        return classHour;
    }

    public void setClassHour(Integer classHour) {
        this.classHour = classHour;
    }

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Subject() {
    }

    public Subject(Integer subjectNo, Integer classHour, Integer gradeID, String subjectName) {
        this.subjectNo = subjectNo;
        this.classHour = classHour;
        this.gradeID = gradeID;
        this.subjectName = subjectName;
    }
}
