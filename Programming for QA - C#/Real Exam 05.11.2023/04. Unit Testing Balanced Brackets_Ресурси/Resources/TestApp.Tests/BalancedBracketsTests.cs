using System;
using NUnit.Framework;

namespace TestApp.Tests;

public class BalancedBracketsTests
{
    [Test]
    public void Test_IsBalanced_EmptyInput_ShouldReturnTrue()
    {
        string[] input = Array.Empty<string>();
        bool output = BalancedBrackets.IsBalanced(input);        
        Assert.IsTrue(output);
    }

    [Test]
    public void Test_IsBalanced_BalancedBrackets_ShouldReturnTrue()
    {
        string[] input = { "(", ")", "(", ")" };
        bool output = BalancedBrackets.IsBalanced(input);
        Assert.IsTrue(output);
    }

    [Test]
    public void Test_IsBalanced_UnbalancedBrackets_ShouldReturnFalse()
    {
        string[] input = { "(", "(", "(", ")", ")" };
        bool output = BalancedBrackets.IsBalanced(input);
        Assert.IsFalse(output);
    }

    [Test]
    public void Test_IsBalanced_MoreClosingBrackets_ShouldReturnFalse()
    {
        string[] input = { "(", ")", "(", ")", ")" };
        bool output = BalancedBrackets.IsBalanced(input);
        Assert.IsFalse(output);
    }

    [Test]
    public void Test_IsBalanced_NoClosingBrackets_ShouldReturnFalse()
    {
        string[] input = { "(", "(", "(", "(" };
        bool output = BalancedBrackets.IsBalanced(input);
        Assert.IsFalse(output);
    }
}
