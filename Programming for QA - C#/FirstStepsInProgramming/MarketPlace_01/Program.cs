namespace MarketPlace_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string product = Console.ReadLine();
            string day = Console.ReadLine();
            double price = 0;

            switch (product)
            {
                case "Banana":
                    if (day == "Weekday")
                        price = 2.50;
                    else if (day == "Weekend")
                        price = 2.70;
                    break;
                case "Apple":
                    if (day == "Weekday")
                        price = 1.30;
                    else if (day == "Weekend")
                        price = 1.60;
                    break;
                case "Kiwi":
                    if (day == "Weekday")
                        price = 2.20;
                    else if (day == "Weekend")
                        price = 3.00;
                    break;
            }
            Console.WriteLine("{0:F2}", price);
        }
    }
}