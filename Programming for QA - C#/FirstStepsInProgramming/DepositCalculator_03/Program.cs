namespace DepositCalculator_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double deposit = double.Parse(Console.ReadLine());
            int months = int.Parse(Console.ReadLine());
            double rate = double.Parse(Console.ReadLine());
            double annualInterest = deposit * rate / 100;
            double monthInterest = annualInterest / 12;
            double totalSum = deposit + monthInterest * months;
            Console.WriteLine(totalSum);
        }
    }
}