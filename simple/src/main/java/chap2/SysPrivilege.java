package chap2;

public class SysPrivilege {
	private Long id;
	private String privilegeName;
	private String privilegeUrl;
	
	public void setId(Long id) {
		this.id=id;
	}
	public Long getId() {
		return id;
	}
	
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName=privilegeName;
	}
	public String getPrivilegeName() {
		return privilegeName;
	}
	
	public void setPrivilegeUrl(String privilegeUrl) {
		this.privilegeUrl=privilegeUrl;
	}
	public String getPrivilegeUrl() {
		return privilegeUrl;
	}
}
