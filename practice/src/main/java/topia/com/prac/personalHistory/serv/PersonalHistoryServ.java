package topia.com.prac.personalHistory.serv;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.web.multipart.MultipartFile;

import topia.com.prac.entity.Image;
import topia.com.prac.entity.UserInfoList;

public interface PersonalHistoryServ {
	public HashMap<String, Object> userList(HashMap<String,Object> reqMap); 
	HashMap<String,Object> registerUser(Object inputdata);
	public int registerUserUpdate(HashMap<String,Object> intputdata);
	public HashMap<String, Object> getRegisterData(Map<String, Object> userIdx) throws JsonParseException, JsonMappingException, IOException;
	int imgInsert(MultipartFile file, String userName, Image image) throws IllegalStateException, IOException;
	int imgUpdate(MultipartFile file, String userName, Image image) throws IllegalStateException, IOException;
	
	
	public List<UserInfoList> userInfoList(Map<String, Object> listReqMap);
	
	
	
	

}
