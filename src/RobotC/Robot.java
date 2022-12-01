package RobotC;

public class Robot{
    protected String nomR;
    protected int pv;
    public Robot(String bob,int pv){
        this.pv = 10;
        this.nomR=bob;}

    public Robot() {
        this.pv = 10;
        this.nomR="";
    }

    public void setPv(int p){
        this.pv=p;}

    public int getPv() {
        return pv;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public String getNomR() {
        return nomR;
    }
    public Robot fire(Robot r){
    	r.pv-=2;
    	System.out.println("Robot "+r.nomR+" a ete touche par "+this.nomR+" :"+r.pv);
    	return r;
    }
    public Robot isDead(Robot n){
     if(n.pv==0) {
    	 System.out.println("Robot "+n.nomR+" is dead.");
         System.out.println("Fin du combat victoire de "+this.nomR);
     }else if(this.pv==0) {
    	 System.out.println("Robot "+this.nomR+" is dead.");
         System.out.println("Fin du combat victoire de "+n.nomR);
     }
        
        return n;
    }
   public String toString(String s) {
	   return s;
   }
    public static void main(String[] args){
        Robot bob=new Robot("bob",10);
        System.out.println("Robot :"+bob);
    }


}

