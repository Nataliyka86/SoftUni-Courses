namespace StupidPasswords_01
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            for (int i = 2; i <= n; i++)
            {
                string firstPart = "";
                if (i % 2 == 0)
                {
                    for (int j = 1; j <= n; j++)
                    {
                        if (j % 2 != 0)
                        {
                            int thirdPart = i * j;
                            Console.Write("{0}{1}{2} ", i, j, thirdPart);
                        }
                    }
                }
            }
        }
    }
}