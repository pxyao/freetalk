package per.freetalk.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.freetalk.pojo.FtCommented;
import per.freetalk.pojo.FtCommentedExample;

public interface FtCommentedMapper {
    int countByExample(FtCommentedExample example);

    int deleteByExample(FtCommentedExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FtCommented record);

    int insertSelective(FtCommented record);

    List<FtCommented> selectByExample(FtCommentedExample example);

    FtCommented selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FtCommented record, @Param("example") FtCommentedExample example);

    int updateByExample(@Param("record") FtCommented record, @Param("example") FtCommentedExample example);

    int updateByPrimaryKeySelective(FtCommented record);

    int updateByPrimaryKey(FtCommented record);
}