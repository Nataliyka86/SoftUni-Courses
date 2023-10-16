namespace UniquePinCodes_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int max1 = int.Parse(Console.ReadLine());
            int max2 = int.Parse(Console.ReadLine());
            int max3 = int.Parse(Console.ReadLine());

            for (int i = 1; i <= max1; i++)
            {
                if (i % 2 == 0)
                {
                    for (int j = 2; j <= max2; j++)
                    {
                        if (PrimeNumber(j) == true)
                        {
                            for (int k = 1; k <= max3; k++)
                            {
                                if (k % 2 == 0)
                                    Console.WriteLine("{0}{1}{2}", i, j, k);

                            }

                        }
                    }

                }
            }
        }

        public static bool PrimeNumber(int n)
        {
            bool isPrime = true;
            int divisors = 0;
            for (int i = 1; i < n; i++)
            {
                if (n % i == 0)
                {
                    divisors++;
                    if (divisors > 1)
                    {
                        isPrime = false;
                        break;
                    }
                }
            }
            return isPrime;
        }
    }
    
}