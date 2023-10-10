namespace VowelSum_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int result = 0;

            for (int i = 0; i < n; i++)
            {
                char symbol = char.Parse(Console.ReadLine());
                switch (symbol)
                {
                    case 'a': result += 1; break;
                    case 'e': result += 2; break;
                    case 'i': result += 3; break;
                    case 'o': result += 4; break;
                    case 'u': result += 5; break;
                    default: break;
                }
            }
            Console.WriteLine(result);
        }
    }
}