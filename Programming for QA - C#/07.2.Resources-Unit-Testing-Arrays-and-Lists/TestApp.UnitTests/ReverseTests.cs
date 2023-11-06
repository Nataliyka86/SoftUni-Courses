using NUnit.Framework;

using System;

namespace TestApp.UnitTests;

public class ReverseTests
{
    [Test]
    public void Test_ReverseArray_InputIsEmpty_ShouldReturnEmptyString()
    {
        // Arrange
        int[] emptyArray = Array.Empty<int>();

        // Act
        string result = Reverse.ReverseArray(emptyArray);

        // Assert
        Assert.That(result, Is.EqualTo(string.Empty));
    }

  
    [Test]
    public void Test_ReverseArray_InputHasOneElement_ShouldReturnTheSameElement()
    {
        // Arrange
        int[] oneElementArray = new int[] { 1};

        // Act
        string result = Reverse.ReverseArray(oneElementArray);

        // Assert
        Assert.AreEqual("1", result);
        
    }

    [Test]
    public void Test_ReverseArray_InputHasMultipleElements_ShouldReturnReversedString()
    {
        int[] multipleElementsArray = new int[] { 1, 2, 3 };
        string result = Reverse.ReverseArray(multipleElementsArray);
        Assert.AreEqual("3 2 1", result);
       
    }
}
