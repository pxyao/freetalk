package per.freetalk.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import per.freetalk.pojo.FtFriend;
import per.freetalk.pojo.FtFriendExample;

public interface FtFriendMapper {
    int countByExample(FtFriendExample example);

    int deleteByExample(FtFriendExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FtFriend record);

    int insertSelective(FtFriend record);

    List<FtFriend> selectByExample(FtFriendExample example);

    FtFriend selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FtFriend record, @Param("example") FtFriendExample example);

    int updateByExample(@Param("record") FtFriend record, @Param("example") FtFriendExample example);

    int updateByPrimaryKeySelective(FtFriend record);

    int updateByPrimaryKey(FtFriend record);
}