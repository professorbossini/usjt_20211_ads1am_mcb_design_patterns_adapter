import java.util.LinkedList;
import java.util.List;

public class Principal {
  public static void main(String[] args) throws Exception {
    //List <Object> aves = new LinkedList<Object>();
    List <Duck> patos = new LinkedList<Duck>();

    patos.add(new Donald());
    patos.add(new Patolino());
    //patos.add(new PeruSelvagem());
    patos.add(new TurkeyAdapter(new PeruSelvagem()));
    //patos.add(new PeruDoMato());
    patos.add(new TurkeyAdapter(new PeruDoMato()));
    patos.add(new GansoAdapter(new Ganso()));

    while (true){
      //for (Object ave : aves){
      for (Duck pato : patos){
        pato.fly();
        pato.quack();
        // if (ave instanceof Duck){
        //   ((Duck)ave).quack();
        //   ((Duck)ave).fly();
        // }
        // else if(ave instanceof Turkey){
        //   ((Turkey)ave).gobble();
        //   ((Turkey)ave).fly();
        // }
  
      }
      Thread.sleep(5000);
      System.out.println ("==================================");
    }
  }
}
