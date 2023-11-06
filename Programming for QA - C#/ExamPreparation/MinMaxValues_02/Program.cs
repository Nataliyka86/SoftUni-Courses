namespace MinMaxValues_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] numsArray = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();
            int n = int.Parse(Console.ReadLine());

            int maxNumber = int.MinValue;
            int minNumber = int.MaxValue;

            for (int i = 0; i < n; i++)
            {
                if (numsArray[i] > maxNumber)
                {
                    maxNumber = numsArray[i];
                }
                if (numsArray[i] < minNumber)
                {
                    minNumber = numsArray[i];
                }
            }

            Console.WriteLine(maxNumber);
            Console.WriteLine(minNumber);
        }
    }
}