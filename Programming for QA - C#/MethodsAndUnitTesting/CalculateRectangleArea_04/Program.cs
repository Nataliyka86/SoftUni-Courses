namespace CalculateRectangleArea_04
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int width = int.Parse(Console.ReadLine());
            int length = int.Parse(Console.ReadLine());
            Console.WriteLine(CalculateArea(width, length));

        }

        public static int CalculateArea(int width, int length)
        {
            return width * length;
        }
    }
}