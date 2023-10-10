namespace Division234_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            double divisible2 = 0;
            double divisible3 = 0;
            double divisible4 = 0;

            for (int i = 0; i < n; i++)
            {
                int number = int.Parse(Console.ReadLine());
                if (number % 2 == 0)
                    divisible2++;
                if (number % 3 == 0)
                    divisible3++;
                if (number % 4 == 0)
                    divisible4++;
            }
            Console.WriteLine("{0:F2}%", divisible2 / n * 100);
            Console.WriteLine("{0:F2}%", divisible3 / n * 100);
            Console.WriteLine("{0:F2}%", divisible4 / n * 100);

        }
    }
}