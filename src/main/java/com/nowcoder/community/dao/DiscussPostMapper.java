package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //查询消息，返回对象
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //@param注解用于给参数取别名
    //如果只有一个参数，并且在<if>里使用，则必须加别名。

    //查询消息条数，如果不按照userId查询可以输入0
    int selectDiscussPostRows(@Param("userId") int userId);

}
