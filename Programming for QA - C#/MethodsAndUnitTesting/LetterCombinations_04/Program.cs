namespace LetterCombinations_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            char startChar = char.Parse(Console.ReadLine());
            char endChar = char.Parse(Console.ReadLine());
            char excludedChar = char.Parse(Console.ReadLine());

            int count = 0;
            for (int i = startChar; i <= endChar; i++)
            {
                for (int j = startChar; j <= endChar; j++)
                {
                    for (int k = startChar; k <= endChar; k++)
                    {
                        if (i != excludedChar && j != excludedChar && k != excludedChar)
                        {
                            count++;
                            Console.Write("{0}{1}{2} ", (char)i, (char)j, (char)k);
                        }
                    }
                }
            }
            Console.WriteLine();
            Console.WriteLine(count);
        }
    }
}