
public class TechMagazineState implements MagazineState {
	MagazineContext mc;

	  public TechMagazineState(MagazineContext mc) {
		  this.mc = mc;
		  }

  @Override
  public void read() {
  System.out.println("Reading Tech Magazine");	
  }

}