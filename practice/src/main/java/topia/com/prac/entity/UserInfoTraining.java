package topia.com.prac.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//lombok동작이  들쑥날쑥해서   @Data주석하고  getter,setter수동생성
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoTraining {
	private Integer trainingIdx;
	private Integer userIdx;
	private String trainingName;
	private String trainingStartdate;
	private String trainingEnddate;
	private String trainingAgency;
	
	public Integer getTrainingIdx() {
		return trainingIdx;
	}
	public void setTrainingIdx(Integer trainingIdx) {
		this.trainingIdx = trainingIdx;
	}
	public Integer getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(Integer userIdx) {
		this.userIdx = userIdx;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getTrainingStartdate() {
		return trainingStartdate;
	}
	public void setTrainingStartdate(String trainingStartdate) {
		this.trainingStartdate = trainingStartdate;
	}
	public String getTrainingEnddate() {
		return trainingEnddate;
	}
	public void setTrainingEnddate(String trainingEnddate) {
		this.trainingEnddate = trainingEnddate;
	}
	public String getTrainingAgency() {
		return trainingAgency;
	}
	public void setTrainingAgency(String trainingAgency) {
		this.trainingAgency = trainingAgency;
	}
	
}
