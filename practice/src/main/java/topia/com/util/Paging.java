package topia.com.util;

public class Paging {
	
	private int totalCount; // 게시판 전체 데이터 개수
	private int displayPageNum = 5; // 게시판 화면에서 한번에 보여질 페이지 번호의 개수
	
	private int startPage; // 화면의 시작 번호
	private int endPage; // 화면의 끝 번호
	private boolean prev; //페이징 이전 버튼 활성화 여부
	private boolean next; //페이징 다음 버튼 활성화 여부
	
	private Criteria criteria;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		pagingData();
	}
	
	private void pagingData() {
	 // endPage = (현재 페이지번호/화면에 보여질 페이지 번호의 개수)*화면에 보여질 페이지 번호의 개수 
		endPage = (int)(Math.ceil(criteria.getPage()/(double)displayPageNum)*displayPageNum);
	 // startPage = (끝 페이지 번호 - 화면에 보여질 페이지 번호의 개수)+1 
		startPage = ( endPage - displayPageNum ) + 1;
		
		// 마지막 페이지 번호 = 총 게시글 수/한페이지당 보여줄 게시글의 개수
		int tempEndPage = (int)(Math.ceil(totalCount/(double)criteria.getPerPageNum()));
		if(endPage > tempEndPage) {
			endPage = tempEndPage;
		}
	
		// 이전 버튼 생성 여부 = 시작 페이지 번호가 1과 같으면 false, 다르면 true 반환
		prev = startPage == 1 ? false : true;
		
		// 다음 버튼 생성 여부 = 끝 페이비 번호*한 페이지당 보여줄 게시글의 개수가 총 게시글의 수보다 크거나 같으면 false, 아니면 true 반환
		next = endPage * criteria.getPerPageNum() >= totalCount ? false : true;	
		
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public Criteria getCriteria() {
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public String toString() {
		return "Paging [totalCount=" + totalCount + ", displayPageNum=" + displayPageNum + ", startPage=" + startPage
				+ ", endPage=" + endPage + ", prev=" + prev + ", next=" + next + ", criteria=" + criteria + "]";
	}
	
}
