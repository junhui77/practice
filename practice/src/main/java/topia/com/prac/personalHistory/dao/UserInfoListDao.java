package topia.com.prac.personalHistory.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import topia.com.prac.entity.UserInfo;

@Repository
public class UserInfoListDao {
	
	@Autowired
	private SqlSessionTemplate tpl;
	
	public List<UserInfo> list(Map<String, Object> listReqMap) {
		return tpl.selectList("listAll.listSelect", listReqMap);
	}
	
	public int UserCount(Map<String, Object> listReqMap) {
		return tpl.selectOne("listAll.UserCount",listReqMap);
	}
	
	public void UserDelete(Integer userIdx) {
		tpl.delete("listAll.UserDelete",userIdx);
		tpl.delete("listAll.UserBodyDelete",userIdx);
		tpl.delete("listAll.UserCareerDelete",userIdx);
		tpl.delete("listAll.UserEduDelete",userIdx);
		tpl.delete("listAll.UserLicenDelete",userIdx);
		tpl.delete("listAll.UserQualifiDelete",userIdx);
		tpl.delete("listAll.UserSkillDelete",userIdx);
		tpl.delete("listAll.UserTrainingDelete",userIdx);
		
	}
	public void detail(Map<String, Object> userIdx) {
		tpl.selectList("listAll.listAllSelect", userIdx);
	};
	
	
	
}
