package Maven.mvn_project;

import org.testng.annotations.Test;



public class Unit_testing {
  @Test(groups= {"santity"})
  public void f1() {
	  System.out.println("Hello");  
  }
  
  @Test(groups= {"santity"})
  public void f2() {
	 System.out.println("Hello1");
  }
  
  @Test(groups= {"regression"})
  public void f3() {
	 
	 System.out.println("Hello2");
  }
  
  @Test(groups= {"regression"})
  public void  f4() {
	 System.out.println("Hello3");
  }
}
