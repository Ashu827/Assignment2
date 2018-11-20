package com.ashu.service.supp;

public class MyTestRecord {

		MyDate startdate;
		MyDate enddate;
		int actualdifference;
		
		public MyTestRecord(MyDate startdate,MyDate enddate,int actualdifference){
			super();
			this.startdate=startdate;
			this.enddate=enddate;
			this.actualdifference=actualdifference;
		}

		public MyDate getStartdate() {
			return startdate;
		}

		public void setStartdate(MyDate startdate) {
			this.startdate = startdate;
		}

		public MyDate getEnddate() {
			return enddate;
		}

		public void setEnddate(MyDate enddate) {
			this.enddate = enddate;
		}

		public int getActualdifference() {
			return actualdifference;
		}

		public void setActualdifference(int actualdifference) {
			this.actualdifference = actualdifference;
		}
		
		
		

}
