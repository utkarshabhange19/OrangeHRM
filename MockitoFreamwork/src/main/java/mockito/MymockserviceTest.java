package mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


;

public class MymockserviceTest {

	
	 @Test
	 public void testmock() {
		 MyserviceProvider mockobj=	Mockito.mock(MyserviceProvider.class);
		 Mockito.when(mockobj.add(30, 40)).thenReturn(70);
		 assertEquals(70, mockobj.add(30, 40));
	 
	 
	 
	 }
}
