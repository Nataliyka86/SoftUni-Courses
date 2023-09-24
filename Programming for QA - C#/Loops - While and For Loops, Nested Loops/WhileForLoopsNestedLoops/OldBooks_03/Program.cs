namespace OldBooks_03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string book = Console.ReadLine();
            string currentBook = Console.ReadLine();
            int count = 0;
            bool isFound = false;

            while (currentBook != "No More Books")
            {
                if (book == currentBook)
                {
                    Console.WriteLine($"You checked {count} books and found it.");
                    isFound = true;
                    break;
                }
                count++;
                currentBook = Console.ReadLine();
            }
            if (isFound == false)
            {
                Console.WriteLine("The book you search is not here!");
                Console.WriteLine($"You checked {count} books.");
            }
        }
    }
}