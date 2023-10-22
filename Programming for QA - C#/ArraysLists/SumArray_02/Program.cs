namespace SumArray_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] inputArr = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();

            int sum = 0;

            for (int i = 0; i < inputArr.Length; i++)
            {
                sum += inputArr[i];
            }
            Console.WriteLine(sum);
        }
    }
}