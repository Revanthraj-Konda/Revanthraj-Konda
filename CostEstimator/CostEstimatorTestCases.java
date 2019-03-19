/**
 * 
 * @author Revanthraj Konda
 *
 */
class CostEstimatorTestCases {

	@Test
	public void TestCostEstimator() {
		CostEstimator ce;
		ce = new CostEstimator('A', 400, false);
		assertEquals(480000.0, ce.findCost());
		ce = new CostEstimator('B', 200, false);
		assertEquals(300000, ce.findCost());
		ce = new CostEstimator('C', 350, true);
		assertEquals(875000.0, ce.findCost());
		ce = new CostEstimator('C', 400, false);
		assertEquals(720000.0, ce.findCost());
		
	}

}