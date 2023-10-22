namespace CommonElements_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] firstArr = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();
            int[] secondArr = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();

            for (int i = 0; i < firstArr.Length; i++)
            {
                for (int j = 0; j < secondArr.Length; j++)
                {
                    if (firstArr[i] == secondArr[j])
                    {
                        Console.Write(firstArr[i] + " ");
                    }
                }
            }

        }
    }
}