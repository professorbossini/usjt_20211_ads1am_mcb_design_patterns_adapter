public class GansoAdapter implements Duck {

  public GansoAdapter (Ganso ganso){
    this.ganso = ganso;
  }
  Ganso ganso;
  @Override
  public void fly() {
    ganso.fly();
    
  }

  @Override
  public void quack() {
    ganso.howk();
    
  }
  
}
