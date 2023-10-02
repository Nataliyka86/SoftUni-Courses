namespace CoffeeShop_11
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string drink = Console.ReadLine();
            string extra = Console.ReadLine();
            double price = 0.00;

            if (drink == "coffee")
                price += 1.00;
            else if (drink == "tea")
                price += 0.60;
            if (extra == "sugar")
                price += 0.40;
            Console.WriteLine("Final price: ${0:F2}", price);

        }
    }
}