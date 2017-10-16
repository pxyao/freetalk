package per.freetalk.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.freetalk.pojo.FtComment;
import per.freetalk.pojo.FtCommentExample;

public interface FtCommentMapper {
    int countByExample(FtCommentExample example);

    int deleteByExample(FtCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FtComment record);

    int insertSelective(FtComment record);

    List<FtComment> selectByExampleWithBLOBs(FtCommentExample example);

    List<FtComment> selectByExample(FtCommentExample example);

    FtComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FtComment record, @Param("example") FtCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") FtComment record, @Param("example") FtCommentExample example);

    int updateByExample(@Param("record") FtComment record, @Param("example") FtCommentExample example);

    int updateByPrimaryKeySelective(FtComment record);

    int updateByPrimaryKeyWithBLOBs(FtComment record);

    int updateByPrimaryKey(FtComment record);
}