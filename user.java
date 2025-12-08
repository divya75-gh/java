package oops.Inheitance;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      guest g= new guest();
      g.read();
      System.out.println();
      developer dev = new developer();
      dev.read();
      dev.write();
      System.out.println();
      admin ad = new admin();
      ad.read();
      ad.write();
      ad.manage();
	}

}
