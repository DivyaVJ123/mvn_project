package Maven.mvn_project;

import org.testng.annotations.Test;

public class Test_Ng2 {
	@Test(priority=1)
	  public void c() {
		 System.out.println("java1");
	  }
	  @Test(priority=2)
	  public void a() {
		 System.out.println("java2");
	  }
	  @Test(priority=3)
	  public void  b() {
		 System.out.println("java3");
	  }
}