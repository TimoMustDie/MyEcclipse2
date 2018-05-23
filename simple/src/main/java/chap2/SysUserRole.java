package chap2;

public class SysUserRole {
	private Long userId;
	private Long roleId;
	public void setUserId(Long userId) {
		this.userId=userId;
	}
	public Long getUserId() {
		return userId;
	}
	
	public void setRoleId(Long roleId) {
		this.roleId=roleId;
	}
	public Long getRoleId() {
		return roleId;
	}
}
