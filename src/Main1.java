
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
		ThreadThing tt = new ThreadThing(i);
		
		tt.start();
		}
	}

}
