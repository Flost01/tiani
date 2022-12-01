package RobotC;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RobotTest extends Robot{

	@Test
	void testFire() {
		 Arena A=new Arena();
	     Robot r1=new Robot("bob",10);
	     Robot r2=new Robot("foo",10);
	     while(r2.pv!=0 ) {
	        	r1.fire(r2);
	            if(r2.pv!=0) {
	            	r2.fire(r1);
	            }else {
	            	r2.isDead(r1);
	            	
	            }
	        }     
	}
	
	void testToString() {
		
	}

	@Test
	void testIsDead() {
		
	}

}
