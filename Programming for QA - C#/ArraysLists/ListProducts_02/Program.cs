namespace ListProducts_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<string> products = new List<string>();

            for (int i = 1; i <= n; i++)
            {
                string input = Console.ReadLine();
                products.Add(input);
            }
            products.Sort();
            for (int i = 0; i < products.Count; i++)
            {
                Console.WriteLine("{0}.{1}", i + 1, products[i]);
            }
        }
    }
}