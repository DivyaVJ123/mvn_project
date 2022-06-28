import org.testng.annotations.Test;

public class NewTest7 {
	@Test(priority=1)
	  public void c() {
		 System.out.println("hi1");
	  }
	  @Test(priority=2)
	  public void a() {
		 System.out.println("hi2");
	  }
	  @Test(priority=3)
	  public void  b() {
		 System.out.println("hi3");
	  }
}
