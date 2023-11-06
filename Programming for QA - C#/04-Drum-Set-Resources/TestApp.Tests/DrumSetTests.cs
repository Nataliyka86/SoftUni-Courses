using NUnit.Framework;
using System;

using System.Collections.Generic;

namespace TestApp.Tests;

public class DrumSetTests
{
    [Test]
    public void Test_Drum_TerminateCommandNotGiven_ThrowsArgumentException()
    {
        decimal money = 100;        
        List<int> initialQuality = new List<int>() { 10,20,30};
        List<string> commands = new List<string>() {"1","2"};
        Assert.Throws<ArgumentException>(() => { DrumSet.Drum(money, initialQuality, commands); });

    }

    [Test]
    public void Test_Drum_StringGivenAsCommand_ThrowsArgumentException()
    {
        decimal money = 100;
        List<int> initialQuality = new List<int>() { 10, 20, 30 };
        List<string> commands = new List<string>() { "Common", "Let it be", "Hit it again, Gabsy!" };
        Assert.Throws<ArgumentException>(() => { DrumSet.Drum(money, initialQuality, commands); });
    }

    [Test]
    public void Test_Drum_ReturnsCorrectQualityAndAmount()
    {
        decimal money = 100;
        List<int> initialQuality = new List<int>() { 10, 20, 30 };
        List<string> commands = new List<string>() { "10", "1", "1", "Hit it again, Gabsy!" };
        string output = DrumSet.Drum(money,initialQuality, commands);
        Assert.AreEqual("8 8 18\nGabsy has 70.00lv.", output);
    }

    [Test]
    public void Test_Drum_BalanceZero_WithOneDrumLeftOver_ReturnsCorrectQualityAndAmount()
    {
        decimal money = 0;
        List<int> initialQuality = new List<int>() { 3,4,5};
        List<string> commands = new List<string>() { "2", "2", "Hit it again, Gabsy!" };
        string output = DrumSet.Drum(money, initialQuality, commands);
        Assert.AreEqual("1\nGabsy has 0.00lv.", output);
    }

    [Test]
    public void Test_Drum_NotEnoughBalance_RemovesAllDrums_ReturnsCorrectQualityAndAmount()
    {
        decimal money = 10;
        List<int> initialQuality = new List<int>() { 100, 101 };
        List<string> commands = new List<string>() { "100", "1", "1", "Hit it again, Gabsy!" };
        string output = DrumSet.Drum(money, initialQuality, commands);
        Assert.AreEqual("\nGabsy has 10.00lv.", output);
    }
}
