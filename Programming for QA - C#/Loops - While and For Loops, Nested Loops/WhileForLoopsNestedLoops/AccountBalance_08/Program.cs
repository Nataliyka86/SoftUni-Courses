namespace AccountBalance_08
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            double totalSum = 0;

            while (input != "End")
            {
                double sum = double.Parse(input);
                if (sum < 0)
                {
                    Console.WriteLine("Decrease: {0:F2}", Math.Abs(sum));
                }
                else
                {
                    Console.WriteLine("Increase: {0:F2}", sum);
                }
                totalSum += sum;
                input = Console.ReadLine();
            }
            Console.WriteLine("Balance: {0:F2}", totalSum);
        }
    }
}