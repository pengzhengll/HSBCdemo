package com.springboot.springboot.entry;

import java.io.Serializable;

/**
 * 文件实体
 * 
 * @date 2018-06-25 22:55:00
 * @author Administrator
 *
 */
public class FileStore implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String fileName;
	private byte[] content;
	private String operateTime;
	private String status;

	public FileStore(String id, String fileName, byte[] content, String operateTime, String status) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.content = content;
		this.operateTime = operateTime;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	};

}
