namespace VacationExpenses_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string season = Console.ReadLine();
            string accommodation = Console.ReadLine();
            int countDays = int.Parse(Console.ReadLine());

            double price = 0;
            double discount = 0;

            switch (season)
            {
                case "Spring":
                    discount = 0.20;
                    if (accommodation == "Hotel")
                        price = 30;
                    else
                        price = 10;
                    break;
                case "Summer":
                    if (accommodation == "Hotel")
                        price = 50;
                    else
                        price = 30;
                    break;
                case "Autumn":
                    discount = 0.30;
                    if (accommodation == "Hotel")
                        price = 20;
                    else
                        price = 15;
                    break;
                case "Winter":
                    discount = 0.10;
                    if (accommodation == "Hotel")
                        price = 40;
                    else
                        price = 10;
                    break;
            }
            double expenses = countDays * price;
            expenses = expenses - (expenses * discount);
            Console.WriteLine($"{expenses:F2}");

        }
    }
}