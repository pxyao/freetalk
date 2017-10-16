package per.freetalk.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.freetalk.pojo.FtCollected;
import per.freetalk.pojo.FtCollectedExample;

public interface FtCollectedMapper {
    int countByExample(FtCollectedExample example);

    int deleteByExample(FtCollectedExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FtCollected record);

    int insertSelective(FtCollected record);

    List<FtCollected> selectByExample(FtCollectedExample example);

    FtCollected selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FtCollected record, @Param("example") FtCollectedExample example);

    int updateByExample(@Param("record") FtCollected record, @Param("example") FtCollectedExample example);

    int updateByPrimaryKeySelective(FtCollected record);

    int updateByPrimaryKey(FtCollected record);
}