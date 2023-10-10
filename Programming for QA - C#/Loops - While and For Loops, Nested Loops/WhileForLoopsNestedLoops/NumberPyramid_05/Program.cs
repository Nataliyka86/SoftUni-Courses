namespace NumberPyramid_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int currentNumber = 1;
            bool isBigger = false;

            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= i; j++)
                {
                    if (currentNumber > n)
                    {
                        isBigger = true;
                        break;
                    }
                    Console.Write(currentNumber + " ");
                    currentNumber++;
                }
                if (isBigger)
                {
                    break;
                }
                Console.WriteLine();
            }
        }
    }
}