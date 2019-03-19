/**
 * @author Revanthraj Konda
 * 
 *
 */
 
 public class SimpleCompoundInterestUnitTestCases
 {
	 
	@Test
	public void UnitTestCaseSimpleInterest() {
		SimpleCompoundInterest simplecompoundinterest;
		 simpleInterest = new SimpleCompoundInterest(20202, 2.5f, 3);
		assertEquals(151515.0, simpleInterest.SimpleInterest());
		simpleInterest = new SimpleCompoundInterest(20300, 3.7f, 5);
		assertEquals(375550.0, simpleInterest.SimpleInterest());
	}
	@Test
	void UnitTestCaseCompoundIntrest() {
		SimpleCompoundInterest compoundInterest;
		compoundInterest = new SimpleCompoundInterest(20202, 2.5f, 3);
		assertEquals(21755.342888139312, compoundInterest.CompoundInterest());
		compoundInterest = new SimpleCompoundInterest(20202, 2.5f, 5);
		assertEquals(22856.7060585414, compoundInterest.CompoundInterest());
	}
 }