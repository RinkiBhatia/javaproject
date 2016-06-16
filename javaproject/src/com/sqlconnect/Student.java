package com.sqlconnect;

public class Student {
        private int Rollno;
		private String Name;
		private String Standard;
		Student(int Rollno,String Name,String Standard){
			super();
			this.Rollno = Rollno;
			this.Name = Name;
			this.Standard = Standard;
		}
		public int getRollno(){
			return Rollno;
		}
		public void setRollno(int Rollno){
			this.Rollno=Rollno;
		}

		public String getName() {
			return Name;
		}

		public void setName(String Name) {
			this.Name = Name;
		}

		public String getStandard() {
			return Standard;
		}

		public void setStandard(String Standard) {
			this.Standard = Standard;
		}

}


			
				
		
		
		

	


