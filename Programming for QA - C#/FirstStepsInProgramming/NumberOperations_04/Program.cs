namespace NumberOperations_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double n1 = double.Parse(Console.ReadLine());
            double n2 = double.Parse(Console.ReadLine());
            string mathOperator = Console.ReadLine();

            double result = 0;

            switch (mathOperator)
            {
                case "+":
                    result = n1 + n2;
                    break;
                case "-":
                    result = n1 - n2;
                    break;
                case "*":
                    result = n1 * n2;
                    break;
                case "/":
                    result = n1 / n2;
                    break;
            }
            Console.WriteLine("{0} {1} {2} = {3:F2}", n1, mathOperator, n2, result);
        }
    }
}