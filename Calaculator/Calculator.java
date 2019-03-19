/*
*@author Revanthraj Konda
*/

class Calculator{
	/*
	*Method that preform Arithmetic operation based on parameters
	*@param num1
	*@param num2
	*@param operator
	*/
	public int operation(int num1,int num2,String operator)
	{
		switch(operator)
		{
			case "Addition":
			{
				Addition(num1,num2);
				break;
			}
			case "Division":
			{
				Division(num1,num2);
				break;
			}
			case "Multiplication":
			{
				Multiplication(num1,num2);
				break;
			}
			default:
			{
				return -1;
			}
		}
		int Addition(int num1,int num2)
		{
			return num1+num2;
		}
		int Division(int num1,int num2)
		{
			return num1/num2;
		}
		int Multiplication(int num1,int num2)
		{
			return num1*num2;
		}
	}
