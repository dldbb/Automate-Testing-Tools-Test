/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 02 21:10:03 GMT 2019
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IfElseExample_ESTest extends IfElseExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IfElseExample ifElseExample0 = new IfElseExample();
      String string0 = ifElseExample0.ifPositive(0);
      assertEquals("Zero", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IfElseExample ifElseExample0 = new IfElseExample();
      String string0 = ifElseExample0.ifPositive(1375);
      assertEquals("Positive", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IfElseExample ifElseExample0 = new IfElseExample();
      String string0 = ifElseExample0.ifPositive((-4709));
      assertEquals("Negative", string0);
  }
}
