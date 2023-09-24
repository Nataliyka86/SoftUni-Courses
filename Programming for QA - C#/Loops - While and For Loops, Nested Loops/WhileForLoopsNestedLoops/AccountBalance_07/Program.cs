namespace AccountBalance_07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string command = Console.ReadLine();
            double totalBalance = 0.00;


            while (command != "NoMoreMoney")
            {
                double amount = double.Parse(command);
                if (amount < 0)
                {
                    Console.WriteLine("Invalid operation!");
                    break;
                }
                totalBalance += amount;
                Console.WriteLine($"Increase: {amount:F2}");
                command = Console.ReadLine();
            }
            Console.WriteLine($"Total: {totalBalance:F2}");
        }
    }
}