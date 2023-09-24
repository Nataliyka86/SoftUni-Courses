namespace SumOfNumbers_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());

            int sum = 0;

            while (sum < number)
            {
                int newNumber = int.Parse(Console.ReadLine());
                sum += newNumber;
            }
            Console.WriteLine(sum);
        }
    }
}