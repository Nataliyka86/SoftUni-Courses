namespace Redecorating_06
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int nylon = int.Parse(Console.ReadLine());
            int paint = int.Parse(Console.ReadLine());
            int thinner = int.Parse(Console.ReadLine());
            int hours = int.Parse(Console.ReadLine());

            double nylonSum = (nylon + 2) * 1.50;
            double paintSum = (paint + paint * 0.10) * 14.50;
            double thinnerSum = thinner * 5.00;

            double totalSumMaterials = nylonSum + paintSum + thinnerSum + 0.40;
            double sumForWorkers = hours * totalSumMaterials * 0.30;
            double totalSum = totalSumMaterials + sumForWorkers;

            Console.WriteLine(totalSum);
        }
    }
}