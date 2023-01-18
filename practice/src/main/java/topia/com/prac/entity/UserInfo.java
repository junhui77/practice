package topia.com.prac.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//lombok동작이  들쑥날쑥해서   @Data주석하고  getter,setter수동생성
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
	private Integer userIdx;
	private String userRegisterString;
	private String userName;
	private String userSocialSecunum;
	private String userSex;
	private String userComp;
	private String userCompEnterString;
	private String userDept;
	private String userSpot;
	private String userArmyServ;
	private String userMaritalStatus;
	private String userArmyServEnter;
	private String userArmyServLeave;
	private String userArmyServPeriod;
	private String userTelnumWired;
	private String userTelnumWireless;
	private String userEmail;
	private String userZipcode;
	private String userAddress;
	private UserInfoCareer userInfoCareer;
	private UserInfoEdu userInfoEdu;
	private UserInfoLicen userInfoLicen;
	private UserInfoQualifi userInfoQualifi;
	private UserInfoSkill userInfoSkill;
	private UserInfoTraining userInfoTraining;
	private Image image;
	private UserInfoBody userInfoBody;
	
	
	
	public UserInfoBody getUserInfoBody() {
		return userInfoBody;
	}
	public void setUserInfoBody(UserInfoBody userInfoBody) {
		this.userInfoBody = userInfoBody;
	}
	public Integer getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(Integer userIdx) {
		this.userIdx = userIdx;
	}
	public String getUserRegisterString() {
		return userRegisterString;
	}
	public void setUserRegisterString(String userRegisterString) {
		this.userRegisterString = userRegisterString;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSocialSecunum() {
		return userSocialSecunum;
	}
	public void setUserSocialSecunum(String userSocialSecunum) {
		this.userSocialSecunum = userSocialSecunum;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserComp() {
		return userComp;
	}
	public void setUserComp(String userComp) {
		this.userComp = userComp;
	}
	public String getUserCompEnterString() {
		return userCompEnterString;
	}
	public void setUserCompEnterString(String userCompEnterString) {
		this.userCompEnterString = userCompEnterString;
	}
	public String getUserDept() {
		return userDept;
	}
	public void setUserDept(String userDept) {
		this.userDept = userDept;
	}
	public String getUserSpot() {
		return userSpot;
	}
	public void setUserSpot(String userSpot) {
		this.userSpot = userSpot;
	}
	public String getUserArmyServ() {
		return userArmyServ;
	}
	public void setUserArmyServ(String userArmyServ) {
		this.userArmyServ = userArmyServ;
	}
	public String getUserMaritalStatus() {
		return userMaritalStatus;
	}
	public void setUserMaritalStatus(String userMaritalStatus) {
		this.userMaritalStatus = userMaritalStatus;
	}
	public String getUserArmyServEnter() {
		return userArmyServEnter;
	}
	public void setUserArmyServEnter(String userArmyServEnter) {
		this.userArmyServEnter = userArmyServEnter;
	}
	public String getUserArmyServLeave() {
		return userArmyServLeave;
	}
	public void setUserArmyServLeave(String userArmyServLeave) {
		this.userArmyServLeave = userArmyServLeave;
	}
	public String getUserArmyServPeriod() {
		return userArmyServPeriod;
	}
	public void setUserArmyServPeriod(String userArmyServPeriod) {
		this.userArmyServPeriod = userArmyServPeriod;
	}
	public String getUserTelnumWired() {
		return userTelnumWired;
	}
	public void setUserTelnumWired(String userTelnumWired) {
		this.userTelnumWired = userTelnumWired;
	}
	public String getUserTelnumWireless() {
		return userTelnumWireless;
	}
	public void setUserTelnumWireless(String userTelnumWireless) {
		this.userTelnumWireless = userTelnumWireless;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserZipcode() {
		return userZipcode;
	}
	public void setUserZipcode(String userZipcode) {
		this.userZipcode = userZipcode;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public UserInfoCareer getUserInfoCareer() {
		return userInfoCareer;
	}
	public void setUserInfoCareer(UserInfoCareer userInfoCareer) {
		this.userInfoCareer = userInfoCareer;
	}
	public UserInfoEdu getUserInfoEdu() {
		return userInfoEdu;
	}
	public void setUserInfoEdu(UserInfoEdu userInfoEdu) {
		this.userInfoEdu = userInfoEdu;
	}
	public UserInfoLicen getUserInfoLicen() {
		return userInfoLicen;
	}
	public void setUserInfoLicen(UserInfoLicen userInfoLicen) {
		this.userInfoLicen = userInfoLicen;
	}
	public UserInfoQualifi getUserInfoQualifi() {
		return userInfoQualifi;
	}
	public void setUserInfoQualifi(UserInfoQualifi userInfoQualifi) {
		this.userInfoQualifi = userInfoQualifi;
	}
	public UserInfoSkill getUserInfoSkill() {
		return userInfoSkill;
	}
	public void setUserInfoSkill(UserInfoSkill userInfoSkill) {
		this.userInfoSkill = userInfoSkill;
	}
	public UserInfoTraining getUserInfoTraining() {
		return userInfoTraining;
	}
	public void setUserInfoTraining(UserInfoTraining userInfoTraining) {
		this.userInfoTraining = userInfoTraining;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	
}
