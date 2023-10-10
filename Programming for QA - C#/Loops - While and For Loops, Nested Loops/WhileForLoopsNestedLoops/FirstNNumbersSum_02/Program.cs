namespace FirstNNumbersSum_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int sum = 0;

            for (int i = 1; i < n; i++)
            {
                Console.Write(i + "+");
                sum += i;
            }
            sum += n;
            Console.WriteLine($"{n}={sum}");
        }
    }
}