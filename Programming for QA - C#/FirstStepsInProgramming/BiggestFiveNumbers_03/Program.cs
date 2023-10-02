namespace BiggestFiveNumbers_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n1 = int.Parse(Console.ReadLine());
            int n2 = int.Parse(Console.ReadLine());
            int n3 = int.Parse(Console.ReadLine());
            int n4 = int.Parse(Console.ReadLine());
            int n5 = int.Parse(Console.ReadLine());

            int maxNumber = n1;
            if (n2 > maxNumber)
                maxNumber = n2;
            if (n3 > maxNumber)
                maxNumber = n3;
            if (n4 > maxNumber)
                maxNumber = n4;
            if (n5 > maxNumber)
                maxNumber = n5;
            Console.WriteLine(maxNumber);
        }
    }
}