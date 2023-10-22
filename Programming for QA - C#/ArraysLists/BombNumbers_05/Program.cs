namespace BombNumbers_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> list = Console.ReadLine().Split(" ").Select(int.Parse).ToList();
            int[] commandArr = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();

            int bomb = commandArr[0];
            int power = commandArr[1];

            while (list.Contains(bomb))
            {
                int index = list.IndexOf(bomb);
                int startIndex = index - power;
                int endIndex = index + power;
                if (startIndex < 0)
                    startIndex = 0;
                if (endIndex > list.Count - 1)
                    endIndex = list.Count - 1;
                for (int i = startIndex; i <= endIndex; i++)
                {
                    list.RemoveAt(startIndex);
                }
            }
            int sum = 0;
            for (int i = 0; i < list.Count; i++)
            {
                sum += list[i];
            }
            Console.WriteLine(sum);
        }
    }
}