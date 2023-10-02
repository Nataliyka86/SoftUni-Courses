namespace InvalidNumber_08
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            bool isValid = (n >= 100 && n <= 200) || n == 0;

            if (!isValid)
                Console.WriteLine("invalid");
        }
    }
}