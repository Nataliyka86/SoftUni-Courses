namespace AverageLastElements_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] array = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();
            int number = int.Parse(Console.ReadLine());

            double sum = 0;

            for (int i = array.Length - 1; i >= array.Length - number; i--)
            {
                sum += array[i];
            }

            double averageSum = sum / number;
            Console.WriteLine($"{averageSum:F2}");

        }
    }
}