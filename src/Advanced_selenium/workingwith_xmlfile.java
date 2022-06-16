package Advanced_selenium;

import org.testng.annotations.Test;

public class workingwith_xmlfile {
@Test(dependsOnMethods="sports")
public void food(){
	System.out.println("chapati");
	System.out.println("roti");
}
@Test(groups="regression")
public void sports(){
	System.out.println("cricket");
	System.out.println("football");
}
@Test(groups="smoke")
public void movies(){
	System.out.println("KGF-2");   
	System.out.println("Spider man no way home");
}
}
