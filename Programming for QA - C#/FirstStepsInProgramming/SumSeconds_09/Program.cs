namespace SumSeconds_09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int athleteTime1 = int.Parse(Console.ReadLine());
            int athleteTime2 = int.Parse(Console.ReadLine());
            int athleteTime3 = int.Parse(Console.ReadLine());

            int totalTimeInSeconds = athleteTime1 + athleteTime2 + athleteTime3;

            int hours = totalTimeInSeconds / 60;
            int minutes = totalTimeInSeconds % 60;

            Console.WriteLine($"{hours}:{minutes:D2}");
        }
    }
}