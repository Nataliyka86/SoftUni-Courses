namespace EvenOddSubtraction_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] intArr = Console.ReadLine().Split(" ").Select(int.Parse).ToArray();

            int sumEven = 0;
            int sumOdd = 0;

            foreach (int number in intArr)
            {
                if (number % 2 == 0)
                    sumEven += number;
                else
                    sumOdd += number;
            }
            Console.WriteLine(sumEven - sumOdd);
        }
    }
}