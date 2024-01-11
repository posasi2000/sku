package net.hb.guest;


public class GuestBean {
	private  int empNo;
    private  String name="dong";
  		  
  public String getName() {	return name;}
  public void setName(String name) {	this.name =name;}

  public int getEmpNo() {	return empNo;}
  public void setEmpNo(int empNo) {	this.empNo = empNo;}

   public void print() {
	  System.out.println( getEmpNo());
	  System.out.println( getName());
   }
   
   public String toString() {
	   return  getName();
   }
}//class END
