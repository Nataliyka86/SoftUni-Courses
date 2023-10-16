namespace MathPower_06
{
    internal class Program
    {
        static void Main(string[] args)
        {

            int number = int.Parse(Console.ReadLine());
            int power = int.Parse(Console.ReadLine());
            double result = CalcPower(number, power);
            Console.WriteLine(result);

        }

        public static double CalcPower(int n, int p)
        {
            return Math.Pow(n, p);
        }
    }
}