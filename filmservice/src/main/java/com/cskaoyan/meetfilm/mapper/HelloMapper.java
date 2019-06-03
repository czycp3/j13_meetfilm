package com.cskaoyan.meetfilm.mapper;

import com.cskaoyan.meetfilm.bean.actor.Actor;
import org.apache.ibatis.annotations.Param;

/**
 * @author czy
 * @date 2019/6/3 16:47
 */
public interface HelloMapper {
    Actor queryActorById(@Param("id") int id);
}
