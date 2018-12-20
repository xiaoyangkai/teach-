package com.tt.teach.dao;

import com.tt.teach.pojo.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResultDao {

    @Select("SELECT result.*,student.studentName AS\n" +
            " studentName,subject.subjectName AS subjectName FROM result,\n" +
            " student,SUBJECT WHERE result.studentNo=student.studentNo AND\n" +
            "  result.subjectNo=SUBJECT.subjectNo ORDER BY result.examDate DESC\n")
    List<Result> getResultList();
}
