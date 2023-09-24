namespace SumPrimeNonPrimeN_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            int sumPrimeNumbers = 0;
            int sumNonPrimeNumbers = 0;

            while (input != "stop")
            {
                int currentNumber = int.Parse(input);
                if (currentNumber < 0)
                {
                    Console.WriteLine("Number is negative.");
                    input = Console.ReadLine();
                    continue;
                }

                int divisors = 0;
                for (int i = 1; i <= currentNumber; i++)
                {
                    if (currentNumber % i == 0)
                    {
                        divisors++;
                    }
                }
                if (divisors == 2)
                {
                    sumPrimeNumbers += currentNumber;
                }
                else
                {
                    sumNonPrimeNumbers += currentNumber;
                }

                input = Console.ReadLine();
            }
            Console.WriteLine($"Sum of all prime numbers is: {sumPrimeNumbers}");
            Console.WriteLine($"Sum of all non prime numbers is: {sumNonPrimeNumbers}");
        }
    }
}