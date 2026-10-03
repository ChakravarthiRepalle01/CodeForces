<h2><a href="https://codeforces.com/contest/1921/problem/A" target="_blank" rel="noopener noreferrer">1921A — Square</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1921A](https://codeforces.com/contest/1921/problem/A) |

## Topics
`greedy` `math`

---

## Problem Statement

<div class="header"><div class="title">A. Square</div><div class="time-limit"><div class="property-title">time limit per test</div>1 second</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>A square of positive (strictly greater than $$$0$$$) area is located on the coordinate plane, with sides parallel to the coordinate axes. You are given the coordinates of its corners, in random order. Your task is to find the area of the square.</p></div><div class="input-specification"><div class="section-title">Input</div><p>Each test consists of several testcases. The first line contains one integer $$$t$$$ ($$$1 \le t \le 100$$$) — the number of testcases. The following is a description of the testcases.</p><p>Each testcase contains four lines, each line contains two integers $$$x_i, y_i$$$ ($$$-1000\le x_i, y_i\le 1000$$$), coordinates of the corners of the square. </p><p>It is guaranteed that there is a square with sides parallel to the coordinate axes, with positive (strictly greater than $$$0$$$) area, with corners in given points.</p></div><div class="output-specification"><div class="section-title">Output</div><p>For each test case, print a single integer, the area of the square.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id008973463834310192" id="id005999825933859047" class="input-output-copier">Copy</div></div><pre id="id008973463834310192"><div class="test-example-line test-example-line-even test-example-line-0">3</div><div class="test-example-line test-example-line-odd test-example-line-1">1 2</div><div class="test-example-line test-example-line-odd test-example-line-1">4 5</div><div class="test-example-line test-example-line-odd test-example-line-1">1 5</div><div class="test-example-line test-example-line-odd test-example-line-1">4 2</div><div class="test-example-line test-example-line-even test-example-line-2">-1 1</div><div class="test-example-line test-example-line-even test-example-line-2">1 -1</div><div class="test-example-line test-example-line-even test-example-line-2">1 1</div><div class="test-example-line test-example-line-even test-example-line-2">-1 -1</div><div class="test-example-line test-example-line-odd test-example-line-3">45 11</div><div class="test-example-line test-example-line-odd test-example-line-3">45 39</div><div class="test-example-line test-example-line-odd test-example-line-3">17 11</div><div class="test-example-line test-example-line-odd test-example-line-3">17 39</div></pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id005270750180961432" id="id0020979826589500628" class="input-output-copier">Copy</div></div><pre id="id005270750180961432">9
4
784
</pre></div></div></div>