package com.springboot.springboot.service;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.springboot.springboot.entity.FileEntity;

/**
 * 文件操作接口
 * 
 * @date 2018-06-25 22:55:00
 * @author pengzheng
 *
 */
@Repository
public interface FileStoreService {

	// 查看 所有 在线 文件
	List<FileEntity> queryFile();

	// 上传文件
	boolean addFile(FileEntity fileStore);

	// 删除文件
	boolean deleteFile(String fileID);

	
}
