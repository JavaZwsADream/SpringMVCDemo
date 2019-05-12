package com.aiit.Service;

import com.aiit.Pojo.Role;
import com.aiit.VO.RoleParam;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface RoleService {

    public Role getRole(Integer id);
    public List<Role> getRoleByPage(RoleParam roleParam);
}
