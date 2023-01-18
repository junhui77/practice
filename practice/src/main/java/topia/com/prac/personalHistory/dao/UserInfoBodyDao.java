package topia.com.prac.personalHistory.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;
import topia.com.prac.entity.UserInfoBody;

@Repository
@Slf4j
public class UserInfoBodyDao {
	
	@Autowired
	private SqlSessionTemplate tpl;
	
	public Integer insert(Map<String, Object> paramMap) {
		return tpl.insert("bodyDao.insert", paramMap);
	}
	
	public Integer updatUserBody(UserInfoBody userInfoBody) {
		return tpl.update("bodyDao.updateUserBody", userInfoBody);
	}
	
	public List<UserInfoBody> list(int intUserIdx) {
		return tpl.selectList("bodyDao.list", intUserIdx);
	}
}
