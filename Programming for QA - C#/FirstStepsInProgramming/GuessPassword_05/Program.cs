namespace GuessPassword_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();
            string password = "s3cr3t!";

            if (input == password)
            {
                Console.WriteLine("Welcome");
            }
            else
            {
                Console.WriteLine("Wrong password!");
            }
        }
    }
}