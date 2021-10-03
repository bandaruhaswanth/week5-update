
public class EntertainmentMagazineState implements MagazineState {
	MagazineContext mc;

	  public EntertainmentMagazineState(MagazineContext mc) {
		  this.mc = mc;
		  }

  @Override
  public void read() {
  System.out.println("Reading Entertainment Magazine");	
  }

}