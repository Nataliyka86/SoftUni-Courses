using System;
using NUnit.Framework;

namespace TestApp.Tests;

public class PascalTriangleTests
{
    [TestCase(1, "1 \n")]
    [TestCase(2, "1 \n1 1 \n")]
    [TestCase(4, "1 \n1 1 \n1 2 1 \n1 3 3 1 \n")]
    [TestCase(0, "")]
    [TestCase(-1, "")]
    public void Test_PrintTriangle_ShouldReturnCorrectString(int n, string expected)
    {
        string output = PascalTriangle.PrintTriangle(n);
        Assert.AreEqual(expected, output);
    }
}
