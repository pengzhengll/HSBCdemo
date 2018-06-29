package com.springboot.springboot.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.springboot.entity.FileEntity;
import com.springboot.springboot.service.FileStoreService;

@RestController
public class FileUploadControll {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(FileUploadControll.class);

	@Autowired
	private FileStoreService fileStoreService;

	// 文件上传后的路径
	@Value("${file.filename}")
	private String filePath;
	
	// 文件上传相关代码
	@RequestMapping(value = "/upload")
	@ResponseBody
	public String upload(@RequestParam("test") MultipartFile file) {

		if (file.isEmpty()) {
			return "文件为空";
		}
		// 获取文件名
		String fileName = file.getOriginalFilename();
		logger.info("上传的文件名为：" + fileName);
		// 获取文件的后缀名
		String suffixName = fileName.substring(fileName.lastIndexOf("."));
		logger.info("上传的后缀名为：" + suffixName);
		File dest = new File(filePath + fileName);
		// 检测是否存在目录
		if (!dest.getParentFile().exists()) {
			dest.getParentFile().mkdirs();
		}
		try {
			file.transferTo(dest);
			// 把文件路径传入到数据库中
			FileEntity fileStorer = new FileEntity();
			fileStorer.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			fileStorer.setFileName(filePath + fileName);
			fileStorer.setOperateTime(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
			fileStorer.setContent("");
			fileStorer.setStatus("1");
			boolean addFile = fileStoreService.addFile(fileStorer);
			if (addFile) {
				logger.info("上传成功");
				return "上传成功";
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.error("上传失败");
		return "上传失败";
	}
}
