package chap2;

import java.sql.Date;


public class SysUser {
	private Long id;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String userInfo;
	private byte[] headImg;
	private Date createTime;
	public void setId(Long id) {
		this.id=id;
	}
	public Long getId() {
		return id;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getUserName() {
		return userName;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword=userPassword;
	}
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail=userEmail;
	}
	public String getUserEmail() {
		return userEmail;
	}
	
	public void setUserInfo(String userInfo) {
		this.userInfo=userInfo;
	}
	public String getUserInfo() {
		return userInfo;
	}
	
	public void setHeadImg(byte[] headImg) {
		this.headImg=headImg;
	}
	public byte[] getHeadImg() {
		return headImg;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime=createTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
}
