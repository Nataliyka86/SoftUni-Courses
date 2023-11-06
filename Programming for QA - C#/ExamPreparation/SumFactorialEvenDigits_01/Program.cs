namespace SumFactorialEvenDigits_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());

            int sumOfAllFactorials = 0;

            while (number > 0)
            {
                int currentDigit = number % 10;
                if (currentDigit % 2 == 0)
                {
                    sumOfAllFactorials += SumFactorial(currentDigit);
                }
                number /= 10;
            }

            Console.WriteLine(sumOfAllFactorials);

        }

        public static int SumFactorial(int n)
        {
            int factorial = 1;
            for (int i = 1; i <= n; i++)
            {
                factorial *= i;
            }
            return factorial;
        }
    }
}