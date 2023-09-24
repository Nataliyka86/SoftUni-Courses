namespace Sequence2k1_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int newNumber = 1;

            while (newNumber <= n)
            {
                Console.WriteLine(newNumber);
                newNumber = 2 * newNumber + 1;
            }
        }
    }
}