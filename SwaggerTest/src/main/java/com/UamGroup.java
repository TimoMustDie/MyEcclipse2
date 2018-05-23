package com;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class UamGroup {
	@ApiModelProperty(value="Ⱥ���ID",required=true)
	private String groupId;
	
	@ApiModelProperty(value="Ⱥ�������",required=true)
	private String name;
	
	@ApiModelProperty(value="Ⱥ���ͷ��",required=false)
	private String icon;
	
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId=groupId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon=icon;
	}
}
