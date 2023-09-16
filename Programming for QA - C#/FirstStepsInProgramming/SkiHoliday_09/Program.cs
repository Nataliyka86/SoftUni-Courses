namespace SkiHoliday_09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int days = int.Parse(Console.ReadLine());
            string kindOfRoom = Console.ReadLine();
            string assessment = Console.ReadLine();

            double totalSum = 0.00;
            double price = 0.00;

            switch (kindOfRoom)
            {
                case "room for one person":
                    price = 118.00;
                    break;
                case "apartment":
                    price = 155.00;
                    if (days < 10)
                    {
                       price *= 0.70;
                    }
                    else if (days <= 15)
                    {
                        price *= 0.65;
                    }
                    else if (days > 15)
                    {
                        price *= 0.50;
                    }
                    break;
                case "president apartment":
                    price = 235.00;
                    if (days < 10)
                    {
                        price *= 0.90;
                    }
                    else if (days <= 15)
                    {
                        price *= 0.85;
                    }
                    else if (days > 15)
                    {
                        price *= 0.80;
                    }
                    break;

            }
            totalSum = (days - 1) * price;
            if (assessment == "positive")
            {
                totalSum *= 1.25; 
            }
            else
            {
                totalSum *= 0.90;
            }
            Console.WriteLine("{0:F2}", totalSum);
        }
    }
}