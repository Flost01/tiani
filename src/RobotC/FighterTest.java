package RobotC;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FighterTest {

	@Test
	void testFire() {
		Fighter f1=new Fighter("Ange",10);
    	Fighter f2=new Fighter("Florinda",10);
    	
    	 System.out.println("Debut du combat Humain");
    	f1.fire(f2);
    	f2.fire(f1);
	}

	@Test
	void testFighterStringInt() {
		Fighter f1=new Fighter("Ange",10);
    	Fighter f2=new Fighter("Florinda",10);
    	Fighter F=new Fighter();
		F.fight(f1,f2);
	}
    void testToString() {
		
	}
}
