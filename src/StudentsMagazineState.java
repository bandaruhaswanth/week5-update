
public class StudentsMagazineState implements MagazineState {
	MagazineContext mc;

	  public StudentsMagazineState(MagazineContext mc) {
		  this.mc = mc;
		  }

  @Override
  public void read() {
  System.out.println("Reading Students Magazine");	
  }

}