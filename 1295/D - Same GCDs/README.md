<h2><a href="https://codeforces.com/contest/1295/problem/D" target="_blank" rel="noopener noreferrer">1295D — Same GCDs</a></h2>

| | |
|---|---|
| **Difficulty** | 1800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1295D](https://codeforces.com/contest/1295/problem/D) |

## Topics
`math` `number theory`

---

## Problem Statement

<div class="header"><div class="title">D. Same GCDs</div><div class="time-limit"><div class="property-title">time limit per test</div>2 seconds</div><div class="memory-limit"><div class="property-title">memory limit per test</div>256 megabytes</div><div class="input-file input-standard"><div class="property-title">input</div>standard input</div><div class="output-file output-standard"><div class="property-title">output</div>standard output</div></div><div><p>You are given two integers $$$a$$$ and $$$m$$$. Calculate the number of integers $$$x$$$ such that $$$0 \le x  \lt  m$$$ and $$$\gcd(a, m) = \gcd(a + x, m)$$$.</p><p>Note: $$$\gcd(a, b)$$$ is the greatest common divisor of $$$a$$$ and $$$b$$$.</p></div><div class="input-specification"><div class="section-title">Input</div><p>The first line contains the single integer $$$T$$$ ($$$1 \le T \le 50$$$) — the number of test cases.</p><p>Next $$$T$$$ lines contain test cases — one per line. Each line contains two integers $$$a$$$ and $$$m$$$ ($$$1 \le a  \lt  m \le 10^{10}$$$).</p></div><div class="output-specification"><div class="section-title">Output</div><p>Print $$$T$$$ integers — one per test case. For each test case print the number of appropriate $$$x$$$-s.</p></div><div class="sample-tests"><div class="section-title">Example</div><div class="sample-test"><div class="input"><div class="title">Input<div title="Copy" data-clipboard-target="#id0039449699216025125" id="id001658900543908417" class="input-output-copier">Copy</div></div><pre id="id0039449699216025125">3
4 9
5 10
42 9999999967
</pre></div><div class="output"><div class="title">Output<div title="Copy" data-clipboard-target="#id0014574379876757215" id="id00618335581808679" class="input-output-copier">Copy</div></div><pre id="id0014574379876757215">6
1
9999999966
</pre></div></div></div><div class="note"><div class="section-title">Note</div><p>In the first test case appropriate $$$x$$$-s are $$$[0, 1, 3, 4, 6, 7]$$$.</p><p>In the second test case the only appropriate $$$x$$$ is $$$0$$$.</p></div>