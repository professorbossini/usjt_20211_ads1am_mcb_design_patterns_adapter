public class TurkeyAdapter implements Duck {

  Turkey peru;
  public TurkeyAdapter (Turkey peru){
    this.peru = peru;
  }
  
  @Override
  public void fly() {
    peru.fly();
    
  }

  @Override
  public void quack() {
    peru.gobble();    
  }
}
