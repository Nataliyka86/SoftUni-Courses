namespace VowelsCount_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();
            string textToLowerCase = text.ToLower();
            PrintCountVowels(textToLowerCase);

        }

        public static void PrintCountVowels(string text)
        {
            int count = 0;
            for (int i = 0; i < text.Length; i++)
            {
                char currentSymbol = text[i];
                if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'o' || currentSymbol == 'u' || currentSymbol == 'i')
                    count++;
            }
            Console.WriteLine(count);
        }
    }
}