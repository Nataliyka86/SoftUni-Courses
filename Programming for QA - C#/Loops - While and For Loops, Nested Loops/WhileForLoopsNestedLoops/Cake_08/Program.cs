namespace Cake_08
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int width = int.Parse(Console.ReadLine());
            int length = int.Parse(Console.ReadLine());
            string input = Console.ReadLine();

            int numberPiecesCake = width * length;

            while (input != "STOP")
            {
                int numberPiecesForGuests = int.Parse(input);
                numberPiecesCake -= numberPiecesForGuests;
                if (numberPiecesCake < 0)
                {
                    break;
                }
                input = Console.ReadLine();
            }
            if (input == "STOP" && numberPiecesCake > 0)
            {
                Console.WriteLine("{0} pieces are left.", numberPiecesCake);
            }
            else
            {
                Console.WriteLine("No more cake left! You need {0} pieces more.", Math.Abs(numberPiecesCake));
            }
        }
    }
}