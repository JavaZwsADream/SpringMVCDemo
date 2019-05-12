package com.aiit.Mapper;

import com.aiit.Pojo.Role;
import com.aiit.VO.RoleParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    public Role getRole(Integer id);
    public List<Role> getRoleByPage(@Param("roleParam") RoleParam roleParam);
}
