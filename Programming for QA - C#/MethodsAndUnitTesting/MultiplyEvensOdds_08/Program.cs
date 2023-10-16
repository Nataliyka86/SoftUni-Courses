namespace MultiplyEvensOdds_08
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int absNumber = Math.Abs(n);
            int multiply = GetMultipleOfEvenAndOdds(GetSumOfOddDigits(absNumber), GetSumOfEvenDigits(absNumber));
            Console.WriteLine(multiply);

        }

        public static int GetSumOfEvenDigits(int n)
        {
            int sumEven = 0;
            while (n > 0)
            {
                int currentDigit = n % 10;
                if (currentDigit % 2 == 0)
                {
                    sumEven += currentDigit;
                }
                n /= 10;
            }
            return sumEven;
        }

        public static int GetSumOfOddDigits(int n)
        {
            int sumOdd = 0;
            while (n > 0)
            {
                int currentDigit = n % 10;
                if (currentDigit % 2 != 0)
                {
                    sumOdd += currentDigit;
                }
                n /= 10;
            }
            return sumOdd;
        }

        public static int GetMultipleOfEvenAndOdds(int odd, int even)
        {
            return odd * even;
        }
    }
    
}