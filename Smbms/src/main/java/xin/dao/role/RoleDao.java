package xin.dao.role;

import java.sql.Connection;
import java.util.List;
import xin.pojo.Role;

public interface RoleDao {
	
	public List<Role> getRoleList(Connection connection)throws Exception;

}
