package RobotC;

public class Arena extends Robot{
    public Arena(String bob,int p) {
        super(bob,p);
    }

    public Arena() {
        super();
    }

    public void fight(){
        System.out.println("Debut du combat Robot");
    }
    public Robot fire(Robot r){
       Robot R=super.fire(r);
       return R;
    }
    public static void main(String[] args){
        Arena A=new Arena();
        Robot r1=new Robot("bob",10);
        Robot r2=new Robot("foo",10);
   
        A.fight();
        
        while(r2.pv!=0 ) {
        	r1.fire(r2);
            if(r2.pv!=0) {
            	r2.fire(r1);
            }else {
            	r2.isDead(r1);
            	
            }
        }       
    }
}

