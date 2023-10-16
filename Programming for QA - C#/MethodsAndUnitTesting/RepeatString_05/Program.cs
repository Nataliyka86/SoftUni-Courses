using System.Text;

namespace RepeatString_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string text = Console.ReadLine();
            int n = int.Parse(Console.ReadLine());
            Console.WriteLine(RepeatText(text, n));
        }

        public static string RepeatText(string text, int n)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++)
            {
                sb.Append(text);
            }
            return sb.ToString();
        }
    }
}