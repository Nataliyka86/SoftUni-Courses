using NUnit.Framework;
using System;

namespace TestApp.Tests;

public class CharacterRangeTests
{
    [Test]
    public void Test_GetRange_WithAAndBInOrder_ReturnsEmptyString()
    {
        char firstChar = 'A';
        char secondChar = 'B';
        string output = CharacterRange.GetRange(firstChar, secondChar);
        string expected = "";
        Assert.AreEqual(expected, output);
    }

    [Test]
    public void Test_GetRange_WithBAndAInOrder_ReturnsEmptyString()
    {
        char firstChar = 'B';
        char secondChar = 'A';
        string output = CharacterRange.GetRange(firstChar, secondChar);
        string expected = "";
        Assert.AreEqual(expected, output);
    }

    [Test]
    public void Test_GetRange_WithAAndCInOrder_ReturnsB()
    {
        char firstChar = 'A';
        char secondChar = 'C';
        string output = CharacterRange.GetRange(firstChar, secondChar);
        string expected = "B";
        Assert.AreEqual(expected, output);
    }

    [Test]
    public void Test_GetRange_WithDAndGInOrder_Returns_E_F()
    {
        char firstChar = 'D';
        char secondChar = 'G';
        string output = CharacterRange.GetRange(firstChar, secondChar);
        string expected = "E F";
        Assert.AreEqual(expected, output);
    }

    [Test]
    public void Test_GetRange_WithXAndZInOrder_Returns_Y()
    {
        char firstChar = 'X';
        char secondChar = 'Z';
        string output = CharacterRange.GetRange(firstChar, secondChar);
        string expected = "Y";
        Assert.AreEqual(expected, output);
    }
}
