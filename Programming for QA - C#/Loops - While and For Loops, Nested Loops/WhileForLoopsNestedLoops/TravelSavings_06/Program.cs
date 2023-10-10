namespace TravelSavings_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string destination = Console.ReadLine();

            while (destination != "End")
            {
                double budget = double.Parse(Console.ReadLine());
                double totalSum = 0;
                while (totalSum < budget)
                {
                    double currentSum = double.Parse(Console.ReadLine());
                    totalSum += currentSum;
                    Console.WriteLine($"Collected: {totalSum:F2}");
                }
                Console.WriteLine($"Going to {destination}!");

                destination = Console.ReadLine();
            }
        }
    }
}