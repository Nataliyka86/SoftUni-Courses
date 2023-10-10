namespace LatinLetters_07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            char firstSymbol = char.Parse(Console.ReadLine());
            char secondSymbol = char.Parse(Console.ReadLine());

            for (int i = firstSymbol; i <= secondSymbol; i++)
            {
                char currentSymbol = (char)i;
                Console.Write(currentSymbol + " ");
            }
        }
    }
}