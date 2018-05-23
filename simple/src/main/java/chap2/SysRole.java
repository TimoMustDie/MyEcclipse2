package chap2;

import java.util.Date;

public class SysRole {
	private Long id;
	private String roleName;
	private Integer enabeld;
	private Long createBy;
	private Date create_time;
	public void setId(Long id) {
		this.id=id;
	}
	public Long getId() {
		return id;
	}
	
	public void setRoleName(String roleName) {
		this.roleName=roleName;
	}
	public String getRoleName() {
		return roleName;
	}
	
	public void setEnabled(Integer enabled) {
		this.enabeld=enabled;
	}
	public Integer getEnabled() {
		return enabeld;
	}
	
	public void setCreateBy(Long createBy) {
		this.createBy=createBy;
	}
	public Long getCreateBy() {
		return createBy;
	}
	
	public void setCreateTime(Date createTime) {
		this.create_time=createTime;
	}
	public Date getCreateTime() {
		return create_time;
	}
}
