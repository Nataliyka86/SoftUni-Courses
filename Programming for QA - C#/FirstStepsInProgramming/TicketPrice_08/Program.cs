namespace TicketPrice_08
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();

            if (input == "student")
            {
                Console.WriteLine("$1.00");
            }
            else if (input == "regular")
            {
                Console.WriteLine("$1.60");
            }
            else 
            { 
                Console.WriteLine("Invalid ticket type!");
            }
        }
    }
}