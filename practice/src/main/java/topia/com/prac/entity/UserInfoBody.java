package topia.com.prac.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class UserInfoBody {
	
	private Integer eduIdx;
	private Integer userIdx;
	private String bodyBloodType;
	private Integer bodyWeight;
	private Integer bodyHeight;
	private Integer bodyVisionLeft;
	private Integer bodyVisionRight;
	
	public Integer getEduIdx() {
		return eduIdx;
	}
	public void setEduIdx(Integer eduIdx) {
		this.eduIdx = eduIdx;
	}
	public Integer getUserIdx() {
		return userIdx;
	}
	public void setUserIdx(Integer userIdx) {
		this.userIdx = userIdx;
	}
	public String getBodyBloodType() {
		return bodyBloodType;
	}
	public void setBodyBloodType(String bodyBloodType) {
		this.bodyBloodType = bodyBloodType;
	}
	public Integer getBodyWeight() {
		return bodyWeight;
	}
	public void setBodyWeight(Integer bodyWeight) {
		this.bodyWeight = bodyWeight;
	}
	public Integer getBodyHeight() {
		return bodyHeight;
	}
	public void setBodyHeight(Integer bodyHeight) {
		this.bodyHeight = bodyHeight;
	}
	
	public Integer getBodyVisionLeft() {
		return bodyVisionLeft;
	}
	public void setBodyVisionLeft(Integer bodyVisionLeft) {
		this.bodyVisionLeft = bodyVisionLeft;
	}
	public Integer getBodyVisionRight() {
		return bodyVisionRight;
	}
	public void setBodyVisionRight(Integer bodyVisionRight) {
		this.bodyVisionRight = bodyVisionRight;
	}
	@Override
	public String toString() {
		return "UserInfoBody [eduIdx=" + eduIdx + ", userIdx=" + userIdx + ", bodyBloodType=" + bodyBloodType
				+ ", bodyWeight=" + bodyWeight + ", bodyHeight=" + bodyHeight + ", bodyVisionLeft=" + bodyVisionLeft
				+ ", bodyVisionRight=" + bodyVisionRight + ", getEduIdx()=" + getEduIdx() + ", getUserIdx()="
				+ getUserIdx() + ", getBodyBloodType()=" + getBodyBloodType() + ", getBodyWeight()=" + getBodyWeight()
				+ ", getBodyHeight()=" + getBodyHeight() + ", getBodyVisionLeft()=" + getBodyVisionLeft()
				+ ", getBodyVisionRight()=" + getBodyVisionRight() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
