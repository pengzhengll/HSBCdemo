package com.springboot.springboot.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springboot.entity.FileEntity;
import com.springboot.springboot.mapper.FileStoreMapper;
import com.springboot.springboot.service.FileStoreService;

/**
 * 文件处理实现类
 * 
 * @date 2018-06-25 22:28:00
 * @author pengzheng
 *
 */
@Service
public class FileStoreServiceimpl implements FileStoreService {

	/**
	 * 注入文件处理 mapper
	 */
	@Autowired
	private FileStoreMapper mapper;

	@Override
	public List<FileEntity> queryFile() {
		List<FileEntity> queryAllFiles = mapper.queryAllFiles();
		return queryAllFiles;
	}

	/**
	 * 把文件的路径放到数据库之中， 实际的文件放到指定的位置
	 */
	@Override
	public boolean addFile(FileEntity fileStore) {
		return mapper.insert(fileStore);
	}

	@Override
	public boolean deleteFile(String fileID) {
		boolean delete = false;
		List<FileEntity> byParam = mapper.getByParam(fileID);
		System.out.println(">>>>>>>>:"+fileID);
		if (byParam != null && byParam.size()>0) {
			for (FileEntity fileEntity : byParam) {
				String fileName = fileEntity.getFileName();
				File file = new File(fileName);
				if (file.exists() && file.isFile()) {
					delete = file.delete();
					return delete;
				}
			}
		}
		return delete;

	}
}
