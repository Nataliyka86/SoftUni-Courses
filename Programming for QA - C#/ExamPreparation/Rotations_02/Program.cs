namespace Rotations_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> numList = Console.ReadLine().Split(" ").Select(int.Parse).ToList();
            int n = int.Parse(Console.ReadLine());

            for (int i = 0; i < n; i++)
            {
                int lastElement = numList[numList.Count - 1];
                numList.Insert(0, lastElement);
                numList.RemoveAt(numList.Count - 1);
            }
            Console.WriteLine(string.Join(", ", numList));
        }
    }
}