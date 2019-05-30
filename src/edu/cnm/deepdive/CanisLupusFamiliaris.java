package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus {

  private static int instanceCount = 0;

  @Override
  public void hunt() {
    System.out.println("Hunt for play.");
  }

  @Override
  public void speak() {
    System.out.println("Bark, unless I'm a Basenji.");
  }

  public CanisLupusFamiliaris() {
    instanceCount++;
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

}
