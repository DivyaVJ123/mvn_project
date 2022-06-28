package Maven.mvn_project;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Dependency {
  @Test
  public void method1() {
	  Assert.fail();
	  System.out.println("java"); 
  }
  
  @Test(dependsOnMethods= {"method1"})
  public void method2() {
		 System.out.println("java1");
	  }
	  @Test(dependsOnMethods= {"method2"})
	  public void method3() {
		 
		 System.out.println("java2");
	  }
	  @Test(dependsOnMethods= {"method1"},alwaysRun=true)
	  public void  method4() {
		 System.out.println("java3");
	  }
}
