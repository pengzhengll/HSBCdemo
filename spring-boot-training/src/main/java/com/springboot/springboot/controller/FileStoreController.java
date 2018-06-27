package com.springboot.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springboot.service.FileStoreService;

@RestController
@RequestMapping("/springboot/demo")
public class FileStoreController {

	@Autowired
	private FileStoreService fileStoreService;

	/** 查询文件信息 **/
	@RequestMapping(value = "/queryAllFileInfo", method = RequestMethod.POST)
	@ResponseBody
	public String queryAllFileInfo() {
		// System.out.print(data);
		// JSON jj = JSON.parseObject(data);
		// OriginalWatchList content = JSON.parseObject(data, OriginalWatchList.class);
		// content.watchlistId =(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new
		// Date());
		// originalWatchListService.addNewRecord(content);
		return "success";
	}

	/** 添加文件信息 **/
	@RequestMapping(value = "/addFileInfo", method = RequestMethod.POST)
	@ResponseBody
	public String addFileInfo(@RequestBody String fileInfo) {
		// System.out.print(data);
		// JSON jj = JSON.parseObject(data);
		// OriginalWatchList content = JSON.parseObject(data, OriginalWatchList.class);
		// content.watchlistId =(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new
		// Date());
		// originalWatchListService.addNewRecord(content);
		return "success";
	}

	/** 删除文件信息 **/
	@RequestMapping(value = "/deleteFileInfo", method = RequestMethod.POST)
	@ResponseBody
	public String queryAllFileInfo(@RequestBody String fileNO) {
		// System.out.print(data);
		// JSON jj = JSON.parseObject(data);
		// OriginalWatchList content = JSON.parseObject(data, OriginalWatchList.class);
		// content.watchlistId =(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new
		// Date());
		// originalWatchListService.addNewRecord(content);
		return "success";
	}

	/** test **/
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "success";
	}
}
