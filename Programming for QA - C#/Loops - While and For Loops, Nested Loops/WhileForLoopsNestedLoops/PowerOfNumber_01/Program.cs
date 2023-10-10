namespace PowerOfNumber_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double number = double.Parse(Console.ReadLine());
            int power = int.Parse(Console.ReadLine());

            double result = 1.00;

            for (int i = 0; i < power; i++)
            {
                result *= number;
            }
            Console.WriteLine(result);
        }
    }
}