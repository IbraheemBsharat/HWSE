package testpkg;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import swproject1.book;
import swproject1.shoppingcart;

class testTest {
	 shoppingcart s;
	@Before
	 void setUpBeforeClass() throws Exception {
		 s= new shoppingcart();
		
	}

	@Test
	void test1() {
		
		assertTrue(s.prodcount==0);
	}
  @Test
   void test2() {
	   book bok =new book();
	   bok.name="Java Book";
	   bok.price=127;
	   bok.amount=1;
	   s.add(bok);
	   assertTrue(s.prodcount==1);
	   assertTrue(s.total_value==127);
   }
   @Test
   void test3() {
	   book bok =new book();
	   bok.name="Java Book";
	   bok.price=127;
	   bok.amount=1;
	   s.add(bok);
	   bok.name="Web design Book";
	   bok.price=100;
	   bok.amount=1;
	   s.add(bok);
	   assertTrue(s.prodcount==2);
	   assertTrue(s.total_value==227);

   }   
}

