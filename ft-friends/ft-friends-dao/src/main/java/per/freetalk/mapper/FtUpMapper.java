package per.freetalk.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.freetalk.pojo.FtUp;
import per.freetalk.pojo.FtUpExample;

public interface FtUpMapper {
    int countByExample(FtUpExample example);

    int deleteByExample(FtUpExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FtUp record);

    int insertSelective(FtUp record);

    List<FtUp> selectByExample(FtUpExample example);

    FtUp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FtUp record, @Param("example") FtUpExample example);

    int updateByExample(@Param("record") FtUp record, @Param("example") FtUpExample example);

    int updateByPrimaryKeySelective(FtUp record);

    int updateByPrimaryKey(FtUp record);
}