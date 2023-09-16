namespace Journey_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            string season = Console.ReadLine();
            string destination = "";
            string kindOfPlace = "";
            double totalSum = 0.00;


            if (budget <= 100)
            {
                destination = "Bulgaria";
                switch (season)
                {
                    case "summer":
                        totalSum = budget * 0.30;
                        kindOfPlace = "Camp";
                        break;
                    case "winter":
                        totalSum = budget * 0.70;
                        kindOfPlace = "Hotel";
                        break;
                }
            }
            else if (budget <= 1000)
            {
                destination = "Balkans";
                switch (season)
                {
                    case "summer":
                        totalSum = budget * 0.40;
                        kindOfPlace = "Camp";
                        break;
                    case "winter":
                        totalSum = budget * 0.80;
                        kindOfPlace = "Hotel";
                        break;
                }
            }
            else
            {
                destination = "Europe";
                totalSum = budget * 0.90;
                kindOfPlace = "Hotel";
            }

            Console.WriteLine("Somewhere in {0}", destination);
            Console.WriteLine("{0} - {1:F2}", kindOfPlace, totalSum);

        }
    }
}