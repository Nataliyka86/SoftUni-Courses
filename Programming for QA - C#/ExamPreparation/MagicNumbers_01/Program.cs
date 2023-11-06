namespace MagicNumbers_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            bool hasNumber = false;

            for (int i = 1; i <= n; i++)
            {
                if (AllDigitsArePrimeNumbers(i) && SumAllDigitsAreDivisibleBy2(i))
                {
                    Console.Write(i + " ");
                    hasNumber = true;

                }
            }
            if (!hasNumber)
                Console.WriteLine("no");
        }

        public static bool AllDigitsArePrimeNumbers(int n)
        {
            while (n > 0)
            {
                int currentDigit = n % 10;
                if (currentDigit == 0 || currentDigit == 1 || currentDigit == 4 || currentDigit == 6 || currentDigit == 8 || currentDigit == 9)
                {
                    return false;
                }
                n /= 10;
            }
            return true;
        }

        public static bool SumAllDigitsAreDivisibleBy2(int n)
        {
            int sum = 0;
            while (n > 0)
            {
                int currentDigit = n % 10;
                sum += currentDigit;
                n /= 10;
            }
            if (sum % 2 == 0)
            {
                return true;
            }
            else
                return false;
        }
    }
}