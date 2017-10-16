package per.freetalk.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.freetalk.pojo.FtMysaid;
import per.freetalk.pojo.FtMysaidExample;

public interface FtMysaidMapper {
    int countByExample(FtMysaidExample example);

    int deleteByExample(FtMysaidExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FtMysaid record);

    int insertSelective(FtMysaid record);

    List<FtMysaid> selectByExampleWithBLOBs(FtMysaidExample example);

    List<FtMysaid> selectByExample(FtMysaidExample example);

    FtMysaid selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FtMysaid record, @Param("example") FtMysaidExample example);

    int updateByExampleWithBLOBs(@Param("record") FtMysaid record, @Param("example") FtMysaidExample example);

    int updateByExample(@Param("record") FtMysaid record, @Param("example") FtMysaidExample example);

    int updateByPrimaryKeySelective(FtMysaid record);

    int updateByPrimaryKeyWithBLOBs(FtMysaid record);

    int updateByPrimaryKey(FtMysaid record);
}