package chap2;

public class SysRolePrivilege {
	private Long roleId;
	private Long privilegeId;
	
	public void getRoleId(Long roleId) {
		this.roleId=roleId;
	}
	public Long getRoleId() {
		return roleId;
	}
	
	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId=privilegeId;
	}
	public Long getPrivilegeId() {
		return privilegeId;
	}
}
