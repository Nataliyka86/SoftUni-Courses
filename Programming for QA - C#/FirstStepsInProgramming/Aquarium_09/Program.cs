namespace Aquarium_09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int length = int.Parse(Console.ReadLine());
            int width = int.Parse(Console.ReadLine());
            int height = int.Parse(Console.ReadLine());
            double rate = double.Parse(Console.ReadLine());

            double volume = length * width * height;
            double volumeInLiters = volume / 1000;
            double totalVolume = volumeInLiters * (1 - rate / 100);


            Console.WriteLine(Math.Round(totalVolume));
        }
    }
}