package com.springboot.springboot.service;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.springboot.springboot.entry.FileStore;

/**
 * 文件操作接口
 * 
 * @date 2018-06-25 22:55:00
 * @author Administrator
 *
 */
@Repository
public interface FileStoreService {

	// 查看 所有 在线 文件
	List<String> queryFile();

	// 上传文件
	List<String> addFile(FileStore fileID);

	// 删除文件
	List<String> deleteFile(String fileID);
}
