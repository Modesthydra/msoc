package com.yy.msoc.dao;

import com.yy.msoc.entities.CarInfo;
import org.apache.ibatis.annotations.Param;

/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CarInfoDao {
    CarInfo findById(@Param("cityName") String id);
}