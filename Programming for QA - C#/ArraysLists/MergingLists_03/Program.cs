namespace MergingLists_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] firstArr = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();
            int[] secondArr = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();

            List<int> list = new List<int>();

            if (firstArr.Length > secondArr.Length)
            {
                for (int i = 0; i < secondArr.Length; i++)
                {
                    list.Add(firstArr[i]);
                    list.Add(secondArr[i]);
                }
                for (int i = secondArr.Length; i < firstArr.Length; i++)
                {
                    list.Add(firstArr[i]);
                }

            }
            else
            {
                for (int i = 0; i < firstArr.Length; i++)
                {
                    list.Add(firstArr[i]);
                    list.Add(secondArr[i]);
                }
                for (int i = firstArr.Length; i < secondArr.Length; i++)
                {
                    list.Add(secondArr[i]);
                }
            }
            Console.WriteLine(string.Join(" ", list));
        }
    }
}