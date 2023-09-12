namespace FoodDelivery_07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int chicken = int.Parse(Console.ReadLine());
            int fish = int.Parse(Console.ReadLine());
            int vegan = int.Parse(Console.ReadLine());


            double sum = chicken * 10.35 + fish * 12.40 + vegan * 8.15;
            double dessert = sum * 0.20;
            double totalSum = sum + dessert + 2.50;

            Console.WriteLine(totalSum);
        }
    }
}