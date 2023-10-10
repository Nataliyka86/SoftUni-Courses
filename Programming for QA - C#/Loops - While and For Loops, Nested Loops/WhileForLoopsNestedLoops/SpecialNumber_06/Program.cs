namespace SpecialNumber_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());
            bool special = true;
            int currentNumber = number;

            while (currentNumber > 0)
            {
                int digit = currentNumber % 10;
                if (digit == 0)
                {
                    currentNumber = currentNumber / 10;
                    continue;
                }
                if (number % digit != 0)
                {
                    special = false;
                    break;
                }
                currentNumber = currentNumber / 10;
            }
            if (special)
                Console.WriteLine($"{number} is special");
            else
                Console.WriteLine($"{number} is not special");
        }
    }
}