package RobotC;
import java.util.Random;

public class Fighter extends Robot{
	public Fighter(String bob,int pv){
        super(bob,pv);
       }

    public Fighter() {
       super();
    }
    public Robot fire(Robot r){
    	if(nextBoolean()==true) {
        	r.pv=r.pv;
        	System.out.println(r.nomR+" a rate par "+this.nomR+" : "+r.pv);
        }else if(nextBoolean()==false) {
        	r.pv-=2;
        	System.out.println(r.nomR+" a ete touche par "+this.nomR+" : "+r.pv);
        
    }
        
        return r;
     }
    private boolean nextBoolean() {
    	Random rand=new Random();
    	boolean seed = rand.nextBoolean();
    	return seed;
    }
    public static void main(String[] args) {
    	Fighter f1=new Fighter("Ange",10);
    	Fighter f2=new Fighter("Florinda",10);
    	Fighter F=new Fighter();
    	 System.out.println("Debut du combat Humain");
    	f1.fire(f2);
    	f2.fire(f1);
    	 F.fight(f1,f2);
    }
	void fight(Fighter a,Fighter b) {
		
		 while(a.pv!=0 && b.pv!=0 ) {
			 if(a.pv!=0) {
				 a.fire(b);
				 a.isDead(b);
			 }
			 if(b.pv!=0) {
				 b.fire(a);
				 b.isDead(a);}
		 }
		 
	}
}
