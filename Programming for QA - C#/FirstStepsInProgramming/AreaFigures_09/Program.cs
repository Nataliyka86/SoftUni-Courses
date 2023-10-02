using System.Drawing;

namespace AreaFigures_09
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //square, rectangle and circle
            string figure = Console.ReadLine();
            double area = 0.00;

            if (figure == "square")
            {
                double size = double.Parse(Console.ReadLine());
                area = size * size;
                Console.WriteLine("{0:F2}", area);
            }
            else if (figure == "rectangle")
            {
                double a = double.Parse(Console.ReadLine());
                double b = double.Parse(Console.ReadLine());
                area = a * b;
                Console.WriteLine("{0:F2}", area);
            }
            else if (figure == "circle")
            {
                double size = double.Parse(Console.ReadLine());
                area = Math.PI * Math.Pow(size, 2);
                Console.WriteLine("{0:F2}", area);
            }
            else
            {
                Console.WriteLine("Invalid figure.");
            }
        }
    }
}