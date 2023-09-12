namespace BasketballEquipment_08
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int annualTax = int.Parse(Console.ReadLine());

            double sneakers = annualTax - annualTax * 0.40;
            double equipment = sneakers - sneakers * 0.20;
            double ball = equipment / 4;
            double accessaries = ball / 5;

            double totalSum = annualTax + sneakers + equipment + ball + accessaries;

            Console.WriteLine(totalSum);
        }
    }
}