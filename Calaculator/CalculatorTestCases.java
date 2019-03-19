/*
* Unit test cases for Calculator
* @author Revanthraj Konda
*/
class CalculatorTestCases
{

	public void testOperation() {
		Calculator c = new Calculator();
		assertEquals(8, c.Operation(5,3,"Addition"));
		assertEquals(2, c.Operation(5,3,"Subtraction"));
		assertEquals(15, c.Operation(5,3,"Multiplication"));
	}
}