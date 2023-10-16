namespace GreaterTwoValues_07
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string type = Console.ReadLine();
            string first = Console.ReadLine();
            string second = Console.ReadLine();

            switch (type)
            {
                case "int":
                    int firstNumber = int.Parse(first);
                    int secondNumber = int.Parse(second);
                    int max = CompareInt(firstNumber, secondNumber);
                    Console.WriteLine(max);
                    break;
                case "char":
                    char firstChar = first[0];
                    char secondChar = second[0];
                    Console.WriteLine(CompareChar(firstChar, secondChar));
                    break;
                case "string":
                    Console.WriteLine(CompareString(first, second));
                    break;
            }
        }
        public static int CompareInt(int first, int second)
        {
            return Math.Max(first, second);
        }

        public static char CompareChar(char first, char second)
        {
            if (first > second)
                return first;
            else
                return second;
        }

        public static string CompareString(string first, string second)
        {

            int comparisonResult = string.Compare(first, second);

            if (comparisonResult < 0)
            {
                return second;
            }
            else
            {
                return first;
            }
        }
    }

}