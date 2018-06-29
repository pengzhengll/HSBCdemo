package com.springboot.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.springboot.springboot.entity.FileEntity;
import com.springboot.springboot.service.FileStoreService;

@RestController
@RequestMapping("/springboot/demo")
public class FileStoreController {

	@Autowired
	private FileStoreService fileStoreService;
	
	public List<String> listFileName;

	/** 查询文件信息 **/
	@RequestMapping(value = "/queryAllFileInfo", method = RequestMethod.GET)
	@ResponseBody
	public List<FileEntity> queryAllFileInfo() {
		List<FileEntity> allFiles = fileStoreService.queryFile();
		return allFiles;

	}

	/** 删除文件信息 **/
	@RequestMapping(value = "/deleteFileInfo", method = RequestMethod.DELETE)
	@ResponseBody
	public boolean queryAllFileInfo(@RequestBody String fileNO) {
		Object parse = JSON.parseObject(fileNO).get("id");
		System.out.println(String.valueOf(parse));
		boolean deleteFile = fileStoreService.deleteFile(String.valueOf(parse));
		return deleteFile;
	}

	/** test **/
	@RequestMapping(value = "/test", method = RequestMethod.POST)
	@ResponseBody
	public String test() {
		return "success";
	}

}
