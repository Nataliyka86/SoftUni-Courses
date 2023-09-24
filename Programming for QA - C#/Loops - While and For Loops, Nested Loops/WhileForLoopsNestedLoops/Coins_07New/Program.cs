namespace Coins_07New
{
    internal class Program
    {
        static void Main(string[] args)
        {

            double amount = double.Parse(Console.ReadLine());
            int numberOfCoins = 0;

            int stotinki = Convert.ToInt32(amount * 100);

            int currentStotinkiCoins = 200;

            while (currentStotinkiCoins != 0)
            {
                numberOfCoins += stotinki / currentStotinkiCoins;
                stotinki = stotinki % currentStotinkiCoins;

                switch (currentStotinkiCoins)
                {
                    case 200: currentStotinkiCoins = 100; break;
                    case 100: currentStotinkiCoins = 50; break;
                    case 50: currentStotinkiCoins = 20; break;
                    case 20: currentStotinkiCoins = 10; break;
                    case 10: currentStotinkiCoins = 5; break;
                    case 5: currentStotinkiCoins = 2; break;
                    case 2: currentStotinkiCoins = 1; break;
                    case 1: currentStotinkiCoins = 0; break;
                }
            }

            Console.WriteLine(numberOfCoins);
        }
    }
}