import csbst.testing.fitness.*;
public class BooleanExample {
  public boolean expression(  boolean a,  boolean b,  boolean c){
    NumberCoveredBranches.maintainPathTrace(1,"BooleanExample");
    if (a && b || c) {
      NumberCoveredBranches.maintainPathTrace(2,"BooleanExample");
    }
 else {
      NumberCoveredBranches.maintainPathTrace(3,"BooleanExample");
    }
    return a && b || c;
  }
}
