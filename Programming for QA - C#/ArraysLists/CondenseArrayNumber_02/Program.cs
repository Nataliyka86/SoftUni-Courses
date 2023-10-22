namespace CondenseArrayNumber_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> list = Console.ReadLine().Split(" ").Select(int.Parse).ToList();

            while (list.Count > 1)
            {
                List<int> newList = new List<int>();
                for (int i = 0; i < list.Count - 1; i++)
                {
                    int currentSum = list[i] + list[i + 1];
                    newList.Add(currentSum);
                }
                list = newList;
            }
            Console.WriteLine(list[0]);
        }
    }
}