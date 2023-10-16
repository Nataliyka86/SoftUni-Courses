namespace PrintingTriangle_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            PrintFirstHalf(n);
            PrintSecondHalf(n);

        //    for (int i = 1; i <= n; i++)
        //    {
        //        PrintLine(1, i);
        //    }
        //    for (int i = n - 1; i >= 1; i--)
        //    {
        //        PrintLine(1, i);
        //    }

        //}
        //static void PrintLine(int start, int end)
        //{
        //    for (int i = start; i <= end; i++)
        //    {
        //        Console.Write(i + " ");
        //    }
        //    Console.WriteLine();
        //}

    }

    public static void PrintFirstHalf(int n)
        {
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    Console.Write($"{j} ");
                }
                Console.WriteLine();
            }
        }

        public static void PrintSecondHalf(int n)
        {
            for (int i = n - 1; i >= 1; i--)
            {
                for (int j = 1; j <= i; j++)
                {
                    Console.Write($"{j} ");
                }
                Console.WriteLine();
            }
        }

    }
}