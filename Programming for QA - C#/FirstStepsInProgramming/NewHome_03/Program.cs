namespace NewHome_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string flower = Console.ReadLine();
            int countOfFlowers = int.Parse(Console.ReadLine());
            int budget = int.Parse(Console.ReadLine());
            double totalSum = 0.00;


            switch (flower)
            {
                case "Roses":
                    totalSum = countOfFlowers * 5.00;
                    if (countOfFlowers > 80) 
                    {
                        totalSum = totalSum - (totalSum * 0.10); 
                    }
                    break;
                case "Dahlias":
                    totalSum = countOfFlowers * 3.80;
                    if (countOfFlowers > 90)
                    {
                        totalSum = totalSum - (totalSum * 0.15);
                    }
                    break;
                case "Tulips":
                    totalSum = countOfFlowers * 2.80;
                    if (countOfFlowers > 80)
                    {
                        totalSum = totalSum - (totalSum * 0.15);
                    }
                    break;
                case "Narcissus":
                    totalSum = countOfFlowers * 3.00;
                    if (countOfFlowers < 120)
                    {
                        totalSum = totalSum + (totalSum * 0.15);
                    }
                    break;
                case "Gladiolus":
                    totalSum = countOfFlowers * 2.50;
                    if (countOfFlowers < 80)
                    {
                        totalSum = totalSum + (totalSum * 0.20);
                    }
                    break;

            }
            if (budget >= totalSum)
            {
                Console.WriteLine("Hey, you have a great garden with {0} {1} and {2:F2} leva left.", countOfFlowers, flower, budget - totalSum);
            }
            else 
            {
                Console.WriteLine("Not enough money, you need {0:F2} leva more.", totalSum - budget);
            }
        }
    }
}