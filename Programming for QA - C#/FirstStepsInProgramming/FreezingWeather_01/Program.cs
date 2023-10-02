namespace FreezingWeather_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double temp = double.Parse(Console.ReadLine());

            if (temp <= 0)
            {
                Console.WriteLine("Freezing weather!");
            }
        }
    }
}