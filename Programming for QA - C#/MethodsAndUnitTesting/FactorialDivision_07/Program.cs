namespace FactorialDivision_07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n1 = int.Parse(Console.ReadLine());
            int n2 = int.Parse(Console.ReadLine());

            double factorialN1 = CalcFactorial(n1);
            double factorialN2 = CalcFactorial(n2);

            if (factorialN2 == 0 || factorialN1 == 0)
            {
                Console.WriteLine(0);
            }
            else
            { 
            double division = factorialN1 / factorialN2;
            Console.WriteLine(division);            
            }

        }

        public static double CalcFactorial(int n)
        {
            if (n == 0)
            return 0;

            double factorial = 1;
            for (int i = 1; i <= n; i++)
            {
                factorial *= i;
            }
            return factorial;
        }
    }
}