namespace GaussTrick_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> list = Console.ReadLine().Split(" ").Select(int.Parse).ToList();

            List<int> newList = new List<int>();
            if (list.Count % 2 == 0)
            {
                for (int i = 0; i < list.Count / 2; i++)
                {
                    int currentSum = list[i] + list[list.Count - 1 - i];
                    newList.Add(currentSum);
                }

            }
            else
            {
                for (int i = 0; i < list.Count / 2; i++)
                {
                    int currentSum = list[i] + list[list.Count - 1 - i];
                    newList.Add(currentSum);
                }
                newList.Add(list[list.Count / 2]);

            }
            Console.WriteLine(string.Join(" ", newList));
        }
    }
}