<h2><a href="https://codeforces.com/contest/1335/problem/D" target="_blank" rel="noopener noreferrer">1335D — Anti-Sudoku</a></h2>

| | |
|---|---|
| **Difficulty** | 1300 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1335D](https://codeforces.com/contest/1335/problem/D) |

## Topics
`constructive algorithms` `implementation`

---

## Problem Statement

<div class="header"><div class="title">D. Anti-Sudoku</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given a correct solution to a Sudoku puzzle. If you don't know what Sudoku is, you can read about it <a href="https://en.wikipedia.org/wiki/Sudoku">here</a>.</p><p>The picture below shows a correct Sudoku solution:</p><center> <img class="tex-graphics" src="https://espresso.codeforces.com/180e382911c06a01823bba03d791ba96a209eed9.png" style="max-width: 100.0%;max-height: 100.0%;"> <span class="tex-font-size-tiny">Blocks are bordered in bold black.</span> </center><p>Your task is to change <span class="tex-font-style-bf">at most</span> $$$9$$$ elements of this field (i. e., choose some $$$1 \le i, j \le 9$$$ and change the number at the position $$$(i, j)$$$ to any other number in the range $$$[1; 9]$$$) to make it <span class="tex-font-style-bf">anti-sudoku</span>. The <span class="tex-font-style-bf">anti-sudoku</span> is the $$$9 \times 9$$$ field, in which:</p><ul> <li> Any number in this field is in the range $$$[1; 9]$$$; </li><li> Each row contains at least two equal elements; </li><li> Each column contains at least two equal elements; </li><li> Each $$$3 \times 3$$$ block (you can read what a block is following the link above) contains at least two equal elements. </li></ul><p>It is guaranteed that a solution exists.</p><p>You have to answer $$$t$$$ independent test cases.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line of the input contains one integer $$$t$$$ ($$$1 \le t \le 10^4$$$) — the number of test cases. Then $$$t$$$ test cases follow.</p><p>Each test case consists of $$$9$$$ lines; each line consists of $$$9$$$ characters from $$$1$$$ to $$$9$$$ without any whitespaces — the correct solution of the Sudoku puzzle.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print the answer — the initial field with <span class="tex-font-style-bf">at most</span> $$$9$$$ changed elements so that the obtained field is <span class="tex-font-style-bf">anti-sudoku</span>. If there are several solutions, you can print any. It is guaranteed that the answer exists.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0020999342253187903" id="id009025375925891925" class="input-output-copier">Copy</div></div><pre id="id0020999342253187903"><div class="test-example-line test-example-line-even test-example-line-0">1</div><div class="test-example-line test-example-line-odd test-example-line-1">154873296</div><div class="test-example-line test-example-line-odd test-example-line-1">386592714</div><div class="test-example-line test-example-line-odd test-example-line-1">729641835</div><div class="test-example-line test-example-line-odd test-example-line-1">863725149</div><div class="test-example-line test-example-line-odd test-example-line-1">975314628</div><div class="test-example-line test-example-line-odd test-example-line-1">412968357</div><div class="test-example-line test-example-line-odd test-example-line-1">631457982</div><div class="test-example-line test-example-line-odd test-example-line-1">598236471</div><div class="test-example-line test-example-line-odd test-example-line-1">247189563</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0018112336088465453" id="id0008195016527477894" class="input-output-copier">Copy</div></div><pre id="id0018112336088465453">154873396
336592714
729645835
863725145
979314628
412958357
631457992
998236471
247789563
</pre></div></div></div>