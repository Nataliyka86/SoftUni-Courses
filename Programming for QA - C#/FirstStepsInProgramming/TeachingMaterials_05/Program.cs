namespace TeachingMaterials_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int pens = int.Parse(Console.ReadLine());
            int markers = int.Parse(Console.ReadLine());
            int liters = int.Parse(Console.ReadLine());
            int rate = int.Parse(Console.ReadLine());

            double totalSum = pens * 5.8 + markers * 7.20 + liters * 1.20;
            double totalSumWithRate = totalSum - totalSum * rate / 100;

            Console.WriteLine(totalSumWithRate);
        }
    }
}