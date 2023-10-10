namespace SumDigitsCalculato_07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();

            while (input != "End")
            {
                int number = int.Parse(input);
                int sum = 0;
                for (int i = number; i > 0; i /= 10)
                {
                    int currentDigit = i % 10;
                    sum += currentDigit;
                }
                Console.WriteLine($"Sum of digits = {sum}");
                input = Console.ReadLine();
            }

            Console.WriteLine("Goodbye");

            //string input = Console.ReadLine();

            //while (input != "End")
            //{
            //    int sum = 0;
            //    for (int i = 0; i < input.Length; i++)
            //    {
            //        char symbol = input[i];
            //        string symbolToString = symbol.ToString();
            //        int currentNumber = int.Parse(symbolToString);
            //        sum += currentNumber;
            //    }
            //    Console.WriteLine($"Sum of digits = {sum}");
            //    input = Console.ReadLine();
            //}

            //Console.WriteLine("Goodbye");
        }
    }
}