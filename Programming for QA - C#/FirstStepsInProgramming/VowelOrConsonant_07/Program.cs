namespace VowelOrConsonant_07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string letter = Console.ReadLine();           

            switch (letter)
            {
                case "A":
                case "a":
                case "E":
                case "e":
                case "I":
                case "i":
                case "O":
                case "o":
                case "U":
                case "u":
                    Console.WriteLine("Vowel");
                    break;
                default:
                    Console.WriteLine("Consonant");
                    break;
            }
        }
    }
}