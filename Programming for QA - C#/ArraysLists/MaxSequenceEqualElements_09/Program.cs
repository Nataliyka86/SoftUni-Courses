namespace MaxSequenceEqualElements_09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] numArr = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();

            List<int> list = new List<int>();
            List<int> newList = new List<int>();

            for (int i = 0; i < numArr.Length - 1; i++)
            {
                if (numArr[i] == numArr[i + 1])
                {
                    if (newList.Count == 0)
                        newList.Add((numArr[i]));
                    newList.Add(numArr[i + 1]);
                }
                else
                {
                    if (list.Count < newList.Count)
                    {
                        list = newList;
                    }
                    newList = new List<int>();
                }

            }
            if (list.Count == 0 && newList.Count > 0)
            {
                list = newList;
            }
            Console.WriteLine(string.Join(" ", list));
        }
    }
}