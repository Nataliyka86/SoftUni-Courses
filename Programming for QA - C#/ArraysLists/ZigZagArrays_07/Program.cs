namespace ZigZagArrays_07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<int> firstList = new List<int>();
            List<int> secondList = new List<int>();

            int number = int.Parse(Console.ReadLine());

            for (int i = 1; i <= number; i++)
            {
                int[] numberArr = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();
                int firstNumber = numberArr[0];
                int secondNumber = numberArr[1];
                if (i % 2 != 0)
                {
                    firstList.Add(firstNumber);
                    secondList.Add(secondNumber);
                }
                else
                {
                    secondList.Add(firstNumber);
                    firstList.Add(secondNumber);
                }
            }
            Console.WriteLine(string.Join(" ", firstList));
            Console.WriteLine(string.Join(" ", secondList));
        }
    }
}