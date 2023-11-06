using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class FakeTests
{
    
    [Test]
    public void Test_RemoveStringNumbers_NullInput_ThrowsException()
    {
        // Arrange
        char[]? input = null;

        // Act + Assert
        Assert.Throws<ArgumentException>(() => { Fake.RemoveStringNumbers(input); });
    }

    [Test]
    public void Test_RemoveStringNumbers_RemovesDigitsFromCharArray()
    {
        char[] input = new char[] { '0', '1', 'a', 'b' };
        char[] output = Fake.RemoveStringNumbers(input);
        char[] result = new char[] {'a', 'b' } ;
        CollectionAssert.AreEqual(output, result);
    }

    [Test]
    public void Test_RemoveStringNumbers_NoDigitsInInput_ReturnsSameArray()
    {
        char[] input = new char[] { 'd', 'c', 'a', 'b' };
        char[] output = Fake.RemoveStringNumbers(input);
        
        CollectionAssert.AreEqual(input, output);
    }

    [Test]
    public void Test_RemoveStringNumbers_EmptyArray_ReturnsEmptyArray()
    {
        char[] input = Array.Empty<char>();
        char[] output = Fake.RemoveStringNumbers(input);

        CollectionAssert.AreEqual(input, output);
    }

    [Test]
    public void Test_RemoveStringNumbers_RemovesOnlyDigitsFromCharArrayReurnEmptyArray()
    {
        char[] input = new char[] { '0', '1', '2', '3' };
        char[] output = Fake.RemoveStringNumbers(input);
        char[] result = Array.Empty<char>();
        CollectionAssert.AreEqual(output, result);
    }

}
