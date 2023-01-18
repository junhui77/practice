package topia.com.prac.personalHistory.dao;

import org.mybatis.spring.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import topia.com.prac.entity.*;

@Repository
public class ImageDao {
	@Autowired
	private SqlSessionTemplate tpl;
	
	public int imgInsert(Image image) {
		System.out.println("imgUpdate:test" );
		return tpl.insert("personalHistory.imgInsert", image);
	}
	
	
	public int imgUpdate(Image image) {
		System.out.println("imgUpdate:test" );
		return tpl.update("personalHistory.imgUpdate", image);
	}
	
	public Image getUserImg(Integer userIdx) {
		System.out.println("imgUpdate:test2" );
		return tpl.selectOne("personalHistory.getUserImg", userIdx);
	}
}
