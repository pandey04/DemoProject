package test.java;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import main.java.ValidateCred;
public class TestCase {
	

	
	@Test
	void testValidateBlankUsername() {
		ValidateCred t = new ValidateCred();		boolean isvalid = t.validate("", "dfgth34567@34");
		Assert.assertEquals(false, isvalid);
		
	}
	
	
	@Test
	void testValidateBlankPassword() {
		ValidateCred t = new ValidateCred();
		boolean isvalid1 = t.validate("Sdf5678", "");
		Assert.assertEquals(false, isvalid1);
		
	}
	
	
	@Test
	void testValidateBlankUnPwd() {
		ValidateCred t = new ValidateCred();
		boolean isvalid2= t.validate("", "");
		Assert.assertEquals(false, isvalid2);
	}
		
		
		@Test
		void testValidateCorrect() {
			ValidateCred t = new ValidateCred();
			boolean isvalid3= t.validate("S34567", "welcome@123");
			Assert.assertEquals(true, isvalid3);
		
	}

}
