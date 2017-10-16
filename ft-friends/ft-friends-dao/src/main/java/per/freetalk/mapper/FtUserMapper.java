package per.freetalk.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.freetalk.pojo.FtUser;
import per.freetalk.pojo.FtUserExample;

public interface FtUserMapper {
    int countByExample(FtUserExample example);

    int deleteByExample(FtUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FtUser record);

    int insertSelective(FtUser record);

    List<FtUser> selectByExample(FtUserExample example);

    FtUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FtUser record, @Param("example") FtUserExample example);

    int updateByExample(@Param("record") FtUser record, @Param("example") FtUserExample example);

    int updateByPrimaryKeySelective(FtUser record);

    int updateByPrimaryKey(FtUser record);
}