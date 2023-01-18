package topia.com.prac.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//lombok동작이  들쑥날쑥해서   @Data주석하고  getter,setter수동생성
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoCareer {
	private Integer careerIdx;
	private Integer userIdx;
	private String careerCompName;
	private String careerEnterdate;
	private String careerLeavedate;
	private String careerSpot;
	private String careerResponsib;
	
	public Integer getCareerIdx() {
		return careerIdx;
	}
	public void setCareerIdx(Integer careerIdx) {
		this.careerIdx = careerIdx;
	}
	public Integer getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(Integer userIdx) {
		this.userIdx = userIdx;
	}
	public String getCareerCompName() {
		return careerCompName;
	}
	public void setCareerCompName(String careerCompName) {
		this.careerCompName = careerCompName;
	}
	public String getCareerEnterdate() {
		return careerEnterdate;
	}
	public void setCareerEnterdate(String careerEnterdate) {
		this.careerEnterdate = careerEnterdate;
	}
	public String getCareerLeavedate() {
		return careerLeavedate;
	}
	public void setCareerLeavedate(String careerLeavedate) {
		this.careerLeavedate = careerLeavedate;
	}
	public String getCareerSpot() {
		return careerSpot;
	}
	public void setCareerSpot(String careerSpot) {
		this.careerSpot = careerSpot;
	}
	public String getCareerResponsib() {
		return careerResponsib;
	}
	public void setCareerResponsib(String careerResponsib) {
		this.careerResponsib = careerResponsib;
	}
	
}
