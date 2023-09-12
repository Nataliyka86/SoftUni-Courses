namespace RADToDEG_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double radian = double.Parse(Console.ReadLine());
            double gradius = radian * 180 / Math.PI;
            Console.WriteLine(gradius);
        }
    }
}