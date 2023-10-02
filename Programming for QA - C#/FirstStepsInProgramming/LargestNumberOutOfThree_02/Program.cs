namespace LargestNumberOutOfThree_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int num1 = int.Parse(Console.ReadLine());
            int num2 = int.Parse(Console.ReadLine());
            int num3 = int.Parse(Console.ReadLine());

            int maxNumber = int.MinValue;

            maxNumber = Math.Max(num1, num2);
            if (num3 > maxNumber)
                maxNumber = num3;
            Console.WriteLine(maxNumber);
        }
    }
}