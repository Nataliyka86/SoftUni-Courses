using NUnit.Framework;
using System;
using System.Collections.Generic;

namespace TestApp.UnitTests;

public class MaxNumberTests
{
    [Test]
    public void Test_FindMax_InputIsNull_ShouldThrowArgumentException()
    {
        // Arrange
        List<int>? nullList = null;

        // Act & Assert
        Assert.Throws <ArgumentException> (() => { MaxNumber.FindMax(nullList); });
    }

    [Test]
    public void Test_FindMax_InputIsEmptyList_ShouldThrowArgumentException()
    {
        // Arrange
        List<int> emptyList = new();

        // Act & Assert
        Assert.Throws<ArgumentException> (() => { MaxNumber.FindMax(emptyList); });
    }

    [Test]
    public void Test_FindMax_InputHasOneElement_ShouldReturnTheElement()
    {
        List<int> oneElementList = new List<int>() { 1};
        int result = MaxNumber.FindMax(oneElementList);
        int expectedResilt = 1;
        Assert.AreEqual(expectedResilt, result);
    }

    [Test]
    public void Test_FindMax_InputHasPositiveIntegers_ShouldReturnMaximum()
    {
        List<int> positiveElementsList = new List<int>() { 1, 2, 3 };
        int result = MaxNumber.FindMax(positiveElementsList);
        int expectedResilt = 3;
        Assert.AreEqual(expectedResilt, result);
    }

    [Test]
    public void Test_FindMax_InputHasNegativeIntegers_ShouldReturnMaximum()
    {
        List<int> negativeElementsList = new List<int>() { -1, -2, -3 };
        int result = MaxNumber.FindMax(negativeElementsList);
        int expectedResilt = -1;
        Assert.AreEqual(expectedResilt, result);
    }

    [Test]
    public void Test_FindMax_InputHasMixedIntegers_ShouldReturnMaximum()
    {
        List<int> mixedElementsList = new List<int>() { -1, 2, -3 };
        int result = MaxNumber.FindMax(mixedElementsList);
        int expectedResilt = 2;
        Assert.AreEqual(expectedResilt, result);
    }

    [Test]
    public void Test_FindMax_InputHasDuplicateMaxValue_ShouldReturnMaximum()
    {
        List<int> duplicateMaxList = new List<int>() { -1, 2, 2, -3 };
        int result = MaxNumber.FindMax(duplicateMaxList);
        int expectedResilt = 2;
        Assert.AreEqual(expectedResilt, result);
    }
}
