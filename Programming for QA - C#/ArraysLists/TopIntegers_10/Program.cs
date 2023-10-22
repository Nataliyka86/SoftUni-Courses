namespace TopIntegers_10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> list = Console.ReadLine().Split(" ").Select(int.Parse).ToList();

            List<int> newList = new List<int>();

            int maxNumber = list.Max(num => num);
            int index = list.IndexOf(maxNumber);
            newList.Add(maxNumber);
            index = index + 1;
            while (index < list.Count - 1)
            {
                maxNumber = list[index];
                bool isBigger = true;

                for (int i = index + 1; i < list.Count; i++)
                {
                    int currentNum = list[i];
                    if (currentNum >= maxNumber)
                    {
                        isBigger = false;
                        index++;
                        break;
                    }
                }
                if (isBigger)
                {
                    newList.Add(maxNumber);
                    index++;
                }
            }
            if (index == list.Count - 1)
            {
                newList.Add(list[list.Count - 1]);
            }
            Console.WriteLine(string.Join(" ", newList));
        }
    }
}