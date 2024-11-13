package turnAndFlag;

public class myThread extends Thread{
	public int id;
	public static int co=1;
	public volatile static int turn=0;
	public volatile static boolean[] flag = new boolean[2];
	
	//constructor
	public myThread(int id) {
		this.id=id;
	}
	
	//run
	public void run() {
		for(int i=0;i<5000;i++) {

			System.out.println(co);
			//entry section
			flag[this.id]= true;
			turn=1-this.id;
		
			while(flag[1-this.id]&&turn==1-this.id) {
				
			}
			//critic section
				co++;
				flag[this.id]=false;
		}
	}
}
