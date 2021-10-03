
public class SportMagazineState implements MagazineState {
	MagazineContext mc;

	  public SportMagazineState(MagazineContext mc) {
		  this.mc = mc;
		  }

  @Override
  public void read() {
  System.out.println("Reading Sport Magazine");	
  }

}