using NUnit.Framework;
using System;

namespace TestApp.Tests;

public class LongestIncreasingSubsequenceTests
{
    [Test]
    public void Test_GetLis_NullArray_ThrowsArgumentNullException()
    {
        int[] inputArray = null;       
        Assert.Throws<ArgumentNullException>(() => { LongestIncreasingSubsequence.GetLis(inputArray); });
    }

    [Test]
    public void Test_GetLis_EmptyArray_ReturnsEmptyString()
    {
        int[] inputArray = Array.Empty<int>();
        string output = LongestIncreasingSubsequence.GetLis(inputArray);
        CollectionAssert.AreEqual("", output);
    }

    [Test]
    public void Test_GetLis_SingleElementArray_ReturnsElement()
    {
        int[] inputArray = new int[] { 2 };
        string output = LongestIncreasingSubsequence.GetLis(inputArray);
        CollectionAssert.AreEqual("2", output);
    }

    [Test]
    public void Test_GetLis_UnsortedArray_ReturnsLongestIncreasingSubsequence()
    {
        int[] inputArray = new int[] {0, 2, 1, 5, 3, 4, 8, 6 };
        string output = LongestIncreasingSubsequence.GetLis(inputArray);
        CollectionAssert.AreEqual("0 2 3 4 8", output);
    }

    [Test]
    public void Test_GetLis_SortedArray_ReturnsItself()
    {
        int[] inputArray = new int[] { 2, 3, 5, 7, 9, 11 };
        string output = LongestIncreasingSubsequence.GetLis(inputArray);
        CollectionAssert.AreEqual("2 3 5 7 9 11", output);
    }
}
