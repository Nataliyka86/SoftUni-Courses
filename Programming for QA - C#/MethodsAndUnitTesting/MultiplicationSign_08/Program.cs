namespace MultiplicationSign_08
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n1 = int.Parse(Console.ReadLine());
            int n2 = int.Parse(Console.ReadLine());
            int n3 = int.Parse(Console.ReadLine());

            Console.WriteLine(ProductSign(n1, n2, n3));
        }

        public static string ProductSign(int n1, int n2, int n3)
        {
            if (n1 == 0 || n2 == 0 || n3 == 0)
                return "zero";
            else if (n1 < 0 && n2 < 0 && n3 < 0)
                return "negative";
            else if ((n1 < 0 && n2 > 0 && n3 > 0)
                || (n2 < 0 && n1 > 0 && n3 > 0)
                || (n3 < 0 && n1 > 0 && n2 > 0))
                return "negative";
            else
                return "positive";

        }
    }
}