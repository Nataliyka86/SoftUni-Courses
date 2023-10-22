namespace EqualArrays_05
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] firstArr = Console.ReadLine().Split(" ");
            string[] secondArr = Console.ReadLine().Split(" ");

            bool isEqual = true;

            for (int i = 0; i < firstArr.Length; i++)
            {
                if (firstArr[i] != secondArr[i])
                {
                    isEqual = false;
                    break;
                }
            }
            if (!isEqual)
                Console.WriteLine("Arrays are not identical.");
            else
                Console.WriteLine("Arrays are identical.");
        }
    }
}