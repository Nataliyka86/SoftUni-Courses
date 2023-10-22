namespace SumAdjacentEqualNumbers_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> list = Console.ReadLine().Split(" ").Select(int.Parse).ToList();

            for (int i = 0; i < list.Count - 1; i++)
            {
                if (list[i] == list[i + 1])
                {
                    int currentSum = list[i] + list[i + 1];
                    list.RemoveAt(i + 1);
                    list.RemoveAt(i);
                    list.Insert(i, currentSum);
                    i = -1;
                    continue;
                }

            }
            Console.WriteLine(string.Join(" ", list));
        }
    }
}