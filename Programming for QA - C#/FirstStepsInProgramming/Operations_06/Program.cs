namespace Operations_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n1 = int.Parse(Console.ReadLine());
            int n2 = int.Parse(Console.ReadLine());
            string symbol = Console.ReadLine();
            double totalSum = 0;
            string result = "";

            switch (symbol)
            {
                case "/":

                    if (n2 == 0)
                    {
                        Console.WriteLine("Cannot divide {0} by zero", n1);
                        break;
                    }
                    totalSum = n1 * 1.00 / n2;
                    Console.WriteLine("{0} / {1} = {2:F2}", n1, n2, totalSum);
                    break;
                case "%":

                    if (n2 == 0)
                    {
                        Console.WriteLine("Cannot divide {0} by zero", n1);
                        break;
                    }
                    totalSum = n1 % n2;
                    Console.WriteLine("{0} % {1} = {2:F0}", n1, n2, totalSum);
                    break;
                case "+":
                    totalSum = n1 + n2;
                    if (totalSum % 2 == 0)
                    {
                        result = "even";
                    }
                    else
                    {
                        result = "odd";
                    }
                    Console.WriteLine("{0} + {1} = {2:F0} - {3}", n1, n2, totalSum, result);
                    break;
                case "-":
                    totalSum = n1 - n2;
                    if (totalSum % 2 == 0)
                    {
                        result = "even";
                    }
                    else
                    {
                        result = "odd";
                    }
                    Console.WriteLine("{0} - {1} = {2:F0} - {3}", n1, n2, totalSum, result);
                    break;
                case "*":
                    totalSum = n1 * n2;
                    if (totalSum % 2 == 0)
                    {
                        result = "even";
                    }
                    else
                    {
                        result = "odd";
                    }
                    Console.WriteLine("{0} * {1} = {2:F0} - {3}", n1, n2, totalSum, result);
                    break;

            }
        }
    }
}