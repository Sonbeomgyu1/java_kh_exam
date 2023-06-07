package Example;

public class TestVo {
	
	//변수 
	private int boardNum;
	private String boardWriter;
	private String boardTitle;
	private String boardContent;
	private String boardDate;
	
	//생성자
	public TestVo(int num) {
		boardNum = num+1000;
		boardNum = (int)System.currentTimeMillis() + num;	
	}
	
	public TestVo(int a, String writer) {
		this(a);
		boardWriter = writer;
	}
	
	
	//all arguments 생성자 -->  초기값 설정
	public TestVo(int boardnum, String writer, String title, String content,String date) {
	//	boardNum = a;
		this(boardnum, writer);
		this.boardTitle = title;
		this.boardContent = content;
		this.boardDate = date;
	}
	


	//toString 
	public String toString() {
		return "TestVo [boardNum=" + boardNum + ", boardWriter=" + boardWriter + ", boardTitle=" + boardTitle
				+ ", boardContent=" + boardContent + ", boardDate=" + boardDate + "]";
	}

	//게터세터
	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int BoardNum) {
		this.boardWriter = boardWriter;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String BoardTitle) {
		this.boardTitle = boardTitle;
	}
	
	public String gatBoardContent() {
		return boardContent;
	}
	
	public void satBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

}
