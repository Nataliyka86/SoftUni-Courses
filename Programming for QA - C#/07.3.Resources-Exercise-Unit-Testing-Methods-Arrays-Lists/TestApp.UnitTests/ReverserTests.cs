using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class ReverserTests
{
    [Test]
    public void Test_ReverseStrings_WithEmptyArray_ReturnsEmptyArray()
    {
        // Arrange
        string[] inputArray = Array.Empty<string>();

        // Act
        string[] result = Reverser.ReverseStrings(inputArray);

        // Assert
        Assert.That(result, Is.Empty);
    }

        [Test]
    public void Test_ReverseStrings_WithSingleString_ReturnsReversedString()
    {
        // Arrange
        string[] inputArray = new string[] { "array" };

        // Act
        string[] outputArray = Reverser.ReverseStrings(inputArray);
        string[] result = new string[] { "yarra" };

        // Assert
        CollectionAssert.AreEqual(result, outputArray);
        //Assert.That(result, Is.EqualTo(new[] { "olleH" }));
    }

    [Test]
    public void Test_ReverseStrings_WithMultipleStrings_ReturnsReversedStrings()
    {
        // Arrange
        string[] inputArray = new string[] { "array", "Hello", "mama" };

        // Act
        string[] outputArray = Reverser.ReverseStrings(inputArray);
        string[] result = new string[] { "yarra", "olleH", "amam" };

        // Assert
        CollectionAssert.AreEqual(result, outputArray);
    }

    [Test]
    public void Test_ReverseStrings_WithSpecialCharacters_ReturnsReversedSpecialCharacters()
    {
        // Arrange
        string[] inputArray = new string[] { "!*/", "Hello", "<>?%$" };

        // Act
        string[] outputArray = Reverser.ReverseStrings(inputArray);
        string[] result = new string[] { "/*!", "olleH", "$%?><" };

        // Assert
        CollectionAssert.AreEqual(result, outputArray);
    }
}
