package com.aiit.Service.Impl;

import com.aiit.Mapper.RoleMapper;
import com.aiit.Pojo.Role;
import com.aiit.Service.RoleService;
import com.aiit.VO.RoleParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Override
    public Role getRole(Integer id) {
        return roleMapper.getRole(id);
    }

    @Override
    public List<Role> getRoleByPage(RoleParam roleParam) {
        return roleMapper.getRoleByPage(roleParam);
    }
}
