using NUnit.Framework;

namespace TestApp.UnitTests;

public class StringReverseTests
{
    
    [Test]
    public void Test_Reverse_WhenGivenEmptyString_ReturnsEmptyString()
    {
        // Arrange
        string input = "";

        // Act
        string output = StringReverse.Reverse(input);

        // Assert
        Assert.AreEqual("", output);
    }

    [Test]
    public void Test_Reverse_WhenGivenSingleCharacterString_ReturnsSameCharacter()
    {
        string input = "a";

        // Act
        string output = StringReverse.Reverse(input);

        // Assert
        Assert.AreEqual("a", output);
        Assert.AreEqual(1, output.Length);
    }

    [Test]
    public void Test_Reverse_WhenGivenNormalString_ReturnsReversedString()
    {
        string input = "abc";

        // Act
        string output = StringReverse.Reverse(input);

        // Assert
        Assert.AreEqual("cba", output);
        Assert.AreEqual(input.Length, output.Length); ;
    }
}
