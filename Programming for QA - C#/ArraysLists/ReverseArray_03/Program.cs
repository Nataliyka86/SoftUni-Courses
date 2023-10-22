namespace ReverseArray_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int[] intArr = new int[n];

            for (int i = 0; i < n; i++)
            {
                intArr[intArr.Length - 1 - i] = int.Parse(Console.ReadLine());
            }

            Console.WriteLine(string.Join(" ", intArr));

        }
    }
}