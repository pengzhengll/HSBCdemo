package com.springboot.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.springboot.springboot.entity.FileEntity;

/**
 * <p>
 * fileStory infomation Mapper 接口
 * </p>
 * 
 * @describe 可以用xml 文件处理(只用去掉@mapper 属性就可以 )，同样可以使用 、@mapper 样子的处理方式 本例子采用这种处理方式
 * 
 * @author pengzheng
 * @since 2018-06-28
 */
@Mapper
public interface FileStoreMapper {

	// 查询文件信息
	@Select("select * from fileStory ")
	List<FileEntity> queryAllFiles();

	@Insert("insert into fileStory(id, filename, content, operatetime, status)"
			+ "values(#{id}, #{filename}, #{content}, #{operatetime}, #{status})")
	boolean insert(FileEntity fileStore);

	@Update("update fileStory set STATUS=#{status} WHERE id=#{id}")
	boolean delete(@Param("id") String id, @Param("status") String status);

	@Select("select filename, content, operatetime from fileStory  where  id=#{id} ")
	List<FileEntity> getByParam(@Param("id") String id);

}
