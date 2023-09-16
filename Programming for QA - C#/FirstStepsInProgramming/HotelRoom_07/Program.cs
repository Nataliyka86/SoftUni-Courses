namespace HotelRoom_07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string month = Console.ReadLine();
            int days = int.Parse(Console.ReadLine());
            double totalSumStudio = 0.00;
            double totalSumApartment = 0.00;

            switch (month)
            {
                case "May":
                case "October":
                    totalSumStudio = days * 50;
                    totalSumApartment = days * 65;
                    if (days > 7 && days <= 14)
                    {
                        totalSumStudio = totalSumStudio - (totalSumStudio * 0.05);
                    }
                    else if (days > 14)
                    {
                        totalSumStudio = totalSumStudio - (totalSumStudio * 0.30);
                    }
                    break;
                case "June":
                case "September":
                    totalSumStudio = days * 75.20;
                    totalSumApartment = days * 68.70;
                    if (days > 14)
                    {
                        totalSumStudio = totalSumStudio - (totalSumStudio * 0.20);
                    }
                    break;
                case "July":
                case "August":
                    totalSumStudio = days * 76;
                    totalSumApartment = days * 77;
                    break;

            }
            if (days > 14)
            {
                totalSumApartment = totalSumApartment - (totalSumApartment * 0.10);
            }
            Console.WriteLine("Apartment: {0:F2} lv.", totalSumApartment);
            Console.WriteLine("Studio: {0:F2} lv.", totalSumStudio);
        }
    }
}