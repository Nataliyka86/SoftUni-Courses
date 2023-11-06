namespace MiddleElements_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] intArray = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();

            int lenth = intArray.Length;
            int firstNumber = intArray[(lenth / 2) - 1];
            int secondNumber = intArray[lenth / 2];
            double averageValue = (firstNumber + secondNumber) / 2.00;
            Console.WriteLine($"{averageValue:F2}");
        }
    }
}