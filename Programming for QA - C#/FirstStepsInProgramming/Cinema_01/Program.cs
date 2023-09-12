namespace Cinema_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string projection = Console.ReadLine();
            int rows = int.Parse(Console.ReadLine());
            int columns = int.Parse(Console.ReadLine());

            double price = 1.00;

            int countOfPlaces = rows * columns;
            switch (projection)
            {
                case "Premiere":
                    price = 12.00;
                    break;
                case "Normal":
                    price = 7.50;
                    break;
                case "Discount":
                    price = 5.00;
                    break;
            }
            double totalSum = countOfPlaces * price;
            Console.WriteLine("{0:f2} leva", totalSum);
            
        }
    }
}