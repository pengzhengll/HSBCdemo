package com.springboot.springboot.entity;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;

/**
 * 文件实体
 * 
 * @date 2018-06-25 22:55:00
 * @author Administrator
 *
 */
public class FileEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String filename;
	private String content;
	private String operatetime;
	private String status;

	public FileEntity(String id, String fileName, String content, String operateTime, String status) {
		super();
		this.id = id;
		this.filename = fileName;
		this.content = content;
		this.operatetime = operateTime;
		this.status = status;
	}

	public FileEntity() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return filename;
	}

	public void setFileName(String fileName) {
		this.filename = fileName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOperateTime() {
		return operatetime;
	}

	public void setOperateTime(String operateTime) {
		this.operatetime = operateTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	};

}
