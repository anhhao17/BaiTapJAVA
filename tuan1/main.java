package example.com.baitap9;

public class main {

	public static void main(String[] args) {
		String myStr1 = "lop    hoc java. bat dau luc muoi hai gio";

		String  myStr2= myStr1.trim().replaceAll("\s+", " ");
		try {
			myStr2= myStr2.substring(0,1).toUpperCase()+myStr2.substring(1);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Chua Nhap Chuoi !!");
		}
		
		
		for(int i=0;i<myStr2.length();i++) {
			if(myStr2.charAt(i)== ' ') {
				myStr2=myStr2.substring(0,i+1)+myStr2.substring(i+1,i+2).toUpperCase()+myStr2.substring(i+2);
			}
		}
	    System.out.println(myStr2);
	}

}
