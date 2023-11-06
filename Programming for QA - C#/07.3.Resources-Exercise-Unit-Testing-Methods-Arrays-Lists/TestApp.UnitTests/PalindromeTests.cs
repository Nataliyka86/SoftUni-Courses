using NUnit.Framework;

using System.Collections.Generic;

namespace TestApp.UnitTests;

public class PalindromeTests
{

    [Test]
    public void Test_IsPalindrome_ValidPalindrome_ReturnsTrue()
    {
        // Arrange
        List<string> input = new List<string>() { "coc", "ajaaja", "loppppol" };

        // Act
        bool output = Palindrome.IsPalindrome(input);

        // Assert
        Assert.IsTrue(output);
    }


    [Test]
    public void Test_IsPalindrome_EmptyList_ReturnsTrue()
    {
        // Arrange
        List<string> input = new();

        // Act
        bool output = Palindrome.IsPalindrome(input);

        // Assert
        Assert.IsTrue(output);
    }

    [Test]
    public void Test_IsPalindrome_SingleWord_ReturnsTrue()
    {
        // Arrange
        List<string> input = new List<string>() { "coc" };

        // Act
        bool output = Palindrome.IsPalindrome(input);

        // Assert
        Assert.IsTrue(output);
    }

    [Test]
    public void Test_IsPalindrome_NonPalindrome_ReturnsFalse()
    {
        // Arrange
        List<string> input = new List<string>() { "coco", "cic" };

        // Act
        bool output = Palindrome.IsPalindrome(input);

        // Assert
        Assert.IsFalse(output);
    }

    [Test]
    public void Test_IsPalindrome_MixedCasePalindrome_ReturnsTrue()
    {
        // Arrange
        List<string> input = new List<string>() { "Coc", "aJaaja", "loppPPol" };

        // Act
        bool output = Palindrome.IsPalindrome(input);

        // Assert
        Assert.IsTrue(output);
    }
}
