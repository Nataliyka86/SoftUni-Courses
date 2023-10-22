namespace RemoveNegativesReverse_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> numberList = Console.ReadLine().Split(" ").Select(int.Parse).ToList();


            numberList.RemoveAll(number => number < 0);
            numberList.Reverse();
            if (numberList.Count == 0)
                Console.WriteLine("empty");
            else
                Console.WriteLine(string.Join(" ", numberList));
        }
    }
}