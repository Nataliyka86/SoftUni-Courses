namespace CinemaTickets_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string movie = Console.ReadLine();
            int standardTickets = 0;
            int studentTickets = 0;
            int kidTickets = 0;

            while (movie != "Finish")
            {
                int seats = int.Parse(Console.ReadLine());
                string input = Console.ReadLine();
                int countTickets = 0;
                bool isFinished = false;
                while (input != "End")
                {
                    if (input == "Finish")
                    {
                        isFinished = true;
                        break;
                    }
                    switch (input)
                    {
                        case "standard":
                            standardTickets++;
                            break;
                        case "student":
                            studentTickets++;
                            break;
                        case "kid":
                            kidTickets++;
                            break;
                    }
                    countTickets++;
                    input = Console.ReadLine();
                }
                Console.WriteLine("{0} - {1:F2}% full.", movie, countTickets * 1.00 / seats * 100);
                if (isFinished)
                {
                    break;
                }

                movie = Console.ReadLine();
            }
            int allPurchaseTickets = standardTickets + studentTickets + kidTickets;
            Console.WriteLine("Total tickets: {0}", allPurchaseTickets);
            Console.WriteLine("{0:F2}% student tickets.", studentTickets * 1.00 / allPurchaseTickets * 100);
            Console.WriteLine("{0:F2}% standard tickets.", standardTickets * 1.00 / allPurchaseTickets * 100);
            Console.WriteLine("{0:F2}% kids tickets.", kidTickets * 1.00 / allPurchaseTickets * 100);
        }
    }
}