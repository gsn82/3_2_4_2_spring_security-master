package web.service;

import web.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getRoles();
    Role getRoleById(String id);
    Role getRoleByName(String name);
}
