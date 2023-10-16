namespace MagicNumbers_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            string magicNumber = "";
            for (int i = 1; i <= 9; i++)
            {
                for (int j = 1; j <= 9; j++)
                {
                    for (int k = 1; k <= 9; k++)
                    {
                        if (i * j * k == n)
                            Console.Write("{0}{1}{2} ", i, j, k);
                    }
                }
            }
        }
    }
}