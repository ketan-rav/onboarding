import static org.junit.Assert.*;

import org.amdocs.Camera;
import org.amdocs.Mobile;
import org.junit.Test;
import org.mockito.Mockito;

public class MobileTest {

	@Test
	public void testStartPhotoAppWhenCameraOnFunctionsNormally() {
		
		//mocking- creating a dummy camera object with no original code
		
		Camera mockedCamera = Mockito.mock(Camera.class);
		
		//stubbing - hard coding the response of dependent method
		
		Mockito.when(mockedCamera.on()).thenReturn(true);
		
		//Dependency Injection
		Mobile mobile = new Mobile(mockedCamera);
		
		boolean actualResponse = mobile.startPhotoApp();
		boolean expectedResponse = true;
		
		assertEquals( expectedResponse,actualResponse );
	
		//verify the camera.on() method invoking within the startPhotoApp() method
		Mockito.verify(mockedCamera, Mockito.times(1)) .on();
	}

}
