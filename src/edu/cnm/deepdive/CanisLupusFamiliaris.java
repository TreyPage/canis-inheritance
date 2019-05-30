package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus implements Trainable{

  private static int instanceCount = 0;

  @Override
  public void perform() {
    System.out.println("Does tricks!");
  }

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
