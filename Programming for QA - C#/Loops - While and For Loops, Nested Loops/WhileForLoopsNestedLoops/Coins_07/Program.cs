namespace Coins_07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double amount = double.Parse(Console.ReadLine());
            int numberOfCoins = 0;

            int sumInCoins = Convert.ToInt32(amount * 100);

            numberOfCoins += sumInCoins / 200;
            sumInCoins = sumInCoins % 200;
            numberOfCoins += sumInCoins / 100;
            sumInCoins = sumInCoins % 100;
            numberOfCoins += sumInCoins / 50;
            sumInCoins = sumInCoins % 50;
            numberOfCoins += sumInCoins / 20;
            sumInCoins = sumInCoins % 20;
            numberOfCoins += sumInCoins / 10;
            sumInCoins = sumInCoins % 10;
            numberOfCoins += sumInCoins / 5;
            sumInCoins = sumInCoins % 5;
            numberOfCoins += sumInCoins / 2;
            sumInCoins = sumInCoins % 2;
            numberOfCoins += sumInCoins / 1;
            sumInCoins = sumInCoins % 1;


            Console.WriteLine(numberOfCoins);
        }
    }
}