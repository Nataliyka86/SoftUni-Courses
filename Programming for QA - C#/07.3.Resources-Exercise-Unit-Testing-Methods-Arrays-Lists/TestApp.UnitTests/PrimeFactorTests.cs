using NUnit.Framework;
using NUnit.Framework.Internal;
using System;

namespace TestApp.UnitTests;

public class PrimeFactorTests
{
    [Test]
    public void Test_FindLargestPrimeFactor_NumberLowerThanTwo()
    {
        long input = 1;
       
        Assert.Throws<ArgumentException>(() => { PrimeFactor.FindLargestPrimeFactor(input); });
    }

    [Test]
    public void Test_FindLargestPrimeFactor_PrimeNumber()
    {
        long input = 17;
        long output = PrimeFactor.FindLargestPrimeFactor(input);
        Assert.AreEqual(input, output);
    }

    [Test]
    public void Test_FindLargestPrimeFactor_LargeNumber()
    {
        long input = 123456789123456789;
        long output = PrimeFactor.FindLargestPrimeFactor(input);
        Assert.AreEqual(52579, output);
    }
}
