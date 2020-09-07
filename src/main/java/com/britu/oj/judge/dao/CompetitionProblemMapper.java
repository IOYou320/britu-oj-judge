package com.britu.oj.judge.dao;

import com.britu.oj.judge.entity.CompetitionProblem;
import org.apache.ibatis.annotations.Param;

public interface CompetitionProblemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompetitionProblem record);

    int insertSelective(CompetitionProblem record);

    CompetitionProblem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompetitionProblem record);

    int updateByPrimaryKey(CompetitionProblem record);

    Integer getScoreByCompIdProblemId(@Param("compId") Integer compId,@Param("problemId")  String problemId);

    int addAcCountByCompIdProblemId(@Param("compId") Integer compId,@Param("problemId")  String problemId);

    int addSubmitCountByCompIdProblemId(@Param("compId") Integer compId,@Param("problemId")  String problemId);

}