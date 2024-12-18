package study.cls.cls09;

import java.util.ArrayList;

public class LectureRoom {

		int floor; //7층
		int roomNumber; //강의실번호 3교육실
		double pyeong; // 몇 평인지 (공간)
		
		boolean hasWhiteBoard;
		
		WhiteBoard board;
		AirCon airCon;
		
		//Desk desk;
//		Desk[] deskArr;
//		Desk[] desks;
		
		ArrayList<Desk> deskList;
		
		public LectureRoom() {
			floor = 0;
			roomNumber = 0;
			pyeong =0;
			hasWhiteBoard = false;
			board = null;
			airCon = null;
			deskList = null;
//			deskList = new ArrayList<Desk>();	//NullPointerException
		}
		
		public void setDeskList(ArrayList<Desk> deskList) {
			this.deskList = deskList;
			
		}
		public void setFloor(int floor) {
			this.floor = floor;
		}
		
		public void addDesk(Desk desk) {
			if (this.deskList == null) {
				this.deskList = new ArrayList<Desk>();
			}
			this.deskList.add(desk);
		}
}
