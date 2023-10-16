namespace SignOfIntegerNumbers_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            PrintTheSign(n);

        }

        public static void PrintTheSign(int number)
        {
            if (number == 0)
                Console.WriteLine($"The number {number} is zero.");
            else if (number > 0)
                Console.WriteLine($"The number {number} is positive.");
            else
                Console.WriteLine($"The number {number} is negative.");
        }
    }
}