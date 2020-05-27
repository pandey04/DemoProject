import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class TestCase {
	

	@SuppressWarnings("deprecation")
	@Test
	void testValidateBlankUsername() {
		ValidateCred t = new ValidateCred();
		boolean isvalid = t.validate("", "dfgth34567@34");
		Assert.assertEquals(false, isvalid);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void testValidateBlankPassword() {
		ValidateCred t = new ValidateCred();
		boolean isvalid1 = t.validate("Sdf5678", "");
		Assert.assertEquals(false, isvalid1);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	void testValidateBlankUnPwd() {
		ValidateCred t = new ValidateCred();
		boolean isvalid2= t.validate("", "");
		Assert.assertEquals(false, isvalid2);
	}
		
		@SuppressWarnings("deprecation")
		@Test
		void testValidateCorrect() {
			ValidateCred t = new ValidateCred();
			boolean isvalid3= t.validate("S34567", "welcome@123");
			Assert.assertEquals(true, isvalid3);
		
	}

}
