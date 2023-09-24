namespace Vacation_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            double availableMoney = double.Parse(Console.ReadLine());
            int countConsecutiveDays = 0;
            int days = 0;

            while (availableMoney < budget)
            {
                string actionType = Console.ReadLine();
                double amount = double.Parse(Console.ReadLine());
                switch (actionType)
                {
                    case "spend":
                        availableMoney -= amount;
                        countConsecutiveDays++;
                        break;
                    case "save":
                        availableMoney += amount;
                        countConsecutiveDays = 0;
                        break;
                }
                if (availableMoney < 0)
                {
                    availableMoney = 0;
                }
                days++;
                if (countConsecutiveDays == 5)
                {
                    break;
                }
            }
            if (countConsecutiveDays == 5)
            {
                Console.WriteLine("You can't save the money.");
                Console.WriteLine($"{days}");
            }
            else
            {
                Console.WriteLine($"You saved the money for {days} days.");
            }
        }
    }
}