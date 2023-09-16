namespace FishingBoat_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int budget = int.Parse(Console.ReadLine());
            string season = Console.ReadLine();
            int countFishers = int.Parse(Console.ReadLine());
            double totalSum = 0.00;

            switch (season)
            {
                case "Spring":
                    totalSum = 3000;
                    break;
                case "Summer":
                case "Autumn":
                    totalSum = 4200;
                    break;
                case "Winter":
                    totalSum = 2600;
                    break;
            }
            if (countFishers <= 6)
            {
                totalSum = totalSum - (totalSum * 0.10);
            }
            else if (countFishers <= 11)
            {
                totalSum = totalSum - (totalSum * 0.15);
            }
            else
            {
                totalSum = totalSum - (totalSum * 0.25);
            }
            if (!season.Equals("Autumn") && countFishers % 2 == 0)
            {
                totalSum = totalSum - (totalSum * 0.05);
            }
            if (budget >= totalSum)
            {
                Console.WriteLine("Yes! You have {0:F2} leva left.", budget - totalSum);
            }
            else
            {
                Console.WriteLine("Not enough money! You need {0:F2} leva.", totalSum - budget);
            }
        }
    }
}